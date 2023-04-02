package ProjectMod3.POM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StorePage {

    WebDriver driver;

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }

    //Method to perform click action
    public void clickProductFirstLink() {
        WebElement productFirstLink = driver.findElement(By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]/a"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", productFirstLink);
    }

    //Method for explicit wait for loading store page
    public void explicitWaitStorePage() {
        System.out.println("Explicit wait for loading store page.");
        WebDriverWait waitStorePage = new WebDriverWait(driver, 10);
        waitStorePage.until(org.openqa.selenium.support.ui.ExpectedConditions.urlToBe("https://demoqa.com/books"));
    }

    //Method to verify store page
    public void verifyStorePage() {
        String actualUrlStorePage = driver.getCurrentUrl();
        System.out.println("Going back to store page URL: " + actualUrlStorePage);
        String expectedUrlStoragePage = "https://demoqa.com/books";
        Assert.assertEquals(expectedUrlStoragePage, actualUrlStorePage);
    }

}


