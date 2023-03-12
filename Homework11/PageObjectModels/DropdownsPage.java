package Homework11.PageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Homework11.TestCases.driver;

public class DropdownsPage extends WebElements {

    WebDriver driver;

    public DropdownsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Method to perform click action
    public void clickAction() {
        signUpButton.click();
    }

    //Method to verify /dropdowns page URL
    public void verifyDropdownsPage() {

        String actualUrlDropdownsPage = driver.getCurrentUrl();
        System.out.println("Going back to previous page/Dropdowns page URL: " + actualUrlDropdownsPage);
        String expectedUrlDropdownsPage = "https://letcode.in/dropdowns";
        Assert.assertEquals(expectedUrlDropdownsPage, actualUrlDropdownsPage);
    }

    //Method to select value in dropdown
    public void selectDropdown (String JavaScript) {
        Select dropdown = new Select(driver.findElement(By.id("lang")));
        dropdown.selectByVisibleText(JavaScript); // "Currency Derivatives"
    }
    public void selectValue(String symbol) {
        dropdown.sendKeys("Java");
    }


    //Method to verify success notification
    public void verifySuccessNotification() {
        String actualSuccessNotification = driver.findElement(By.cssSelector("p.subtitle")).getAttribute("innerHTML");
        System.out.println(actualSuccessNotification);
        String expectedSuccessNotification = "You have selected Java";
        Assert.assertEquals(expectedSuccessNotification, actualSuccessNotification);
    }

    //Method to opens link in new tab
    public void OpenLink() {
        link.sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
    }

}


