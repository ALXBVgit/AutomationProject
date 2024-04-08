package Pages;

import LoggerUtility.LoggerUtiliyy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "alertButton")
    private WebElement alert1Click;
    @FindBy(id = "timerAlertButton")
    private WebElement alertTimerClick;
    @FindBy(id = "promtButton")
    private WebElement promptAlert;
    @FindBy(id = "confirmButton")
    private WebElement Alert3confirmButton;
    @FindBy(id = "confirmResult")
    private WebElement allert3rdtext;
    @FindBy(id = "promptResult")
    private WebElement promptAlertResult;

    public void dealWithAcceptAlert(){
        elementMethods.clickElement(alert1Click);
        LoggerUtiliyy.infotest("User clicks the simple alert");
        alertMethods.acceptAlert();
        LoggerUtiliyy.infotest("User accepts the alert");
    }
    public void dealWithDelayAlert(){
        elementMethods.clickElement(alertTimerClick);
        LoggerUtiliyy.infotest("User clicks the timer alert");
        alertMethods.acceptAlert();
        LoggerUtiliyy.infotest("User accepts the alert");
    }
    public void dealWithPromptButton(String text){
        elementMethods.clickElement(promptAlert);
        LoggerUtiliyy.infotest("User clicks the prompt");
        alertMethods.fillAlert(text);
        LoggerUtiliyy.infotest("User fills in the text");
        elementMethods.validateElementText(promptAlertResult, "You entered "+text);
        LoggerUtiliyy.infotest("Validating the entered text");
    }
    public void dealWithCancelButton(){
        elementMethods.clickElement(Alert3confirmButton);
        LoggerUtiliyy.infotest("User clicks confirm alert");
        alertMethods.cancelAlert();
        LoggerUtiliyy.infotest("User cancels the alert");
        elementMethods.validateElementText(allert3rdtext, "You selected Cancel");
        LoggerUtiliyy.infotest("UValidating the cancel alert");
    }

}
