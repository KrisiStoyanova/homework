package api;

import java.io.IOException;
import java.io.InputStream;
import helpers.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class Registration {


    private static String registrationUrl = "http://restapi.adequateshop.com/api/authaccount/registration";
    private static String responseCodeRegistration;
    private static String responseBodyRegistration;
    private static String accessToken;
    private static String registrationMessage;


    public static void main(String[] args) {
        String name = "Tester";
        String email = "stoyanovakrisi+0945@gmail.com";
        String password = "paasss";

        try {
            registration(name, email, password);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void registration(String name, String email, String password) throws IOException {
        // Build the post request
        String postBodyRegistration = "{\"name\":\"" + name + "\", " + "\"email\":\"" + email + "\", " + "\"password\":\"" + password + "\"}";
        HttpPost postRegistration = new HttpPost(registrationUrl);
        postRegistration.setEntity(new StringEntity(postBodyRegistration));
        postRegistration.setHeader("Content-type", "application/json");
        HttpClient httpClient1 = HttpClientBuilder.create().build();

        // Execute the post request
        HttpResponse response1 = httpClient1.execute(postRegistration);
        responseCodeRegistration = response1.getStatusLine().toString();
        // Fill in the response body
        HttpEntity entity1 = response1.getEntity();
        if (entity1 != null) {
            // A Simple JSON Response Read
            InputStream instream1 = entity1.getContent();
            responseBodyRegistration = new ResponseReader().convertStreamToString(instream1);
            instream1.close();
        }
        // Extract and set the access token
        if (responseCodeRegistration.contains("200") == true) {
            JsonParser json1 = new JsonParser();
            String registrationCode = json1.getResponseCode(responseBodyRegistration);
            registrationMessage = json1.getRegistrationMessage(responseBodyRegistration);
            if (registrationCode.equals("0")) {
                accessToken = json1.getAccessToken(responseBodyRegistration);
            }
        }
    }


    public static String getAccessToken() {
        return accessToken;
    }

    public static String getResponseCodeRegistration() {
        return responseCodeRegistration;
    }


    //public static String getResponseBodyRegistration() {
        //return responseBodyRegistration;
    //}

    public static String getRegistrationMessage() {
        return registrationMessage;
    }

    //private static void printAccessTokenRegistration() {
        //System.out.println(accessTokenRegistration);
    //}

}




