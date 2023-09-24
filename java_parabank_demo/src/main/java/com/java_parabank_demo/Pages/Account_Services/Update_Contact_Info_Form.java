package com.java_parabank_demo.Pages.Account_Services;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.java_parabank_demo.Pages.Account_Services.Tests.driver;
import static org.openqa.selenium.By.xpath;

public class Update_Contact_Info_Form extends Update_Contact_Info_Elements {

    public void updateContactInfo() throws InterruptedException {
        driver.findElement(xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a")).click();
        String currentMessage = driver.findElement(xpath("//*[@id=\"rightPanel\"]/div/div/h1")).getText();
        String expectedMessage = "Update Profile";
        Assert.assertEquals(currentMessage, expectedMessage);
        Thread.sleep(2000);
        driver.findElement(editAddressField).clear();
        driver.findElement(editAddressField).sendKeys("updated address");
        driver.findElement(editCityField).clear();
        driver.findElement(editCityField).sendKeys("updated city");
        Thread.sleep(2000);
        driver.findElement(updateProfileBtn).click();
        Thread.sleep(2000);
        String currentUpdatedMessage = driver.findElement(xpath("//*[@id=\"rightPanel\"]/div/div/h1")).getText();
        String expectedUpdatedMessage = "Profile Updated";
        Assert.assertEquals(currentUpdatedMessage, expectedUpdatedMessage);
    }

    // Add page locators and methods

}
