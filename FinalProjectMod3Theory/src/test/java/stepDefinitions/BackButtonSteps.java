package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.ProductPage;
import pages.StorePage;
import java.util.concurrent.TimeUnit;

public class BackButtonSteps extends BaseClass {

    @Before
    public void setupBrowser() {
        System.out.println("Open browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("^user navigates to store page on (.*) x (.*) viewport.")
    public void userNavigatesToStorePageOnWidthAndHeightViewport(Integer width, Integer height) {
        System.out.println("1st step: set window size & open url");
        Dimension viewport = new Dimension(width, height);
        driver.manage().window().setSize(viewport);
        driver.get("https://demoqa.com/books");
    }

    @When("user click on first product link.")
    public void userClickOnFirstProductLink() {
        System.out.println("2nd step");
        StorePage storePage = PageFactory.initElements(driver, StorePage.class);
        storePage.clickProductLink();
    }

    @Then("user should be navigated to product detailed page.")
    public void userShouldBeNavigatedToProductDetailedPage() {
        System.out.println("3rd step");
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        productPage.explicitWaitProductPage();
        productPage.verifyProductPage();
    }

    @And("back button is displayed.")
    public void backButtonIsDisplayed() {
        System.out.println("4th step");
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        productPage.explicitWaitBackButton();
        productPage.backButtonIsDisplayed();
    }

    @When("user click the back button.")
    public void userClickTheBackButton() {
        System.out.println("5th step & close browser");
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        productPage.clickBackButton();
    }

    @Then("user should be navigated back to store page.")
    public void userShouldBeNavigatedBackToStorePage() {
        System.out.println("6th step & close browser");
        StorePage storePage = PageFactory.initElements(driver, StorePage.class);
        storePage.explicitWaitStorePage();
        storePage.verifyStorePage();
    }

    @After
    public void closeBrowser() {
        System.out.println("Close browser");
        driver.close();
    }


}
