package tests;

import api.Login;
import api.Registration;
import helpers.ReadConfig;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

public class RegistrationAndLoginTests {

    private static String name;
    private static String email;
    private static String password;


    @BeforeTest
    public static void credentials() {
        //name = "Tester";
        //email = "keldrick.jaxel430070504@fullangle.org";
        //password = "paasss";

        ReadConfig configJson = new ReadConfig();
        configJson.readJson();
        //baseURL = configJson.getBaseUrl();
        name = configJson.getName();
        email = configJson.getEmail();
        password = configJson.getPassword();
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


    @Test(priority = 1)
    public static void testSuccessfulLogin() throws IOException {
        Login postRequests = new Login();
        postRequests.login(email, password);
        String responseCode = postRequests.getResponseCode();
        Assert.assertTrue(responseCode.contains("200"), responseCode);
        String authMessage = postRequests.getLoginMessage();
        Assert.assertTrue(authMessage.contains("success"), authMessage);
    }


}










