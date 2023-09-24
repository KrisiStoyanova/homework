package com.java_parabank_demo.helpers;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

public class SetAccessToken {

    //Use Gson instead that JsonParser

    public static String CheckAuthCodeAndSetAccessToken(String response){
        Gson gson = new Gson();
        //String authCode = json.getResponseCode(response);
        String authCode = gson.toJson(response);
        String accessToken = "";
        if (authCode.equals("0")) {
            //accessToken = json.getAccessToken(response);
            accessToken = gson.toJson(response);
        }
        return accessToken;
    }
}
