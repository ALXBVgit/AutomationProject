package tests;

import objectData.PracticeFormObject;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import propertyUtility.PropertyUtility;
import sharedData.SharedData;
import org.testng.annotations.Test;

public class PracticeFormTest extends SharedData {

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
