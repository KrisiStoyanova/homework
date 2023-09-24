package com.java_parabank_demo.Pages.Account_Services;

import com.java_parabank_demo.Pages.LoadTheWebsite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests extends Authorization_Forms_Elements {
    public static WebDriver driver;
    String currentURL;
    String expectedURL;

    @BeforeTest
    public void OpenTheWebsite(){
        //System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        new LoadTheWebsite().LoadTheWebsite(driver);
    }

    @Test(priority = 1)
    public void checkIfTheWebsiteURLIsCorrect(){
        currentURL = driver.getCurrentUrl();
        expectedURL = "https://parabank.parasoft.com/parabank/index.htm";
        Assert.assertEquals(currentURL, expectedURL);
    }

    @Test(priority = 2)
    public void Login(){
        Log_In_Form log_in_form = new Log_In_Form();
        log_in_form.Login();
    }

    @Test(priority = 3)
    public void updateContactInfo() throws InterruptedException {
        Update_Contact_Info_Form update_contact_info_form = new Update_Contact_Info_Form();
        update_contact_info_form.updateContactInfo();
    }

    @Test(priority = 4)
    public void payBill() throws InterruptedException {
        Bill_Pay_Form bill_pay_form = new Bill_Pay_Form();
        bill_pay_form.GoToBillPaymentService();
        bill_pay_form.payBill();
    }

    @Test(priority = 5)
    public void openNewAccount() throws InterruptedException {
        Open_New_Account_Form open_new_account_form = new Open_New_Account_Form();
        open_new_account_form.GoToTheOpenNewAccountForm();
        open_new_account_form.OpenNewSavingsAccount();
        open_new_account_form.GoToTheOpenNewAccountForm();
        open_new_account_form.OpenNewCheckingAccount();
    }

    @Test(priority = 6)
    public void GoToTheAccountsOverviewForm() throws InterruptedException {
        Accounts_Overview_Form accounts_overview = new Accounts_Overview_Form();
        accounts_overview.GoToTheAccountsOverviewForm();
    }

    @Test(priority = 7)
    public void GoToTheRequestLoanForm() {
        Request_Loan_Form request_loan = new Request_Loan_Form();
        request_loan.GoToTheRequestLoanForm();
    }

    @Test(priority = 8)
    public void Logout(){
        Log_Out logout = new Log_Out();
        logout.Logout();
    }

    @Test(priority = 9)
    public void AboutUsPageRedirect(){
        About_Us aboutUs = new About_Us();
        aboutUs.AboutUsPageRedirect();
    }

    @AfterTest
    public void cleanup() {
        driver.quit();
    }


}
