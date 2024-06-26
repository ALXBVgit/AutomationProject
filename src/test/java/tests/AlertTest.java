package tests;

import objectData.AlertObject;
import objectData.PracticeFormObject;
import pages.AlertPage;
import pages.AlertWindowFramePage;
import pages.HomePage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;
import org.testng.annotations.Test;

public class AlertTest extends Hooks {

    @Test
    public void alertButtons() {

        PropertyUtility propertyUtility = new PropertyUtility("alertData");
        AlertObject alertObject = new AlertObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToAlertsPage();

        AlertPage alertPage = new AlertPage(getWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithPromptButton(alertObject);
        alertPage.dealWithCancelButton();
    }
}
