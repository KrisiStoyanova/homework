package tests;

import api.Registration;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import helpers.JsonParser;
import helpers.ReadConfig;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;


public class RegistrationTests {

    private static String name;
    private static String email;
    private static String password;
    private static String baseURL;


    @BeforeTest
    public static void credentials() {
        //name = "Tester";
        //email = "haruto.nekhi07080404@fullangle.org";
        //password = "paasss";

        ReadConfig configJson = new ReadConfig();
        configJson.readJson();
        baseURL = configJson.getBaseUrl() + "/api/authaccount/registration";
        name = configJson.getName();
        email = configJson.getEmail();
        password = configJson.getPassword();
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

