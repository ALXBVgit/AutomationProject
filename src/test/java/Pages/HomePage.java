package Pages;

import HelperMethods.ElementMethods;
import LoggerUtility.LoggerUtiliyy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public HomePage(WebDriver webDriver){
        super(webDriver);
    }
//    @FindBy(className = "fc-button-label")
//    private WebElement consentField;
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertFramesField;
    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formsField;
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsField;

    public void navigateToAlertFrameWindowPage(){
        elementMethods.scrollElementByPixel(0,450);
        LoggerUtiliyy.infotest("User scroll down the page");
        elementMethods.clickElement(alertFramesField);
        LoggerUtiliyy.infotest("User clisck on element");

    }
    public void navigateToFormsPage(){
        elementMethods.scrollElementByPixel(0,450);
        LoggerUtiliyy.infotest("User scroll down the page");
        elementMethods.clickElement(formsField);
        LoggerUtiliyy.infotest("User clisck on element");
    }
    public void  navigateToElementsPage(){
        elementMethods.scrollElementByPixel(0,250);
        LoggerUtiliyy.infotest("User scroll down the page");
        elementMethods.clickElemForce(elementsField);
        LoggerUtiliyy.infotest("User clisck on element");
    }
}
