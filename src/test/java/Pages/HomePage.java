package Pages;

import HelperMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

//    pt ca am facut BasePage
//    private ElementMethods elementMethods;
//    private WebDriver webDriver;
//
//    public HomePage(WebDriver webDriver) {
//        this.webDriver = webDriver;
//        elementMethods = new ElementMethods(webDriver);
//        PageFactory.initElements(webDriver, this);
//    }

    public HomePage(WebDriver webDriver){
        super(webDriver);
    }
    @FindBy(className = "fc-button-label")
    private WebElement consentField;
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertFramesField;

    public void navigateToAlertFrameWindowPage(){
        elementMethods.scrollElementByPixel(0,450);
        elementMethods.clickElement(consentField);
        elementMethods.clickElement(alertFramesField);

    }
}
