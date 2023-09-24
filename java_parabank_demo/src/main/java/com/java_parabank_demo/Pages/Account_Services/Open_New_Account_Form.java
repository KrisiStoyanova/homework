package com.java_parabank_demo.Pages.Account_Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.openqa.selenium.By.xpath;

public class Open_New_Account_Form extends Tests {
    //WebDriver driver;
    //public Open_New_Account_Form (WebDriver driver) {this.driver = driver;}

    By openNewAccountButton = By.linkText("Open New Account");
    By accountTypeDropMenuLocator = By.xpath("//*[@id=\"type\"]");
    By selectAccountDropMenuLocator = By.xpath("//*[@id=\"fromAccountId\"]");
    By openNewAccountSubmitButton = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input");
    By selectCheckingAccount = By.xpath("//*[@id='type']/option[1]");
    By selectSavingsAccount = By.xpath("//*[@id=\"type\"]");
    By selectTheFirstAccount = By.xpath("//*[@id=\"fromAccountId\"]");
    //By selectTheSecondAccount = By.xpath("//*[@id=\"fromAccountId\"]/option[2]");

    public Open_New_Account_Form() {
    }

    public void GoToTheOpenNewAccountForm(){
        driver.findElement(openNewAccountButton).click();
        // Open New Account Form is displayed
    }

    public void OpenNewSavingsAccount() throws InterruptedException {
        driver.findElement(accountTypeDropMenuLocator).click();
        driver.findElement(selectSavingsAccount).click();
        driver.findElement(selectAccountDropMenuLocator).click();
        driver.findElement(selectTheFirstAccount).click();
        driver.findElement(openNewAccountSubmitButton).click();
        Thread.sleep(2000);
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://parabank.parasoft.com/parabank/openaccount.htm";
        Assert.assertEquals(currentURL, expectedURL);
        String currentUpdatedMessage = driver.findElement(xpath("//*[@id=\"rightPanel\"]/div/div/h1")).getText();
        String expectedUpdatedMessage = "Account Opened!";
        Assert.assertEquals(currentUpdatedMessage, expectedUpdatedMessage);
    }

    public void OpenNewCheckingAccount(){
        driver.findElement(accountTypeDropMenuLocator).click();
        driver.findElement(selectCheckingAccount).click();
        driver.findElement(selectAccountDropMenuLocator).click();
        driver.findElement(selectTheFirstAccount).click();
        driver.findElement(openNewAccountButton).click();
    }


}
