package Homework10PageFactory.Helpers.PageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPage extends WebElements {

    WebDriver driver;

    public TestPage(WebDriver driver) {
        this.driver = driver;
    }

    //Method to verify /test page URL
    public void verifyTestPage() {
        String h1ActualTitle = driver.findElement(By.tagName("h1")).getAttribute("innerHTML");
        System.out.println("h1 title of the new tab is: " + h1ActualTitle);
        String h1ExpectedTitle = " Practice and become pro in test automation";
        //Verify h1 title of the new tab
        Assert.assertTrue("h1 title match", h1ExpectedTitle.equals(h1ActualTitle));
    }
}
