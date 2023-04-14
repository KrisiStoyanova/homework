package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseClass {

    public static WebDriver driver;

    String driverPath = "C:\\Users\\user\\IdeaProjects\\FinalProjectMod3Theory\\src\\test\\resources\\drivers\\chromedriver.exe";

    @FindBy(xpath = "//*[@id=\"see-book-Git Pocket Guide\"]/a")
    public
    WebElement productLink;

    @FindBy(xpath = "//*[@id=\"addNewRecordButton\"]")
    public
    WebElement backButton;

}




