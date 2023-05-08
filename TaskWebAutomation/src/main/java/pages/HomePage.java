package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "firstname")
    public
    WebElement firstNameField;

    @FindBy(id = "lastname")
    public
    WebElement lastNameField;

    @FindBy(id = "salestarget")
    WebElement salesTargetDropdown;

    @FindBy(id = "salesresult")
    public
    WebElement salesResultField;

    @FindBy(xpath = "//*[@id=\"sales-form\"]/button")
    public
    WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[3]/button[1]")
    public
    WebElement showPerformanceButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[3]/button[1]")
    public
    WebElement hidePerformanceButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[3]/button[2]")
    public
    WebElement deleteSalesEntriesButton;

    @FindBy(id = "logout")
    public
    WebElement logOutButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[1]/span[2]")
    public
    WebElement activeSalesPeople;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/span[2]")
    public
    WebElement expectedSales;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[3]/span[2]")
    public
    WebElement actualSales;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[4]/span[2]")
    public
    WebElement totalDifference;

    @FindBy(xpath = "//*[@id=\"sales-results\"]/table/tbody/tr/td[1]")
    public
    WebElement name;

    @FindBy(xpath = "//*[@id=\"sales-results\"]/table/tbody/tr/td[2]")
    public
    WebElement target;

    @FindBy(xpath = "//*[@id=\"sales-results\"]/table/tbody/tr/td[3]")
    public
    WebElement result;

    @FindBy(xpath = "//*[@id=\"sales-results\"]/table/tbody/tr/td[4]")
    public
    WebElement difference;


    @FindBy(xpath = "//*[@id=\"sales-results\"]/table/tbody/tr[2]/td[1]")
    public
    WebElement previousEntryName;

    @FindBy(xpath = "///*[@id=\"sales-results\"]/table/tbody/tr[2]/td[2]")
    public
    WebElement previousEntryTarget;

    @FindBy(xpath = "//*[@id=\"sales-results\"]/table/tbody/tr[2]/td[3]")
    public
    WebElement previousEntryResult;

    @FindBy(xpath = "//*[@id=\"sales-results\"]/table/tbody/tr[2]/td[4]")
    public
    WebElement previousEntryDifference;

    @FindBy(xpath = "//*[@id=\"sales-results\"]/table/tbody/tr[2]/td/span")
    public
    WebElement performanceMessage;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePage() {
        WebDriverWait waitSubmitButton = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitSubmitButton.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sales-form\"]/button")));
        submitButton.isDisplayed();
    }

    public void fillOutNamesFields() {
        firstNameField.sendKeys("Oto");
        lastNameField.sendKeys("Test");
    }

    public void fillOutSpecialCharactersIntoNamesFields() {
        firstNameField.sendKeys("Anna - García");
        lastNameField.sendKeys("Mariya - Márquez");
    }

    public void fillOutFirstNameField() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.firstNameField.sendKeys("First Name");
    }

    public void fillOutFirstAndLastNameFields()  {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.firstNameField.sendKeys("First Name");
        homePage.lastNameField.sendKeys("Last Name");
    }

    public void useBlankNamesFields() {
        firstNameField.sendKeys(" ");
        lastNameField.sendKeys(" ");
    }

    public void useDefaultDropdownValue() {
        Select select = new Select(salesTargetDropdown);
        String option = select.getFirstSelectedOption().getText();
        Assert.assertEquals("$5,000", option);
    }

    public void fillOutSalesFormForPlusResult() {
        Select dropdown = new Select(salesTargetDropdown);
        dropdown.selectByValue("55000");
        salesResultField.sendKeys("60000");
        submitButton.click();
    }

    public void fillOutSalesFormForMinusResult() {
        Select dropdown = new Select(salesTargetDropdown);
        dropdown.selectByValue("100000");
        salesResultField.sendKeys("99000");
        submitButton.click();
    }

    public void useZeroSalesResult() {
        salesResultField.sendKeys("0");
    }

    public void useOneHundredThousandSalesResult() {
        salesResultField.sendKeys("100000");
    }


}
