package Pages;

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
    @FindBy(id = "confirmButton")
    private WebElement Alert3confirmButton;
    @FindBy(id = "confirmResult")
    private WebElement allert3rdtext;
    @FindBy(id = "promtButton")
    private WebElement promptAlert;

    public void dealWithAcceptAlert(){
        elementMethods.clickElement(alert1Click);
        alertMethods.acceptAlert();
    }
    public void dealWithDelayAlert(){
        elementMethods.clickElement(alertTimerClick);
        alertMethods.acceptAlert();
    }

    public void dealWithPromptButton(String text){
        elementMethods.clickElement(promptAlert);
        alertMethods.fillAlert(text);
    }
    public void dealWithCancelButton(){
        elementMethods.clickElement(Alert3confirmButton);
        alertMethods.cancelAlert();
        elementMethods.validateElementText(allert3rdtext, "You selected Cancel");
    }
}
