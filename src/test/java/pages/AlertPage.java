package pages;

import database.Queries.AlertTable;
import loggerUtility.LoggerUtiliyy;
import objectData.AlertObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage{

    //definim un obiect de tipul tabelului Alert Table
    private AlertTable alertTable;

    public AlertPage(WebDriver webDriver) {
        super(webDriver);
        alertTable = new AlertTable();
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
    public void dealWithPromptButton(AlertObject alertObject){
        elementMethods.clickElemForce(promptAlert);
        LoggerUtiliyy.infotest("User clicks the prompt");
        alertMethods.fillAlert(alertObject.getAlertValue());
        LoggerUtiliyy.infotest("User fills in the text: " + alertObject.getAlertValue());
        elementMethods.validateElementText(promptAlertResult, "You entered "+alertObject.getAlertValue());
        LoggerUtiliyy.infotest("Validating the entered text");
        alertTable.insertIntoAlert(alertObject);
        LoggerUtiliyy.infotest("All the data was inserted to DB with success in AlertTable");
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
