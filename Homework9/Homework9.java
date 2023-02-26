package Homework9;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;


public class Homework9 {

    public static WebDriver driver;

        @BeforeClass
        public static void openBrowser () {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://letcode.in/dropdowns");
            driver.manage().window().maximize();
        }

        @Test
        public void goBackToPreviousPage () {

            //Test case 1 - User shall be able to go back to previous page (via browser)

            //Click on 'Sign up' button
            driver.findElement(By.linkText("Sign up")).click();
            //Verify /sign up page URL
            String actualUrlSignUpPage = driver.getCurrentUrl();
            System.out.println("Redirection to page/Sign up page URL: " + actualUrlSignUpPage);
            String expectedUrlSignUpPage = "https://letcode.in/signup";
            Assert.assertEquals(expectedUrlSignUpPage, actualUrlSignUpPage);
            //Go back to Dropdowns page via browser
            driver.navigate().back();
            //Verify /dropdowns page URL
            String actualUrlDropdownsPage = driver.getCurrentUrl();
            System.out.println("Going back to previous page/Dropdowns page URL: " + actualUrlDropdownsPage);
            String expectedUrlDropdownsPage = "https://letcode.in/dropdowns";
            Assert.assertEquals(expectedUrlDropdownsPage, actualUrlDropdownsPage);
            //Assert.assertTrue("Previous page URL match", expectedUrlDropdownsPage.equals(actualUrlDropdownsPage));
            System.out.println("Test Case 1: passed");
        }

        @Test
        public void openLink () {

            //Test case 2 - User shall be able to open 'Work-Space' link in new tab

            //Click on 'Work-Space' link and open a new tab
            String clickLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            //driver.findElement(By.xpath("//*[text()='Work-Space']")).sendKeys(clickLink);
            driver.findElement(By.xpath("//*[@id='testing']")).sendKeys(clickLink);
            ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
            //switch to new tab
            driver.switchTo().window(newTab.get(1));
            String h1ActualTitle = driver.findElement(By.tagName("h1")).getAttribute("innerHTML");
            System.out.println("h1 title of the new tab is: " + h1ActualTitle);
            String h1ExpectedTitle = " Practice and become pro in test automation";
            //Verify h1 title of the new tab
            Assert.assertTrue("h1 title match", h1ExpectedTitle.equals(h1ActualTitle));
            //Assert.assertEquals(h1ExpectedTitle,h1ActualTitle);
            System.out.println("Test Case 2: passed");
            //Switch to parent tab
            driver.switchTo().window(newTab.get(0));
        }

        @Test
        public void selectValueFromDropdown () {

            //Test case 3 - User shall be able to select a value from programming language dropdown

            //Select "java" from programming language dropdown
            Select dropdown = new Select(driver.findElement(By.id("lang")));
            dropdown.selectByValue("java");
            //Verify success notification
            String actualSuccessNotification = driver.findElement(By.cssSelector("p.subtitle")).getAttribute("innerHTML");
            System.out.println(actualSuccessNotification);
            String expectedSuccessNotification = "You have selected Java";
            Assert.assertEquals(expectedSuccessNotification,actualSuccessNotification);
            //Assert.assertTrue("Success notification match", expectedSuccessNotification.equals(actualSuccessNotification));
            System.out.println("Test Case 3: passed");
        }

        @AfterClass
        public static void closeBrowser () {
            driver.quit();
            }
        }



