package tests;

import objectData.PracticeFormObject;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;
import sharedData.SharedData;
import org.testng.annotations.Test;

public class PracticeFormTest extends Hooks {

    @Test
    public void metodaTest() {

        PropertyUtility propertyUtility = new PropertyUtility("practiceFormData");
        PracticeFormObject practiceFormObject = new PracticeFormObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getWebDriver());
        formsPage.navigateToPracticeForm();

        PracticeFormPage practiceFormPage = new PracticeFormPage(getWebDriver());
        practiceFormPage.fillInEntireForm(practiceFormObject);

        practiceFormPage.validatePracticeFormTable(practiceFormObject);

//        elementMethods.clickElemForce(closeForm);
    }
}
