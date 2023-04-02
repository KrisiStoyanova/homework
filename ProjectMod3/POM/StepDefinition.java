package ProjectMod3.POM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class StepDefinition {

  WebDriver driver;

    @Given("user navigates to store page on desktop.")
    public void userNavigatesToStorePageOnDesktop() {
        //openBrowser();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        Dimension desktopViewport = new Dimension(1366, 768);
        driver.manage().window().setSize(desktopViewport);

        //openURL();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/books");

    }

    @Given("user navigates to store page on mobile.")
    public void userNavigatesToStorePageOnMobile() {
        //openBrowser();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        Dimension mobileViewport = new Dimension( 360, 640);
        driver.manage().window().setSize(mobileViewport);

        //openURL();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/books");

    }

    @Given("user navigates to store page on tablet.")
    public void userNavigatesToStorePageOnTablet() {
        //openBrowser();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\JQAProjectMod3\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        Dimension tabletViewport = new Dimension(768, 1024);
        driver.manage().window().setSize(tabletViewport);

        //openURL();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/books");
    }

    @When("user click on first product link.")
    public void userClickOnFirstProductLink() {
        StorePage storePage = PageFactory.initElements(driver, StorePage.class);
        storePage.clickProductLink();
    }

    @Then("user should be navigated to product detailed page.")
    public void userShouldBeNavigatedToProductDetailedPage() {
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        productPage.explicitWaitProductPage();
        productPage.verifyProductPage();
    }

    @Then("back button is displayed.")
    public void backButtonIsDisplayed() {
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        productPage.explicitWaitBackButton();
        driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).isDisplayed();
    }

    @When("user click the back button.")
    public void userClickTheBackButton() {
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        productPage.clickBackButton();
    }

    @Then("user should be navigated back to store page.")
    public void userShouldBeNavigatedBackToStorePage() {
        StorePage storePage = PageFactory.initElements(driver, StorePage.class);
        storePage.explicitWaitStorePage();
        storePage.verifyStorePage();

        driver.quit();
    }

}
