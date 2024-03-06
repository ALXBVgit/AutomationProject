package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class copyAlertTest extends SharedData {
//commentat pentru ca am preluat before/after test din Shared Data
//    public WebDriver webDriver;
    @Test
    public void alertButtons() {

        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        AlertMethods alertMethods = new AlertMethods(getWebDriver());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

//        elementMethods.scrollElementByPixel(0,450);
//
//        //identificam un element
//        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
//        elementMethods.clickElement(consentField);
//
//        WebElement alertFramesField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        elementMethods.clickElement(alertFramesField);

//        elementMethods.scrollElementByPixel(0,450);
//        WebElement browserFrameField = getWebDriver().findElement(By.xpath("//span[text()='Alerts']"));
//        elementMethods.clickElement(browserFrameField);

        AlertWindowFramePage alertPage = new AlertWindowFramePage(getWebDriver());
        alertPage.navigateToAlertsPage();

        WebElement alert1Click = getWebDriver().findElement(By.id("alertButton"));
        elementMethods.clickElement(alert1Click);
        Alert firstAlert = getWebDriver().switchTo().alert();
        String firstAlertText = firstAlert.getText();
        Assert.assertTrue(firstAlertText.contains("You clicked a button"), "Validare esuata, text incorect");
        alertMethods.acceptAlert();


        WebElement alertTimerClick = getWebDriver().findElement(By.id("timerAlertButton"));
        elementMethods.clickElement(alertTimerClick);

       //wait explicit
       // WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.alertIsPresent());
       // Alert secondAlert = getWebDriver().switchTo().alert();
       // secondAlert.accept();
        alertMethods.acceptAlert();

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
