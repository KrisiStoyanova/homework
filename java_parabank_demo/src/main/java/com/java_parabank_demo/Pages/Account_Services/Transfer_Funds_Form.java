package com.java_parabank_demo.Pages.Account_Services;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.openqa.selenium.By.xpath;

public class Transfer_Funds_Form extends Tests {

    public By transferFundsLinkText= By.xpath("//a[.='Transfer Funds']");
    public By amountField= By.xpath("//input[@id='amount']");
    public By fromAccField= By.xpath("//select[@id='fromAccountId']");
    public By toAccField= By.xpath("//*[@id=\"toAccountId\"]");
    public By transferButton= By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input");

    public void transferFunds() throws InterruptedException {
        driver.findElement(transferFundsLinkText).click();
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://parabank.parasoft.com/parabank/transfer.htm";
        Assert.assertEquals(currentURL, expectedURL);
        driver.findElement(amountField).sendKeys("20");
        driver.findElement(fromAccField).click();
        driver.findElement(toAccField).click();
        driver.findElement(xpath("//*[@id=\"fromAccountId\"]/option[2]")).click();
        driver.findElement(transferButton).click();
        String currentUpdatedMessage = driver.findElement(xpath("//*[@id=\"rightPanel\"]/div/div/h1")).getText();
        String expectedUpdatedMessage = "Transfer Complete!";
        Assert.assertEquals(currentUpdatedMessage, expectedUpdatedMessage);
    }


}
