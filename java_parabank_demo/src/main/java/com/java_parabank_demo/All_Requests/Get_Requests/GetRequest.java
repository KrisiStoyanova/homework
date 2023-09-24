package com.java_parabank_demo.All_Requests.Get_Requests;
/*
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.io.InputStream;

public class GetRequest {
    // This is only a test class, so it can be displayed in the GitHub

    protected static String urlString = "https://parabank.parasoft.com/parabank/register.htm";
    public static String accessToken;
    protected static String responseCode;
    protected static String responseBody;


    public static void main(String[] args) throws IOException {
        HttpGet getUsers         = new HttpGet(urlString);
        getUsers.setHeader("Content-type", "application/json");
        getUsers.setHeader("Authorization", accessToken);
        HttpClient httpClient    = HttpClientBuilder.create().build();
        HttpResponse response    = httpClient.execute(getUsers);
        responseCode = response.getStatusLine().toString();


        //Parse the response body
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            // A Simple JSON Response Read
            InputStream instream = entity.getContent();
            responseBody = new api.ResponseReader().convertStreamToString(instream);
            instream.close();
        }

        System.out.println(responseCode);
        System.out.println(responseBody);


    }



}

 */
