package com.java_parabank_demo.All_Requests.Post_Requests;
/*
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.IOException;
import java.io.InputStream;


public class Registration {

    //api

    private static String registrationUrl = "https://parabank.parasoft.com/parabank/register.htm";
    private static String responseCodeRegistration;
    private static String responseBodyRegistration;
    //private static String accessToken;
    private static String registrationMessage;


    public static void main(String[] args) {
        String firstName = "Kristina23";
        String lastName = "Test23";
        String address = "Test str.23";
        String city = "Sofia";
        String state = "Sofia";
        String zipCode = "1000";
        String phone = "1234567890";
        String ssn = "123-4567-80";
        String username = "kristina23";
        String password = "23test01234";
        String confirmPW = "23test01234";

        try {
        registration(firstName, lastName, address, city, state, zipCode, phone, ssn, username, password, confirmPW);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void registration(String firstName, String lastName, String address,String city, String state, String zipCode, String phone,String ssn, String username, String password, String confirmPW) throws IOException {
        // Build the post request
        String postBodyRegistration = "{\"firstName\":\"" + firstName + "\", " + "\"lastName\":\"" + lastName + "\", " + "\"address\":\"" + address + "\", " + "\"city\":\"" + city + "\"," + "\"state\":\"" + state + "\", " + "\"zipCode\":\"" + zipCode + "\", " + "\"phone\":\"" + phone + "\", " + "\"ssn\":\"" + ssn + "\"," + "\"username\":\"" + username + "\"," + "\"password\":\"" + password + "\"," + "\"confirmPW\":\"" + confirmPW + "\"}";
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
            responseBodyRegistration = new api.ResponseReader().convertStreamToString(instream1);
            instream1.close();
        }
        // Extract and set the access token
        if (responseCodeRegistration.contains("200") == true) {
            Gson gson1 = new Gson();
            String registrationCode = gson1.toJson(responseBodyRegistration);
            registrationMessage = gson1.toJson(responseBodyRegistration);
            //if (registrationCode.equals("0")) {
                //accessToken = gson1.toJson(responseBodyRegistration);
            //}
        }
    }


    //public static String getAccessToken() {
        //return accessToken;
    //}

    public static String getResponseCodeRegistration() {
        return responseCodeRegistration;
    }

    public static String getRegistrationMessage() {
        return registrationMessage;
    }
}*/
