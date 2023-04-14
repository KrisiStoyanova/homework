package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.BaseClass;

public class ProductPage extends BaseClass {

    public void explicitWaitProductPage() {
        System.out.println("Explicit wait for loading product page.");
        WebDriverWait waitProductPage = new WebDriverWait(driver, 10);
        waitProductPage.until(org.openqa.selenium.support.ui.ExpectedConditions.urlToBe("https://demoqa.com/books?book=9781449325862"));
    }

    public void verifyProductPage() {
        String actualUrlProductPage = driver.getCurrentUrl();
        System.out.println("Redirection to product page URL: " + actualUrlProductPage);
        String expectedUrlProductPage = "https://demoqa.com/books?book=9781449325862";
        Assert.assertEquals(expectedUrlProductPage, actualUrlProductPage);
    }

    public void explicitWaitBackButton() {
        System.out.println("Explicit wait for back button.");
        WebDriverWait waitBackButton = new WebDriverWait(driver, 10);
        waitBackButton.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf(backButton));
    }

    public void backButtonIsDisplayed() {
        System.out.println("Back button is displayed.");
        backButton.isDisplayed();
    }

    public void clickBackButton() {
        System.out.println("Click on back button.");
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", backButton);
    }

}
