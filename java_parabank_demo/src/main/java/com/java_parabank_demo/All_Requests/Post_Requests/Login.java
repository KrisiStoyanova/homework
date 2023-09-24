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

public class Login {

    //web
/*
    private static String loginUrl = "https://parabank.parasoft.com/parabank/login.htm";
    protected static String responseCode;
    protected static String responseBody;
    protected static String accessToken;
    private static String authMessage;
    private static String userID;


    public static void main(String[] args) {
        String username = "Kristina1";
        String password = "Kristina1";

        try {
            login(username, password);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void login(String username, String password) throws IOException {
        // Build the post request
        String postBody = "{\"username\":\"" + username + "\", " + "\"password\":\"" + password + "\"}";
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
            responseBody = new api.ResponseReader().convertStreamToString(instream);
            instream.close();
        }
        // Extract and set the access token
        if (responseCode.contains("200") == true) {
            Gson gson = new Gson();
            String authCode = gson.toJson(responseBody);
            authMessage = gson.toJson(responseBody);
            if (authCode.equals("0")) {
                accessToken = gson.toJson(responseBody);
            }
        }


        // Extract and set the user ID
        if (responseCode.contains("200") == true) {
            Gson gson = new Gson();
            String authCode = gson.toJson(responseBody);
            authMessage = gson.toJson(responseBody);
            if (authCode.equals("0")) {
                userID = gson.toJson(responseBody);
            }
        }

    }
    */


