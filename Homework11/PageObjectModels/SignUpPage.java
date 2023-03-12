package Homework11.PageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Homework11.TestCases.driver;

public class SignUpPage extends WebElements {

    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    //Method to verify /sign up page URL
    public void verifySignUpPage() {

        String actualUrlSignUpPage = driver.getCurrentUrl();
        System.out.println("Redirection to page/Sign up page URL: " + actualUrlSignUpPage);
        String expectedUrlSignUpPage = "https://letcode.in/signup";
        Assert.assertEquals(expectedUrlSignUpPage, actualUrlSignUpPage);
    }
}
