package Homework10PageFactory.Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {

    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    public static WebDriver getBrowser(String browserName) {

        WebDriver driver = null;

        switch (browserName) {

            case "Chrome":
                driver = drivers.get("Chrome");
                if (driver == null) {
                    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    drivers.put("Chrome", driver);
                }
                break;

            case "Firefox":
                driver = drivers.get("Firefox");
                if (driver == null) {
                    System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    drivers.put("Firefox", driver);
                }
                break;

            case "Edge":
                driver = drivers.get("Edge");
                if (driver == null) {
                    System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\msedgedriver.exe");
                    driver = new EdgeDriver();
                    drivers.put("Edge", driver);
                }
                break;

        }
        return driver;
    }

    public static void closeBrowser() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            drivers.get(key).quit();
        }
    }
}
