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
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToAlertsPage();

        AlertPage alertPage = new AlertPage(getWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithPromptButton("Moo moo, Baa baa");
        alertPage.dealWithCancelButton();
    }
}
