package com.java_parabank_demo.Pages.Account_Services;

import org.openqa.selenium.By;
import org.testng.Assert;

public class About_Us extends Tests {

    By aboutUsLink = By.linkText("About Us");

    public void AboutUsPageRedirect() {
        driver.findElement(aboutUsLink).click();
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://parabank.parasoft.com/parabank/about.htm";
        Assert.assertEquals(currentURL, expectedURL);
    }
}
