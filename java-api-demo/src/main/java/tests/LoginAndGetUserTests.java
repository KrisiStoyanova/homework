package tests;

import api.Login;
import api.ResponseReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.io.InputStream;

import static api.Login.*;


public class LoginAndGetUserTests {

    private static String email;
    private static String password;
    //protected static String accessToken = "bearer 78e09673-9fa2-4532-9356-9ebe0e4c62f9";
    protected static String accessToken = "bearer" + getAccessToken();
    protected static String urlString = "http://restapi.adequateshop.com/api/users?page=1";
    //protected static String urlUserID = "http://restapi.adequateshop.com/api/users/" + "238538";
    protected static String urlUserID = "http://restapi.adequateshop.com/api/users/" + getUserID();
    protected static String responseCode;
    protected static String responseBody;


    @BeforeTest
    public static void credentials() {
        email = "righteoufs.ireoluwa1@fullangle.org";
        password = "paasss";
    }



    @Test(priority = 0)
    public static void testSuccessfulLogin() throws IOException {
        Login postRequests = new Login();
        postRequests.login(email, password);
        String responseCode = postRequests.getResponseCode();
        Assert.assertTrue(responseCode.contains("200"), responseCode);
        String authMessage = postRequests.getLoginMessage();
        Assert.assertTrue(authMessage.contains("success"), authMessage);

        printAccessToken();
        printUserID();

    }

/*
    @Test(priority = 1)
    public static void testGetUsers() throws IOException {
        HttpGet getUsers         = new HttpGet(urlString);
        getUsers.setHeader("Content-type", "application/json");
        getUsers.setHeader("Authorization", accessToken);
        HttpClient httpClient    = HttpClientBuilder.create().build();
        HttpResponse response    = httpClient.execute(getUsers);
        responseCode = response.getStatusLine().toString();

        Assert.assertEquals(responseCode, "HTTP/1.1 200 OK");

        //Parse the response body
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            // A Simple JSON Response Read
            InputStream instream = entity.getContent();
            responseBody = new ResponseReader().convertStreamToString(instream);
            instream.close();
        }

        System.out.println(responseCode);
        System.out.println(responseBody);

    }

 */


    @Test(priority = 2)
    public static void testGetUserID() throws IOException {

        HttpGet getUsers         = new HttpGet(urlUserID);
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
            responseBody = new ResponseReader().convertStreamToString(instream);
            instream.close();
        }

        System.out.println(responseCode);
        System.out.println(responseBody);


    }




    @Test(priority = 3)
    public static void testWrongToken() throws IOException {
        HttpGet getUserID = new HttpGet(urlUserID);
        getUserID.setHeader("Content-type", "application/json");
        getUserID.setHeader("Authorization", "bearer wrong");
        HttpClient httpClient    = HttpClientBuilder.create().build();
        HttpResponse response    = httpClient.execute(getUserID);
        responseCode = response.getStatusLine().toString();

        Assert.assertEquals(responseCode, "HTTP/1.1 401 Unauthorized");

        //Parse the response body
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            // A Simple JSON Response Read
            InputStream instream = entity.getContent();
            responseBody = new ResponseReader().convertStreamToString(instream);
            instream.close();
        }

        System.out.println(responseCode);
        System.out.println(responseBody);

    }

/*
    @Test(priority = 4)
    public static void testWrongID() throws IOException {
        HttpGet getUserID = new HttpGet("http://restapi.adequateshop.com/api/users/" + "wrong");
        getUserID.setHeader("Content-type", "application/json");
      //  getUserID.setHeader("Authorization", accessToken);
        HttpClient httpClient    = HttpClientBuilder.create().build();
        HttpResponse response    = httpClient.execute(getUserID);
        responseCode = response.getStatusLine().toString();

        Assert.assertEquals(responseCode, "HTTP/1.1 401 Unauthorized");

        //Parse the response body
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            // A Simple JSON Response Read
            InputStream instream = entity.getContent();
            responseBody = new ResponseReader().convertStreamToString(instream);
            instream.close();
        }

        System.out.println(responseCode);
        System.out.println(responseBody);

    }

 */


}

















