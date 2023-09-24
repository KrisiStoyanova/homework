package com.java_parabank_demo.Pages.Account_Services;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Log_Out extends Tests {

    By logoutLink = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");

    public void Logout() {
        driver.findElement(logoutLink).click();
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC";
        Assert.assertEquals(currentURL, expectedURL);
    }
}
