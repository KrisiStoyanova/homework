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


public class Contact {

    //api

    private static String contactUsUrl = "https://parabank.parasoft.com/parabank/contact.htm";
    private static String responseCodeContact;
    private static String responseBodyContact;
    //private static String accessToken;
    private static String contactMessage;


    public static void main(String[] args) {
        String name = "Kristina Test";
        String email = "test84544@test.io";
        String phone = "07437437645";
        String message = "testing";

        try {
        contact(name, email, phone, message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void contact(String name, String email, String phone, String message) {
        String postBodyContact = "{\"name\":\"" + name + "\", " + "\"email\":\"" + email + "\", " + "\"phone\":\"" + phone + "\"," + "\"message\":\"" + message + "\"}";
        HttpPost postContact = new HttpPost(contactUsUrl);
        postContact.setEntity(new StringEntity(postBodyContact));
        postContact.setHeader("Content-type", "application/json");
        HttpClient httpClient1 = HttpClientBuilder.create().build();

        // Execute the post request
        HttpResponse response1 = httpClient1.execute(postContact);
        responseCodeContact = response1.getStatusLine().toString();
        // Fill in the response body
        HttpEntity entity1 = response1.getEntity();
        if (entity1 != null) {
            // A Simple JSON Response Read
            InputStream instream1 = entity1.getContent();
            responseBodyContact = new api.ResponseReader().convertStreamToString(instream1);
            instream1.close();
        }
    }

    public static String getResponseCodeContact() {
        return responseCodeContact;
    }

    public static String getContactMessage() {
        return contactMessage;
    }
}

 */

