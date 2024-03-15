package Pages;

import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.management.monitor.StringMonitor;
import java.io.File;
import java.util.List;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastName;
    @FindBy(id = "userEmail")
    private WebElement userEmail;
    @FindBy(css = "input[placeholder='Mobile Number']")
    private WebElement mobileNumber;
    @FindBy(css = "label[for='gender-radio-1']")
    private WebElement userGender;
    @FindBy(css = ".react-datepicker__input-container")
    private WebElement dateOfBirthField;
    @FindBy(css = ".react-datepicker__month-select")
    private WebElement monthDateOfBirth;
    @FindBy(css = ".react-datepicker__year-select")
    private WebElement yearOfBirth;
    @FindBy(xpath = "//div[not(contains(@class, 'react-datepicker__day--outside-month'))" +
            "and contains(@class, 'react-datepicker__day react-datepicker__day')]")
    private List<WebElement> dayDateofBirthField;
    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    private List<WebElement> HobbiesList;
    @FindBy(id = "subjectsInput")
    private WebElement subjectField;
    @FindBy(css = "textarea[placeholder='Current Address']")
    private WebElement addressField;
    @FindBy(id = "uploadPicture")
    private WebElement uploadPicture;
    @FindBy(xpath = "//div[text()='Select State']")
    private WebElement stateField;
    @FindBy(id = "react-select-3-input")
    private WebElement stateInputField;
    @FindBy(xpath = "//div[text()='Select City']")
    private WebElement cityField;
    @FindBy(id = "react-select-4-input")
    private WebElement cityInputField;
    @FindBy(xpath = "//table/tbody/tr/td[1]")
    private List<WebElement> labelFields;
    @FindBy(xpath = "//table/tbody/tr/td[2]")
    private List<WebElement> valueFields;
    @FindBy(id = "submit")
    private WebElement submit;


    public void clickSubmit(){
        elementMethods.clickElemForce(submit);
    }

    public void fillFirstName(String firstNameValue){
        elementMethods.fillElement(firstName, firstNameValue);
        elementMethods.scrollElementByPixel(0,450);
    }
    public void fillLastName(String lastNameValue){
        elementMethods.fillElement(lastName, lastNameValue);
    }
    public void fillEmailField(String emailValue){
        elementMethods.fillElement(userEmail, emailValue);
    }
    public void fillMobileNumber(String mobileNumberValue){
        elementMethods.fillElement(mobileNumber, mobileNumberValue);
    }
    public void pickDateofBirth(String monthDateOfBirthValue, String yearOfBirthValue, String dobDayvalue){
        elementMethods.scrollElementByPixel(0,250);
        elementMethods.clickElement(dateOfBirthField);
        elementMethods.selectTextElement(monthDateOfBirth, monthDateOfBirthValue);
        elementMethods.selectValueElement(yearOfBirth, yearOfBirthValue);

        for (Integer i=0; i<dayDateofBirthField.size(); i++){
             if (dayDateofBirthField.get(i).getText().equals(dobDayvalue)) {
            dayDateofBirthField.get(i).click();
            break;
            }
        }
    }
    public void pickGender(String genderValue){
        elementMethods.clickElement(userGender);
    }
    public void pickHobbies(List<String> hobbies){
        for (Integer index=0; index<HobbiesList.size(); index++){
            String currentElementText=HobbiesList.get(index).getText();
            if (hobbies.contains(currentElementText)){

                elementMethods.clickElemForce(HobbiesList.get(index));
            }
        }
    }
    public void pickSubjects(String subjectValue){
        elementMethods.fillPressElement(subjectField, subjectValue, Keys.ENTER);
    }
    public void UploadPicture(String filePath){
        elementMethods.fillElement(uploadPicture, new File(filePath).getAbsolutePath());
    }
    public void pickAddress(String addressValue){
        elementMethods.fillElement(addressField, addressValue);
    }
    public void pickState(String stateInputValue){
        elementMethods.clickElemForce(stateField);
        elementMethods.fillPressElement(stateInputField, stateInputValue, Keys.ENTER);
    }
    public void pickCity(String cityValue){
        elementMethods.clickElemForce(cityField);
        elementMethods.fillPressElement(cityInputField, cityValue, Keys.ENTER);
    }
    public void validatePracticeFormTable(String firstName, String lastName, String userEmailValue,
                                          String mobileNumberValue, String subjectValue, String addressFieldValue,
                                          List<String> Hobbies, String filePath){

        Assert.assertEquals(labelFields.get(0).getText(), "Student Name");
        Assert.assertEquals(valueFields.get(0).getText(), firstName+" "+lastName);

        Assert.assertEquals(labelFields.get(1).getText(), "Student Email");
        Assert.assertEquals(valueFields.get(1).getText(), userEmailValue);

        Assert.assertEquals(labelFields.get(2).getText(), "Gender");
        Assert.assertEquals(valueFields.get(2).getText(), "Male");

        Assert.assertEquals(labelFields.get(3).getText(), "Mobile");
        Assert.assertEquals(valueFields.get(3).getText(), mobileNumberValue);

        //nu am validat inca data de nastere

        Assert.assertEquals(labelFields.get(5).getText(), "Subjects");
        Assert.assertEquals(valueFields.get(5).getText(), subjectValue);

        Assert.assertEquals(labelFields.get(6).getText(), "Hobbies");
        for (Integer index = 0; index < Hobbies.size(); index++) {
            Assert.assertTrue(valueFields.get(6).getText().contains(Hobbies.get(index)));
        }

        Assert.assertEquals(labelFields.get(7).getText(), "Picture");
        String[] arrayFile=filePath.split("/");
        Integer desiredIndex=arrayFile.length -1;
        Assert.assertEquals(valueFields.get(7).getText(), arrayFile[desiredIndex]);

        Assert.assertEquals(labelFields.get(8).getText(), "Address");
        Assert.assertEquals(valueFields.get(8).getText(), addressFieldValue);

//        Assert.assertEquals(labelFields.get(9).getText(), "State and City");
//        Assert.assertEquals(valueFields.get(9).getText(), stateAndCity);
    }

}
