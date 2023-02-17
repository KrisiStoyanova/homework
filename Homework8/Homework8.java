package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Homework8 {

    public static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        //System.setProperty("webdriver.edge.driver","C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\msedgedriver.exe");
        //System.setProperty("webdriver.firefox.marionette","C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\geckodriver.exe");
        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        //capabilities.setCapability("marionette",true);

        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new EdgeDriver();

        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();

        //Test case 1 - User shall be able to go back (via browser) when on /signup page

        //Find 1st web element (button), click on it, then go back to previous page
        driver.findElement(By.linkText("Sign up")).click();
        driver.navigate().back();

        //Test case 2 - User shall be able to open 'Work-Space' link in new tab

        //Find 2nd web element (link), click on it and open a new tab, then close the 2nd tab
        String clickLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
        //driver.findElement(By.xpath("//*[text()='Work-Space']")).sendKeys(clickLink);
        driver.findElement(By.xpath("//*[@id='testing']")).sendKeys(clickLink);

        //Test case 3 - User shall be able to select a value from programming language dropdown

        //Find 3rd web element (dropdown), click on it and select a value
        //Create object of the Select class
        Select dropdown = new Select(driver.findElement(By.id("lang")));
        //Select the option with value "java"
        dropdown.selectByValue("java");

        //driver.quit();
    }
}


