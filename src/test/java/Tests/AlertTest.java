package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import Pages.AlertPage;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest extends SharedData {

    @Test
    public void alertButtons() {

        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        AlertMethods alertMethods = new AlertMethods(getWebDriver());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToAlertsPage();

        AlertPage alertPage = new AlertPage(getWebDriver());

        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();


//        WebElement alert1Click = getWebDriver().findElement(By.id("alertButton"));
//        elementMethods.clickElement(alert1Click);
////        Alert firstAlert = getWebDriver().switchTo().alert();
////        String firstAlertText = firstAlert.getText();
////        Assert.assertTrue(firstAlertText.contains("You clicked a button"), "Validare esuata, text incorect");
//        alertMethods.acceptAlert();

//        WebElement alertTimerClick = getWebDriver().findElement(By.id("timerAlertButton"));
//        elementMethods.clickElement(alertTimerClick);
//        alertMethods.acceptAlert();

        String acceptValue="Ok";
        String cancelValue="Cancel";
        WebElement Alert3confirmButton = getWebDriver().findElement(By.id("confirmButton"));
        elementMethods.clickElement(Alert3confirmButton);
        alertMethods.cancelAlert();


        WebElement allert3rdtext = getWebDriver().findElement(By.id("confirmResult"));
      //  Assert.assertEquals(allert3rd.getText(), "You selected "+cancelValue);
        elementMethods.validateElementText(allert3rdtext, "You selected "+cancelValue);

        elementMethods.clickElement(Alert3confirmButton);
//        Alert thirdAlert1 = getWebDriver().switchTo().alert(); //codul vechi inainte de AlertMethods
        alertMethods.acceptAlert();
//        Assert.assertEquals(allert3rd.getText(), "You selected " + acceptValue);
        elementMethods.validateElementText(allert3rdtext, "You selected "+acceptValue);

        WebElement promptAlert = getWebDriver().findElement(By.id("promtButton"));
        elementMethods.clickElement(promptAlert);
     //   Alert fourthAlert = webDriver.switchTo().alert();
        String fillintext = "blablabla";
        alertMethods.fillAlert(fillintext);
      //  alertMethods.acceptAlert();
        WebElement promptAlertResult = getWebDriver().findElement(By.id("promptResult"));
        elementMethods.validateElementText(promptAlertResult, "You entered "+fillintext);

    }
}
