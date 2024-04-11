package pages;

import loggerUtility.LoggerUtiliyy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertWindowFramePage extends BasePage{
    public AlertWindowFramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement browserAlertsField;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserWindowField;
    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement alertFramesPage;

   public void navigateToAlertsPage(){
        elementMethods.scrollElementByPixel(0,450);
       LoggerUtiliyy.infotest("User scroll down the page");
        elementMethods.clickElement(browserAlertsField);
       LoggerUtiliyy.infotest("User clicks the alert");
   }
   public void navigateToWindowPage(){
       elementMethods.scrollElementByPixel(0,250);
       LoggerUtiliyy.infotest("User scroll down the page");
       elementMethods.clickElement(browserWindowField);
       LoggerUtiliyy.infotest("User clicks the browser");

   }
   public void navigateToFramePage(){
       elementMethods.scrollElementByPixel(0,250);
       LoggerUtiliyy.infotest("User scroll down the page");
       elementMethods.clickElement(alertFramesPage);
       LoggerUtiliyy.infotest("User sclicks the element");

   }
}

