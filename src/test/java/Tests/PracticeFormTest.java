package Tests;

import HelperMethods.ElementMethods;
import ObjectData.PracticeFormObject;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.util.Arrays;
import java.util.List;

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
