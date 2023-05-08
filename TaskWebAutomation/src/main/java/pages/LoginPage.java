package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/form/button")
    public
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        driver.get("https://robotsparebinindustries.com/#/");
        usernameField.sendKeys("maria");
        passwordField.sendKeys("thoushallnotpass");
        loginButton.click();
    }
}

