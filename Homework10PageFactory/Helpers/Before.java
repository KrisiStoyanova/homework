package Homework10PageFactory.Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Before extends BrowserFactory {

    static WebDriver driver;

    public void setup() {
        //Create a Chrome driver. All test classes use this.
        //getBrowser("Chrome");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.get("https://letcode.in/dropdowns");
        //driver.manage().window().maximize();
        /*WebDriver driver = BrowserFactory.getBrowser("Chrome");
        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();
        //WebElements webElements = PageFactory.initElements(driver, WebElements.class);
        //DropdownsPage dropdownsPage = PageFactory.initElements(driver, DropdownsPage.class);*/
    }

}
