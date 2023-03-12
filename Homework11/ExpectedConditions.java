package Homework11;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Homework11.TestCases.driver;


public class ExpectedConditions {

    public void explicitWaitSignUpPage() {
        System.out.println("Explicit wait for Sign up page.");
        WebDriverWait waitSignUpPage = new WebDriverWait(driver, 15);
        waitSignUpPage.until(org.openqa.selenium.support.ui.ExpectedConditions.urlToBe("https://letcode.in/signup"));
    }

    public void explicitWaitDropdownsPage() {
        System.out.println("Explicit wait for Dropdowns page.");
        WebDriverWait waitDropdownsPageURL = new WebDriverWait(driver, 10);
        waitDropdownsPageURL.until(org.openqa.selenium.support.ui.ExpectedConditions.urlToBe("https://letcode.in/dropdowns"));
    }

    public void explicitWaitTestPage() {
        System.out.println("Explicit wait for Test page.");
        WebDriverWait waitTestPage = new WebDriverWait(driver, 20);
        waitTestPage.until(org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe(2));
    }

    public void explicitWaitNotification() {
        System.out.println("Explicit wait for Notification.");
        WebDriverWait waitDropdownsPageNotification = new WebDriverWait(driver, 25);
        waitDropdownsPageNotification.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.subtitle")));
    }

}
