package com.java_parabank_demo.Pages.Account_Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.openqa.selenium.By.xpath;

public class Bill_Pay_Form extends Tests {
    //WebDriver driver;
    //public Bill_Pay_Form() {this.driver = driver;}

    By billPayButton = By.linkText("Bill Pay");
    By payeeNameFieldLocator = By.name("payee.name");
    By addressFieldLocator = By.name("payee.address.street");
    By cityFieldLocator = By.name("payee.address.city");
    By stateFieldLocator = By.name("payee.address.state");
    By zipCodeFieldLocator = By.name("payee.address.zipCode");
    By phoneFieldLocator = By.name("payee.phoneNumber");
    By accountFieldLocator = By.name("payee.accountNumber");
    By verifyAccountFieldLocator = By.name("verifyAccount");
    By amountFieldLocator = By.name("amount");
    By fromAccountDropMenuLocator = By.name("fromAccountId");
    By sendPaymentSubmitButton = By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input");

    public void GoToBillPaymentService(){
        driver.findElement(billPayButton).click();
    }

    public void payBill() throws InterruptedException {
        driver.findElement(payeeNameFieldLocator).sendKeys("test");
        driver.findElement(addressFieldLocator).sendKeys("hghhgdshg");
        driver.findElement(cityFieldLocator).sendKeys("Sofia");
        driver.findElement(stateFieldLocator).sendKeys("hfdfjdsgf");
        driver.findElement(zipCodeFieldLocator).sendKeys("75735");
        driver.findElement(phoneFieldLocator).sendKeys("075832736");
        driver.findElement(accountFieldLocator).sendKeys("12345");
        driver.findElement(verifyAccountFieldLocator).sendKeys("12345");
        driver.findElement(amountFieldLocator).sendKeys("10");
        //driver.findElement(fromAccountDropMenuLocator).click();
        driver.findElement(sendPaymentSubmitButton).click();
        Thread.sleep(2000);
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://parabank.parasoft.com/parabank/billpay.htm";
        Assert.assertEquals(currentURL, expectedURL);
        String currentUpdatedMessage = driver.findElement(xpath("//*[@id=\"rightPanel\"]/div/div[2]/h1")).getText();
        String expectedUpdatedMessage = "Bill Payment Complete";
        Assert.assertEquals(currentUpdatedMessage, expectedUpdatedMessage);
    }
}
