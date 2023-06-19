package tests;

import api.Registration;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import helpers.JsonParser;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;


public class RegistrationTests {

    private static String name;
    private static String email;
    private static String password;


    @BeforeTest
    public static void credentials() {
        name = "Tester";
        email = "righteoufs.ireoluwa1@fullangle.org";
        password = "paasss";
    }


    @Test (priority = 0)
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


}

