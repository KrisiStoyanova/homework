package com.java_parabank_demo.Tests;
/*
import com.java_parabank_demo.All_Requests.Post_Requests.Registration;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;


public class RegistrationTestsAPI {

    static String firstName ;
    static String lastName ;
    static String address ;
    static String city ;
    static String state ;
    static String zipCode ;
    static String phone ;
    static String ssn ;
    static String username ;
    static String password ;
    static String confirmPW ;


    @BeforeTest
    public static void credentials() {
        firstName = "Kristina1";
        lastName = "Kristina1";
        address = "Test str.1";
        city = "Sofia";
        state = "Sofia";
        zipCode = "1000";
        phone = "1234567890";
        ssn = "123-4567-80";
        username = "Kristina1";
        password = "Kristina1";
        confirmPW = "Kristina1";

    }


    @Test (priority = 0)
    public static void testSuccessfulRegistration() throws IOException {
        Registration postRequestsRegistration = new Registration();
        postRequestsRegistration.registration(firstName, lastName, address, city, state, zipCode, phone, ssn, username, password, confirmPW);
        String responseCodeRegistration = postRequestsRegistration.getResponseCodeRegistration();
        Assert.assertTrue(responseCodeRegistration.contains("200"), responseCodeRegistration);
        String registrationMessage = postRequestsRegistration.getRegistrationMessage();
        Assert.assertTrue(registrationMessage.contains("Your account was created successfully."), registrationMessage);
    }

    @Test (priority = 1)
    public static void testRegisteredUsername() throws IOException {
        Registration postRequestsRegistration1 = new Registration();
        postRequestsRegistration1.registration(firstName, lastName, address, city, state, zipCode, phone, ssn, username, password, confirmPW);
        String responseCodeRegistration = postRequestsRegistration1.getResponseCodeRegistration();
        Assert.assertTrue(responseCodeRegistration.contains("200"), responseCodeRegistration);
        String registrationMessage = Registration.getRegistrationMessage();
        Assert.assertTrue(registrationMessage.contains("This username already exists."), registrationMessage);
    }


}


 */