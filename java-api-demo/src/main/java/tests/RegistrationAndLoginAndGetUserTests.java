package tests;

import api.Login;
import api.Registration;
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


public class RegistrationAndLoginAndGetUserTests {

    private static String name;
    private static String email;
    private static String password;


    @BeforeTest
    public static void credentials() {
        name = "Tester";
        email = "clayten.taggart@fullangle.org";
        password = "paasss";
    }


    @Test(priority = 0)
    public static void testSuccessfulRegistration() throws IOException {
        Registration postRequestsRegistration = new Registration();
        postRequestsRegistration.registration(name, email, password);
        String responseCodeRegistration = postRequestsRegistration.getResponseCodeRegistration();
        Assert.assertTrue(responseCodeRegistration.contains("200"), responseCodeRegistration);
        String registrationMessage = postRequestsRegistration.getRegistrationMessage();
        Assert.assertTrue(registrationMessage.contains("success"), registrationMessage);
    }


    @Test (priority = 1)
    public static void testRegisteredEmail() throws IOException {
        Registration postRequestsRegistration1 = new Registration();
        postRequestsRegistration1.registration(name, email, password);
        String responseCodeRegistration = postRequestsRegistration1.getResponseCodeRegistration();
        Assert.assertTrue(responseCodeRegistration.contains("200"), responseCodeRegistration);
        String registrationMessage = postRequestsRegistration1.getRegistrationMessage();
        Assert.assertTrue(registrationMessage.contains("The email address you have entered is already registered"), registrationMessage);
    }


    @Test(priority = 2)
    public static void testSuccessfulLogin() throws IOException {
        Login postRequests = new Login();
        postRequests.login(email, password);
        String responseCode = postRequests.getResponseCode();
        Assert.assertTrue(responseCode.contains("200"), responseCode);
        String authMessage = postRequests.getLoginMessage();
        Assert.assertTrue(authMessage.contains("success"), authMessage);
    }

    protected static String urlUserID = "http://restapi.adequateshop.com/api/users/234201";
    protected static String accessToken;
    protected static String responseCode;
    private static String responseBody;


    @Test(priority = 3)
    public static void testGetUser() throws IOException {
        HttpGet getUserID = new HttpGet(urlUserID);
        getUserID.setHeader("Content-type", "application/json");
        getUserID.setHeader("Authorization", "bearer 886ced4b-d925-4ad8-b09c-5a204697b199");
        HttpClient httpClient    = HttpClientBuilder.create().build();
        HttpResponse response    = httpClient.execute(getUserID);
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


    @Test(priority = 4)
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

    @Test(priority = 5)
    public static void testWrongID() throws IOException {
        HttpGet getUserID = new HttpGet("http://restapi.adequateshop.com/api/users/2341999999999999");
        getUserID.setHeader("Content-type", "application/json");
        getUserID.setHeader("Authorization", "bearer 0dc9fbc1-5049-47a9-8d21-3420f638ab92");
        HttpClient httpClient    = HttpClientBuilder.create().build();
        HttpResponse response    = httpClient.execute(getUserID);
        responseCode = response.getStatusLine().toString();

        Assert.assertEquals(responseCode, "HTTP/1.1 400 Bad Request");

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


}
