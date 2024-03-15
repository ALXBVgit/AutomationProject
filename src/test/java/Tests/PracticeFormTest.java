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


//        practiceFormPage.validatePracticeFormTable(firstNameValue, lastNameValue, emailValue, mobileNumValue,
//                subjectValue, addressFieldValue, Hobbies, filePath);



//
//        //incepem validarile pentru tabelul completat
//        List<WebElement> labelFields=getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
//        List<WebElement> valueFields=getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));
//
//        Assert.assertEquals(labelFields.get(0).getText(), "Student Name");
//        Assert.assertEquals(valueFields.get(0).getText(), firstNameValue+" "+lastNameValue);
//
//        Assert.assertEquals(labelFields.get(1).getText(), "Student Email");
//        Assert.assertEquals(valueFields.get(1).getText(), userEmailValue);
//
//        Assert.assertEquals(labelFields.get(2).getText(), "Gender");
//        Assert.assertEquals(valueFields.get(2).getText(), "Male");
//
//        Assert.assertEquals(labelFields.get(3).getText(), "Mobile");
//        Assert.assertEquals(valueFields.get(3).getText(), mobileNumberValue);
//
//        //nu am validat inca data de nastere
//
//        Assert.assertEquals(labelFields.get(5).getText(), "Subjects");
//        Assert.assertEquals(valueFields.get(5).getText(), subjectValue);
//
//        Assert.assertEquals(labelFields.get(6).getText(), "Hobbies");
//        for (Integer index = 0; index < Hobbies.size(); index++) {
//            Assert.assertTrue(valueFields.get(6).getText().contains(Hobbies.get(index)));
//        }
//
//        Assert.assertEquals(labelFields.get(7).getText(), "Picture");
//        String[] arrayFile=filePath.split("/");
//        Integer desiredIndex=arrayFile.length -1;
//        Assert.assertEquals(valueFields.get(7).getText(), arrayFile[desiredIndex]);
//
//        Assert.assertEquals(labelFields.get(8).getText(), "Address");
//        Assert.assertEquals(valueFields.get(8).getText(), addressFieldValue);
//
//        Assert.assertEquals(labelFields.get(9).getText(), "State and City");
//        Assert.assertEquals(valueFields.get(9).getText(), stateAndCity);
//
//        elementMethods.scrollElementByPixel(0,450);
//        WebElement closeForm=getWebDriver().findElement(By.id("closeLargeModal"));
////        elementMethods.clickElement(closeForm);
//        elementMethods.clickElemForce(closeForm);
    }
}
