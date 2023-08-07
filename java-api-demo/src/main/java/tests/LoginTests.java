package tests;

import api.Login;
import helpers.ReadConfig;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;


public class LoginTests {

    private static String baseURL;
    private static String email;
    private static String password;

    private static String accessToken;

    private static String userID;


    @BeforeTest
    public static void credentials() {
        //email = "righteoufs.ireoluwa1@fullangle.org";
        //password = "paasss";

        ReadConfig configJson = new ReadConfig();
        configJson.readJson();
        baseURL = configJson.getBaseUrl() + "/api/authaccount/login";
        email = configJson.getEmail();
        password = configJson.getPassword();

    }


    @Test
    public static void testSuccessfulLogin() throws IOException {
        Login postRequests = new Login();
        System.out.println("values: " + email + " " + password);
        postRequests.login(email, password);
        String responseCode = postRequests.getResponseCode();
        Assert.assertTrue(responseCode.contains("200"), responseCode);
        String authMessage = postRequests.getLoginMessage();
        Assert.assertTrue(authMessage.contains("success"), authMessage);
        accessToken = postRequests.getAccessToken();
        userID = postRequests.getUserID();
    }


    @Test
    public static void testWrongPassword() throws IOException {
        Login postRequests = new Login();
        postRequests.login(email, "123450");
        String responseCode = postRequests.getResponseCode();
        Assert.assertTrue(responseCode.contains("200"), responseCode);
        String authMessage = postRequests.getLoginMessage();
        Assert.assertTrue(authMessage.contains("invalid"), authMessage);
    }


    @Test
    public static void testWrongUsername() throws IOException {
        Login postRequests = new Login();
        postRequests.login("test@test.com", password);
        String responseCode = postRequests.getResponseCode();
        Assert.assertTrue(responseCode.contains("200"), responseCode);
        String authMessage = postRequests.getLoginMessage();
        Assert.assertTrue(authMessage.contains("invalid"), authMessage);
    }


}
