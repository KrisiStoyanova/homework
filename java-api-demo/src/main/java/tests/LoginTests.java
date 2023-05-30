package tests;

import api.Login;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static api.Login.printAccessToken;

public class LoginTests {

    private static String email;
    private static String password;


    @BeforeTest
    public static void credentials() {
        email = "ropseleyde@gufum.com";
        password = "paasss";
    }


    @Test
    public static void testSuccessfulLogin() throws IOException {
        Login postRequests = new Login();
        postRequests.login(email, password);
        String responseCode = postRequests.getResponseCode();
        Assert.assertTrue(responseCode.contains("200"), responseCode);
        String authMessage = postRequests.getLoginMessage();
        Assert.assertTrue(authMessage.contains("success"), authMessage);

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
