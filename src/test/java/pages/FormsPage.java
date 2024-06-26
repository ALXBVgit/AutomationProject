package pages;

import loggerUtility.LoggerUtiliyy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage{
    public FormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceFormField;

    public void navigateToPracticeForm(){
        elementMethods.clickElement(practiceFormField);
        LoggerUtiliyy.infotest("User clicks the practice form button");
    }
}
