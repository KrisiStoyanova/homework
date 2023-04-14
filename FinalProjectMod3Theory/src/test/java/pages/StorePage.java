package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.BaseClass;

public class StorePage extends BaseClass {

    public void clickProductLink() {
        System.out.println("Click on product link.");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", productLink);
    }

    public void explicitWaitStorePage() {
        System.out.println("Explicit wait for loading store page.");
        WebDriverWait waitStorePageURL = new WebDriverWait(driver, 10);
        waitStorePageURL.until(org.openqa.selenium.support.ui.ExpectedConditions.urlToBe("https://demoqa.com/books"));
    }

    public void verifyStorePage() {
        String actualUrlStorePage = driver.getCurrentUrl();
        System.out.println("Going back to store page URL: " + actualUrlStorePage);
        String expectedUrlStoragePage = "https://demoqa.com/books";
        Assert.assertEquals(expectedUrlStoragePage, actualUrlStorePage);
    }

}
