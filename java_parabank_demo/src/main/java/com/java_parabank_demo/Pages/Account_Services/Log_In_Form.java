package com.java_parabank_demo.Pages.Account_Services;

import org.testng.Assert;

public class Log_In_Form extends Tests {

    public void Login() {

        driver.findElement(usernameField).sendKeys("Kristina1");
        driver.findElement(passwordField).sendKeys("Kristina1");
        driver.findElement(loginButton).click();
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://parabank.parasoft.com/parabank/overview.htm";
        Assert.assertEquals(currentURL, expectedURL);
    }

}
