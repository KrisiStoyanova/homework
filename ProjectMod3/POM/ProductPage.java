package ProjectMod3.POM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    //Method for explicit wait for element
    public void explicitWaitBackButton() {
        System.out.println("Explicit wait for back button.");
        WebDriverWait waitBackButton = new WebDriverWait(driver, 10);
        waitBackButton.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"addNewRecordButton\"]")));
    }

    //Method to click back button
    public void clickBackButton() {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")));
    }

    //Method for explicit wait for loading product page
    public void explicitWaitProductPage() {
        System.out.println("Explicit wait for loading product page.");
        WebDriverWait waitProductPage = new WebDriverWait(driver, 10);
        waitProductPage.until(org.openqa.selenium.support.ui.ExpectedConditions.urlToBe("https://demoqa.com/books?book=9781449325862"));
    }

    //Method to verify product page URL
    public void verifyProductPage() {
        String actualUrlProductPage = driver.getCurrentUrl();
        System.out.println("Redirection to product page URL: " + actualUrlProductPage);
        String expectedUrlProductPage = "https://demoqa.com/books?book=9781449325862";
        Assert.assertEquals(expectedUrlProductPage, actualUrlProductPage);
    }
}
