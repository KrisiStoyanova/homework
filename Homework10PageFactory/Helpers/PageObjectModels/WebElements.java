package Homework10PageFactory.Helpers.PageObjectModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebElements {

    //Locating 'Sign up' button
    @FindBy(linkText = "Sign up")
    WebElement signUpButton;

    //Locating 'Work-Space' link
    @FindBy(xpath = "//*[@id='testing']")
    WebElement link;

    //Locating dropdown
    @FindBy(id = "lang")
    WebElement dropdown;

}




