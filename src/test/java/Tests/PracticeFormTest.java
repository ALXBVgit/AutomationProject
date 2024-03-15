package Tests;

import HelperMethods.ElementMethods;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
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
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getWebDriver());
        formsPage.navigateToPracticeForm();

        String firstNameValue = "Alex";
        String lastNameValue = "Mirza";
        String emailValue = "email@gmail.com";
        String mobileNumValue = "0722222222";
        String monthDateOfBirthValue = "June";
        String yearOfBirthValue = "1980";
        String dobDayvalue = "18";
        String genderValue = "Male";
        List<String> Hobbies= Arrays.asList("Sports", "Music", "Reading");
        String subjectValue="Economics";
        String filePath="src/test/resources/IMG_5208.jpg";
        String addressFieldValue="Brasov, Turnului 5";
        String stateInputValue = "NCR";
        String cityValue = "Delhi";

        PracticeFormPage practiceFormPage = new PracticeFormPage(getWebDriver());
        practiceFormPage.fillFirstName(firstNameValue);
        practiceFormPage.fillLastName(lastNameValue);
        practiceFormPage.fillEmailField(emailValue);
        practiceFormPage.fillMobileNumber(mobileNumValue);
        practiceFormPage.pickDateofBirth(monthDateOfBirthValue, yearOfBirthValue, dobDayvalue);
        practiceFormPage.pickGender(genderValue);
        practiceFormPage.pickHobbies(Hobbies);
        practiceFormPage.pickSubjects(subjectValue);
        practiceFormPage.UploadPicture(filePath);
        practiceFormPage.pickAddress(addressFieldValue);
        practiceFormPage.pickState(stateInputValue);
        practiceFormPage.pickCity(cityValue);
        practiceFormPage.clickSubmit();


        practiceFormPage.validatePracticeFormTable(firstNameValue, lastNameValue, emailValue, mobileNumValue,
                subjectValue, addressFieldValue, Hobbies, filePath);

//        elementMethods.clickElemForce(closeForm);
    }
}
