import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class Tests {

    WebDriver driver;

    @BeforeTest
    public void loadHomePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login();
        String currentUrl = driver.getCurrentUrl();
        String expectedUrlHomePage = "https://robotsparebinindustries.com/#/";
        Assert.assertEquals(expectedUrlHomePage, currentUrl);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.verifyHomePage();
    }

    @Test(priority = 0)
    public void testSalesFormPlusDifference() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.fillOutNamesFields();
        homePage.fillOutSalesFormForPlusResult();
        Thread.sleep(1500);
        homePage.activeSalesPeople.isDisplayed();
        String expectedSalesPeople = "1";
        Assert.assertEquals(homePage.activeSalesPeople.getText(),expectedSalesPeople);
        homePage.expectedSales.isDisplayed();
        String expectedExpectedSales = "$55,000";
        Assert.assertEquals(homePage.expectedSales.getText(),expectedExpectedSales);
        homePage.actualSales.isDisplayed();
        String expectedActualSales = "$60,000";
        Assert.assertEquals(homePage.actualSales.getText(),expectedActualSales);
        homePage.totalDifference.isDisplayed();
        String expectedTotalDifference = "$5,000";
        Assert.assertEquals(homePage.totalDifference.getText(),expectedTotalDifference);
        homePage.name.isDisplayed();
        String expectedName = "Oto Test";
        Assert.assertEquals(homePage.name.getText(),expectedName);
        homePage.target.isDisplayed();
        String expectedTarget = "$55,000";
        Assert.assertEquals(homePage.target.getText(),expectedTarget);
        homePage.result.isDisplayed();
        String expectedResult = "$60,000";
        Assert.assertEquals(homePage.result.getText(),expectedResult);
        homePage.difference.isDisplayed();
        String expectedDifference = "$5,000";
        Assert.assertEquals(homePage.difference.getText(),expectedDifference);
        homePage.deleteSalesEntriesButton.click();
        Thread.sleep(1500);
    }

    @Test(priority = 1)
    public void testSalesFormMinusDifference() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Thread.sleep(1500);
        homePage.fillOutSpecialCharactersIntoNamesFields();
        homePage.fillOutSalesFormForMinusResult();
        Thread.sleep(1500);
        homePage.activeSalesPeople.isDisplayed();
        String expectedSalesPeople = "1";
        Assert.assertEquals(homePage.activeSalesPeople.getText(),expectedSalesPeople);
        homePage.expectedSales.isDisplayed();
        String expectedExpectedSales = "$100,000";
        Assert.assertEquals(homePage.expectedSales.getText(),expectedExpectedSales);
        homePage.actualSales.isDisplayed();
        String expectedActualSales = "$99,000";
        Assert.assertEquals(homePage.actualSales.getText(),expectedActualSales);
        homePage.totalDifference.isDisplayed();
        String expectedTotalDifference = "$-1,000";
        Assert.assertEquals(homePage.totalDifference.getText(),expectedTotalDifference);
        homePage.name.isDisplayed();
        String expectedName = "Anna - García Mariya - Márquez";
        Assert.assertEquals(homePage.name.getText(),expectedName);
        homePage.target.isDisplayed();
        String expectedTarget = "$100,000";
        Assert.assertEquals(homePage.target.getText(),expectedTarget);
        homePage.result.isDisplayed();
        String expectedResult = "$99,000";
        Assert.assertEquals(homePage.result.getText(),expectedResult);
        homePage.difference.isDisplayed();
        String expectedDifference = "$-1,000";
        Assert.assertEquals(homePage.difference.getText(),expectedDifference);
        homePage.deleteSalesEntriesButton.click();
        Thread.sleep(2500);
    }

    @Test(priority = 2)
    public void testSalesSummaryWhenMoreThanOneEntry() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.fillOutNamesFields();
        homePage.fillOutSalesFormForPlusResult();
        Thread.sleep(1500);
        homePage.fillOutSpecialCharactersIntoNamesFields();
        homePage.fillOutSalesFormForMinusResult();
        Thread.sleep(1500);
        homePage.activeSalesPeople.isDisplayed();
        String expectedSalesPeople = "2";
        Assert.assertEquals(homePage.activeSalesPeople.getText(),expectedSalesPeople);
        homePage.expectedSales.isDisplayed();
        String expectedExpectedSales = "$155,000";
        Assert.assertEquals(homePage.expectedSales.getText(),expectedExpectedSales);
        homePage.actualSales.isDisplayed();
        String expectedActualSales = "$159,000";
        Assert.assertEquals(homePage.actualSales.getText(),expectedActualSales);
        homePage.totalDifference.isDisplayed();
        String expectedTotalDifference = "$4,000";
        Assert.assertEquals(homePage.totalDifference.getText(),expectedTotalDifference);
        homePage.deleteSalesEntriesButton.click();
    }

/*
//org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression ///*[@id="sales-results"]/table/tbody/tr[2]/td[2] because of the following error:
//SyntaxError: Failed to execute 'evaluate' on 'Document': The string '///*[@id="sales-results"]/table/tbody/tr[2]/td[2]' is not a valid XPath expression.

    @Test(priority = 3)
    public void testSalesResultsTableWhenMoreThanOneEntry() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.fillOutNamesFields();
        homePage.fillOutSalesFormForPlusResult();
        Thread.sleep(1500);
        homePage.fillOutSpecialCharactersIntoNamesFields();
        homePage.fillOutSalesFormForMinusResult();
        Thread.sleep(1500);
        homePage.name.isDisplayed();
        String expectedName = "Anna - García Mariya - Márquez";
        Assert.assertEquals(homePage.name.getText(),expectedName);
        homePage.target.isDisplayed();
        String expectedTarget = "$100,000";
        Assert.assertEquals(homePage.target.getText(),expectedTarget);
        homePage.result.isDisplayed();
        String expectedResult = "$99,000";
        Assert.assertEquals(homePage.result.getText(),expectedResult);
        homePage.difference.isDisplayed();
        String expectedDifference = "$-1,000";
        Assert.assertEquals(homePage.difference.getText(),expectedDifference);
        homePage.previousEntryName.isDisplayed();
        String expectedPreviousName = "Oto Test";
        Assert.assertEquals(homePage.previousEntryName.getText(),expectedPreviousName);
        //FROM below IT IS THE ERROR
        homePage.previousEntryTarget.isDisplayed();
        String expectedPreviousEntryTarget = "$55,000";
        Assert.assertEquals(homePage.previousEntryTarget.getText(),expectedPreviousEntryTarget);
        //TO above IT IS THE ERROR
        homePage.previousEntryResult.isDisplayed();
        String expectedPreviousEntryResult = "$60,000";
        Assert.assertEquals(homePage.previousEntryResult.getText(),expectedPreviousEntryResult);
        homePage.previousEntryDifference.isDisplayed();
        String expectedPreviousEntryDifference = "$5,000";
        Assert.assertEquals(homePage.previousEntryDifference.getText(),expectedPreviousEntryDifference);
        homePage.deleteSalesEntriesButton.click();
    }

 */

    @Test(priority = 3)
    public void testMissingInputFirstNameField() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.submitButton.click();
        Thread.sleep(1500);
        String messageFirstNameField = homePage.firstNameField.getText();
        Assert.assertNotNull(messageFirstNameField);
    }

    @Test(priority = 4)
    public void testMissingInputLastNameField() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.fillOutFirstNameField();
        homePage.submitButton.click();
        Thread.sleep(1500);
        String messageLastNameField = homePage.lastNameField.getText();
        Assert.assertNotNull(messageLastNameField);
    }

    @Test(priority = 5)
    public void testMissingInputSalesResultField() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.fillOutFirstAndLastNameFields();
        homePage.submitButton.click();
        Thread.sleep(1500);
        String messageSalesResultField = homePage.salesResultField.getText();
        Assert.assertNotNull(messageSalesResultField);
    }

    @Test(priority = 6)
    public void testDefaultDropdownValue() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.fillOutFirstAndLastNameFields();
        homePage.useDefaultDropdownValue();
        homePage.useZeroSalesResult();
        Thread.sleep(1500);
        homePage.submitButton.click();
        String expectedTarget = "$5,000";
        Assert.assertEquals(homePage.target.getText(),expectedTarget);
        homePage.deleteSalesEntriesButton.click();
    }

    @Test(priority = 7)
    public void testBlankNamesFields() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.useBlankNamesFields();
        homePage.useOneHundredThousandSalesResult();
        Thread.sleep(1500);
        homePage.submitButton.click();
        homePage.name.isDisplayed();
        String expectedName = "   ";
        Assert.assertNotNull(homePage.name.getText(), expectedName);
        homePage.deleteSalesEntriesButton.click();
    }

    @Test(priority = 8)
    public void testShowPerformanceFunctionality() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.fillOutNamesFields();
        homePage.fillOutSalesFormForPlusResult();
        homePage.showPerformanceButton.isDisplayed();
        homePage.showPerformanceButton.isEnabled();
        homePage.deleteSalesEntriesButton.click();
    }

/*

    @Test(priority = 9)
    public void testPerformanceMessageForPlusResult() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.fillOutNamesFields();
        homePage.fillOutSalesFormForPlusResult();
        Thread.sleep(1500);
        homePage.showPerformanceButton.click();
        String expectedMessage = "A positive result. Well done!";
        Assert.assertEquals(homePage.performanceMessage.getText(), expectedMessage);
        homePage.deleteSalesEntriesButton.click();
        Thread.sleep(1500);
    }

    @Test(priority = 10)
    public void testPerformanceMessageForMinusResult() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Thread.sleep(1500);
        homePage.fillOutNamesFields();
        homePage.fillOutSalesFormForMinusResult();
        Thread.sleep(1500);
        homePage.showPerformanceButton.click();
        Thread.sleep(1500);
        String expectedMessage = "Hmm. Did not quite make it.";
        Assert.assertEquals(homePage.performanceMessage.getText(), expectedMessage);
        Thread.sleep(1500);
        homePage.deleteSalesEntriesButton.click();
    }

    @Test(priority = 11)
    public void testPerformanceMessageForExcellentResult() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.fillOutSpecialCharactersIntoNamesFields();
        homePage.useDefaultDropdownValue();
        homePage.useOneHundredThousandSalesResult();
        homePage.submitButton.click();
        homePage.showPerformanceButton.click();
        String expectedMessage = "Holy macaroni!";
        Assert.assertEquals(homePage.performanceMessage.getText(), expectedMessage);
        Thread.sleep(1500);
        homePage.deleteSalesEntriesButton.click();
    }

    @Test(priority = 12)
    public void testPerformanceMessageForBadResult() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.useBlankNamesFields();
        homePage.useDefaultDropdownValue();
        homePage.useZeroSalesResult();
        homePage.submitButton.click();
        homePage.showPerformanceButton.click();
        String expectedMessage = "The boss wants to see you...";
        Assert.assertEquals(homePage.performanceMessage.getText(), expectedMessage);
        Thread.sleep(1500);
        homePage.deleteSalesEntriesButton.click();
    }

 */

    @Test(priority = 9)
    public void testHidePerformanceFunctionality() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.fillOutFirstAndLastNameFields();
        homePage.fillOutSalesFormForPlusResult();
        homePage.showPerformanceButton.click();
        homePage.showPerformanceButton.isSelected();
        homePage.hidePerformanceButton.isDisplayed();
        homePage.hidePerformanceButton.click();
        homePage.hidePerformanceButton.isSelected();
        homePage.showPerformanceButton.isDisplayed();
        homePage.deleteSalesEntriesButton.click();
    }

    @Test(priority = 10)
    public void testDeleteSalesEntriesFunctionality() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.fillOutNamesFields();
        homePage.fillOutSalesFormForMinusResult();
        homePage.deleteSalesEntriesButton.isDisplayed();
        homePage.deleteSalesEntriesButton.isEnabled();
        homePage.deleteSalesEntriesButton.click();
        homePage.deleteSalesEntriesButton.isSelected();
        Thread.sleep(1500);
    }

    @Test(priority = 11)
    public void testSalesResultStartingWithZero() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Thread.sleep(1500);
        homePage.fillOutNamesFields();
        homePage.useDefaultDropdownValue();
        homePage.salesResultField.sendKeys("0500");
        homePage.submitButton.click();
        Thread.sleep(1500);
        String expectedActualSales = "$500";
        Assert.assertEquals(homePage.actualSales.getText(),expectedActualSales);
        String expectedTotalDifference = "$-4,500";
        Assert.assertEquals(homePage.totalDifference.getText(),expectedTotalDifference);
        String expectedResult = "$500";
        Assert.assertEquals(homePage.result.getText(),expectedResult);
        String expectedDifference = "$-4,500";
        Assert.assertEquals(homePage.difference.getText(),expectedDifference);
        Thread.sleep(1500);
        homePage.deleteSalesEntriesButton.click();
        Thread.sleep(1500);
    }

    @Test(priority = 12)
    public void testMinusSymbolIntoSalesResultField() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Thread.sleep(1500);
        homePage.fillOutNamesFields();
        homePage.useDefaultDropdownValue();
        homePage.salesResultField.sendKeys("-5000");
        homePage.submitButton.click();
        Thread.sleep(1500);
        String expectedActualSales = "$-5,000";
        Assert.assertEquals(homePage.actualSales.getText(),expectedActualSales);
        String expectedTotalDifference = "$-10,000";
        Assert.assertEquals(homePage.totalDifference.getText(),expectedTotalDifference);
        String expectedResult = "$-5,000";
        Assert.assertEquals(homePage.result.getText(),expectedResult);
        String expectedDifference = "$-10,000";
        Assert.assertEquals(homePage.difference.getText(),expectedDifference);
        Thread.sleep(1500);
        homePage.deleteSalesEntriesButton.click();
        Thread.sleep(1500);
    }
/*
    @Test(priority = 16)
    public void testCommaSymbolIntoSalesResultField() throws InterruptedException {
    }

 */

    @Test(priority = 13)
    public void testDotSymbolIntoSalesResultField() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Thread.sleep(1500);
        homePage.fillOutNamesFields();
        homePage.useDefaultDropdownValue();
        homePage.salesResultField.sendKeys("1.000");
        homePage.submitButton.click();
        Thread.sleep(1500);
        String expectedActualSales = "$1";
        Assert.assertEquals(homePage.actualSales.getText(),expectedActualSales);
        String expectedTotalDifference = "$-4,999";
        Assert.assertEquals(homePage.totalDifference.getText(),expectedTotalDifference);
        String expectedResult = "$1";
        Assert.assertEquals(homePage.result.getText(),expectedResult);
        String expectedDifference = "$-4,999";
        Assert.assertEquals(homePage.difference.getText(),expectedDifference);
        Thread.sleep(1500);
        homePage.deleteSalesEntriesButton.click();
    }
/*
    @Test(priority = 18)
    public void testMaxDigitsSalesResultField() throws InterruptedException {
    }

 */


/*
    @Test(priority = 19)
    public void testSalesEntriesFunctionalityAfterLogout() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.useBlankNamesFields();
        homePage.fillOutSalesFormForPlusResult();
        homePage.deleteSalesEntriesButton.isDisplayed();
        homePage.logOutButton.click();
        WebDriverWait waitloginButton = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitloginButton.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/form/button")));
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login();
        homePage.verifyHomePage();
        homePage.deleteSalesEntriesButton.isDisplayed();
    }

 */


    @AfterTest
    public void cleanup() {
        driver.quit();
    }


}



