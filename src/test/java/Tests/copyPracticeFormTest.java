package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class copyPracticeFormTest extends SharedData {

    //comment pentru ca am preluat cu extends SharedData pre/post test conditions
    //public WebDriver webDriver;

    @Test
    public void metodaTest() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        elementMethods.scrollElementByPixel(0,450);

        WebElement consentField=getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        WebElement formsField=getWebDriver().findElement(By.xpath("//h5[text()='Forms']"));
        elementMethods.clickElement(formsField);

        elementMethods.scrollElementByPixel(0,50);
        WebElement webTableField=getWebDriver().findElement(By.xpath("//span[text()='Practice Form']"));
        elementMethods.clickElement(webTableField);

        WebElement firstName=getWebDriver().findElement(By.id("firstName"));
        String firstNameValue="Alex";
      //  firstName.sendKeys(firstNameValue);
        elementMethods.fillElement(firstName, firstNameValue);

        WebElement lastName=getWebDriver().findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastNameValue="Mirza";
        elementMethods.fillElement(lastName, lastNameValue);

        //ca sa modific din css in xpath: adaug // si @
        //exemplu: input[placeholder='Last Name'] -> //input[@placeholder='Last Name']

        WebElement userEmail=getWebDriver().findElement(By.id("userEmail"));
        String userEmailValue="alexandru.mirza@gmail.com";
        elementMethods.fillElement(userEmail, userEmailValue);

        WebElement mobileNumber=getWebDriver().findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String mobileNumberValue="0722222222";
        elementMethods.fillElement(mobileNumber, mobileNumberValue);

        //        String genderValue="Male";
        WebElement userGender=getWebDriver().findElement(By.cssSelector("label[for='gender-radio-1']"));
        elementMethods.clickElement(userGender);
       // elementMethods.clickElemForce(userGender);

        //comment pana rezolv date picker la year :-P
        WebElement dateOfBirthField=getWebDriver().findElement(By.cssSelector(".react-datepicker__input-container"));
        elementMethods.clickElement(dateOfBirthField);

        WebElement monthDateOfBirth=getWebDriver().findElement(By.cssSelector(".react-datepicker__month-select"));
        String monthValue = "June";
//        Select monthSelect=new Select(monthDateOfBirth);
//        monthSelect.selectByVisibleText("June");
        elementMethods.selectTextElement(monthDateOfBirth, monthValue);

        WebElement yearOfBirth=getWebDriver().findElement(By.cssSelector(".react-datepicker__year-select"));
        String yearValue = "1980";
//        Select yeasrSelect=new Select(yearOfBirth);
//        yeasrSelect.selectByValue("1980");
        elementMethods.selectValueElement(yearOfBirth, yearValue);

        List<WebElement> dayDateofBirthField = getWebDriver().findElements(By.xpath("//div[not(contains(@class, 'react-datepicker__day--outside-month'))" +
                        "and contains(@class, 'react-datepicker__day react-datepicker__day')]"));

        elementMethods.scrollElementByPixel(0,450);

        String dayValue="25";
        for (Integer i=0; i<dayDateofBirthField.size(); i++){
            if (dayDateofBirthField.get(i).getText().equals(dayValue)){
                dayDateofBirthField.get(i).click();
                break;
            }
        }

        //facem algoritm care sa selecteze valorile specificate
        List<String> Hobbies= Arrays.asList("Sports", "Music", "Reading");
        List<WebElement> HobbiesList=getWebDriver().findElements(By.xpath("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']"));
        for (Integer index=0; index<HobbiesList.size(); index++){
            String currentElementText=HobbiesList.get(index).getText();
            if (Hobbies.contains(currentElementText)){
                HobbiesList.get(index).click();
            }
        }

//        WebElement userHobby=webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
//        userHobby.click();

        String subjectValue="Economics";
        WebElement subjectField= getWebDriver().findElement(By.id("subjectsInput"));
//        subjectField.sendKeys("Economics");
//        subjectField.sendKeys(Keys.ENTER);
        elementMethods.fillPressElement(subjectField, subjectValue, Keys.ENTER);

        WebElement pictureField=getWebDriver().findElement(By.id("uploadPicture"));
        String filePath="src/test/resources/IMG_5208.jpg";
//        pictureField.sendKeys(new File(filePath).getAbsolutePath());
        elementMethods.fillElement(pictureField, new File(filePath).getAbsolutePath());

        WebElement addressField=getWebDriver().findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        String addressFieldValue="Brasov, Turnului 5";
//        addressField.sendKeys(addressFieldValue);
        elementMethods.fillElement(addressField, addressFieldValue);

        elementMethods.scrollElementByPixel(0,450);
        WebElement stateField=getWebDriver().findElement(By.xpath("//div[text()='Select State']"));
        elementMethods.clickElement(stateField);

        WebElement stateInputField=getWebDriver().findElement(By.id("react-select-3-input"));
        String stateInputValue = "NCR";
//        stateInputField.sendKeys(stateInputValue);
//        stateInputField.sendKeys(Keys.ENTER);
        elementMethods.fillPressElement(stateInputField, stateInputValue, Keys.ENTER);

        WebElement cityField=getWebDriver().findElement(By.xpath("//div[text()='Select City']"));
        elementMethods.clickElement(cityField);

        String stateAndCity="NCR Delhi";
        WebElement cityInputField=getWebDriver().findElement(By.id("react-select-4-input"));
        String cityValue = "Delhi";
//        cityInputField.sendKeys("Delhi");
//        cityInputField.sendKeys(Keys.ENTER);
        elementMethods.fillPressElement(cityInputField, cityValue, Keys.ENTER);

        elementMethods.scrollElementByPixel(0,250);
        WebElement submit=getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submit);

        //incepem validarile pentru tabelul completat
        List<WebElement> labelFields=getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
        List<WebElement> valueFields=getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));

        Assert.assertEquals(labelFields.get(0).getText(), "Student Name");
        Assert.assertEquals(valueFields.get(0).getText(), firstNameValue+" "+lastNameValue);

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

        Assert.assertEquals(labelFields.get(9).getText(), "State and City");
        Assert.assertEquals(valueFields.get(9).getText(), stateAndCity);

        elementMethods.scrollElementByPixel(0,450);
        WebElement closeForm=getWebDriver().findElement(By.id("closeLargeModal"));
//        elementMethods.clickElement(closeForm);
        elementMethods.clickElemForce(closeForm);
    }
}
