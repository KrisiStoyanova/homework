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


public class Login {

    private static String loginUrl = "http://restapi.adequateshop.com/api/authaccount/login";
    protected static String responseCode;
    protected static String responseBody;
    protected static String accessToken;
    private static String authMessage;
    private static String userID;


    public static void main(String[] args) {
        String email = "ropseleyde@gufum.com";
        String password = "paasss";

        try {
            login(email, password);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        printAccessToken();
        printUserID();
    }


    public static void login(String email, String password) throws IOException {
        // Build the post request
        String postBody = "{\"email\":\"" + email + "\", " + "\"password\":\"" + password + "\"}";
        HttpPost postLogin = new HttpPost(loginUrl);
        postLogin.setEntity(new StringEntity(postBody));
        postLogin.setHeader("Content-type", "application/json");
        HttpClient httpClient = HttpClientBuilder.create().build();
        // Execute the post request
        HttpResponse response = httpClient.execute(postLogin);
        responseCode = response.getStatusLine().toString();
        // Fill in the response body
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            // A Simple JSON Response Read
            InputStream instream = entity.getContent();
            responseBody = new ResponseReader().convertStreamToString(instream);
            instream.close();
        }
        // Extract and set the access token
        if (responseCode.contains("200") == true) {
            JsonParser json = new JsonParser();
            String authCode = json.getResponseCode(responseBody);
            authMessage = json.getAuthMessage(responseBody);
            if (authCode.equals("0")) {
                accessToken = json.getAccessToken(responseBody);
            }
        }


        // Extract and set the user ID
        if (responseCode.contains("200") == true) {
            JsonParser json = new JsonParser();
            String authCode = json.getResponseCode(responseBody);
            authMessage = json.getAuthMessage(responseBody);
            if (authCode.equals("0")) {
                userID = json.getUserID(responseBody);
            }
        }
    }

    public static String getAccessToken() {
        return accessToken;
    }


    public static String getResponseCode() {
        return responseCode;
    }

    public static String getResponseBody() {
        return responseCode;
    }

    public static String getLoginMessage() {
        return authMessage;
    }

    public static void printUserID() {
        System.out.println(userID);
    }


    public static void printAccessToken() {
        System.out.println(accessToken);
    }

}
