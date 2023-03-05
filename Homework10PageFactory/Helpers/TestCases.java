package Homework10PageFactory.Helpers;

import PageObjectModels.DropdownsPage;
import PageObjectModels.SignUpPage;
import PageObjectModels.TestPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class TestCases {

    public static WebDriver driver;

    @BeforeClass
    public static void openBrowser() {
        //BrowserFactory.getBrowser("Chrome");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();
    }

    //Test case 1 - User shall be able to go back to previous page (via browser)
    @Test
    public void goBackToPreviousPage() {

        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        DropdownsPage dropdownsPage = PageFactory.initElements(driver, DropdownsPage.class);

        //Method to perform click action
        dropdownsPage.clickAction();

        //Method to verify /sign up page URL
        signUpPage.verifySignUpPage();

        //Go back to Dropdowns page via browser
        driver.navigate().back();

        //Method to verify /dropdowns page URL
        dropdownsPage.verifyDropdownsPage();

        System.out.println("Test Case 1: passed");

    }

    //Test case 2 - User shall be able to open 'Work-Space' link in new tab
    @Test
    public void openLink() {

        TestPage signUpPage = PageFactory.initElements(driver, TestPage.class);
        DropdownsPage dropdownsPage = PageFactory.initElements(driver, DropdownsPage.class);

        //Method that opens link in new tab
        dropdownsPage.OpenLink();

        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTab.get(1));

        //Method to verify /test page URL
        signUpPage.verifyTestPage();

        //System.out.println("Test Case 2: passed");

        //Switch to parent tab
        driver.switchTo().window(newTab.get(0));
    }

    //Test case 3 - User shall be able to select a value from programming language dropdown
    @Test
    public void selectValueFromDropdown() {

        DropdownsPage dropdownsPage = PageFactory.initElements(driver, DropdownsPage.class);

        //Select "java" from programming language dropdown
        dropdownsPage.selectDropdown("JavaScript");
        dropdownsPage.selectValue("Java");

        //Method to verify success notification
        dropdownsPage.verifySuccessNotification();

        System.out.println("Test Case 3: passed");
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }

}
