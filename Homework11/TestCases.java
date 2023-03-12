package Homework11;

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
import java.util.concurrent.TimeUnit;

public class TestCases extends ExpectedConditions {

    public static WebDriver driver;

    @BeforeClass
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Implicit wait for Dropdowns page.");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://letcode.in/dropdowns");
    }

    //Test case 1 - User shall be able to go back to previous page (via browser)
    @Test
    public void goBackToPreviousPage() {

        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        DropdownsPage dropdownsPage = PageFactory.initElements(driver, DropdownsPage.class);

        //Method to perform click action
        dropdownsPage.clickAction();

        //Method to explicitly wait sign up page assertion
        explicitWaitSignUpPage();

        //Method to verify /sign up page URL
        signUpPage.verifySignUpPage();

        //Go back to Dropdowns page via browser
        driver.navigate().back();

        //Method to explicitly wait dropdowns page assertion
        explicitWaitDropdownsPage();

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

        //Method to explicitly wait test page assertion
        explicitWaitTestPage();

        //Method to verify /test page URL
        signUpPage.verifyTestPage();

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

        //Method to explicitly wait notification assertion
        explicitWaitNotification();

        //Method to verify success notification
        dropdownsPage.verifySuccessNotification();

        System.out.println("Test Case 3: passed");
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }

}
