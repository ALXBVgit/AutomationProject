package Tests;

import HelperMethods.ElementMethods;
import Pages.ElementPage;
import Pages.HomePage;
import Pages.WebTablePage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {

    @Test
    public void metodaTest(){

//        ElementMethods elementMethods = new ElementMethods(getWebDriver());
//        elementMethods.scrollElementByPixel(0,450);

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToElementsPage();


        String firstnameValue="Alex";
        String lastNameValue="Mirza";
        String emailAddr="alexandru.mirza@gmail.com";
        String ageValue="43";
        String salaryValue="999";



        ElementPage elementPage = new ElementPage(getWebDriver());
        elementPage.naviagetToWebtablePage();
        WebTablePage webTablePage = new WebTablePage(getWebDriver());
        webTablePage.addNewEntry(firstnameValue, lastNameValue, emailAddr, ageValue, salaryValue);





//        WebElement elementsField=getWebDriver().findElement(By.xpath("//h5[text()='Elements']"));
//        elementMethods.clickElement(elementsField);


//
//        elementMethods.scrollElementByPixel(0,250);
//        WebElement webTableField=getWebDriver().findElement(By.xpath("//span[text()='Web Tables']"));
//        elementMethods.clickElement(webTableField);
//
//        WebElement addField=getWebDriver().findElement(By.id("addNewRecordButton"));
//        elementMethods.clickElement(addField);

//        WebElement firstnameField=getWebDriver().findElement(By.id("firstName"));
//        String firstnameValue="Alex";
//        elementMethods.fillElement(firstnameField, firstnameValue);
//      //  firstnameField.sendKeys(firstnameValue);
//
//        WebElement lastNameField=getWebDriver().findElement(By.id("lastName"));
//        String lastNameValue="Mirza";
//        elementMethods.fillElement(lastNameField, lastNameValue);
//       // lastNameField.sendKeys(lastNameValue);
//
//        WebElement emailField=getWebDriver().findElement(By.id("userEmail"));
//        String emailAddr="alexandru.mirza@gmail.com";
//        elementMethods.fillElement(emailField, emailAddr);
//      //  emailField.sendKeys(emailAddr);
//
//        WebElement ageField=getWebDriver().findElement(By.id("age"));
//        String ageValue="43";
//        elementMethods.fillElement(ageField, ageValue);
//       // ageField.sendKeys(ageValue);
//
//        WebElement salaryField=getWebDriver().findElement(By.id("salary"));
//        String salaryValue="999";
//        elementMethods.fillElement(salaryField, salaryValue);
       // salaryField.sendKeys(salaryValue);






//
//
//
//        WebElement departmentField=getWebDriver().findElement(By.id("department"));
//        String departmentValue="QA Testing";
//        elementMethods.fillElement(departmentField, departmentValue);
//       // departmentField.sendKeys(departmentValue);
//
//        WebElement submitButton=getWebDriver().findElement(By.id("submit"));
//        elementMethods.clickElement(submitButton);
//
//        //modificam entry-ul adaugat mai sus
//
//        WebElement editField=getWebDriver().findElement(By.id("edit-record-4"));
//        elementMethods.clickElement(editField);
//
//        WebElement firstnameModifyField=getWebDriver().findElement(By.id("firstName"));
//        String firstnameModifyValue="Gabriel";
////        firstnameModifyField.clear(); //stergem numele completat anterior
////        firstnameModifyField.sendKeys(firstnameModifyValue);
//        elementMethods.refillElement(firstnameModifyField, firstnameModifyValue);
//
//        WebElement editAgeField=getWebDriver().findElement(By.id("age"));
//        String editAgeValue="44";
//        elementMethods.refillElement(editAgeField, editAgeValue);
//
//        WebElement submitModifyButton=getWebDriver().findElement(By.id("submit"));
//        elementMethods.clickElement(submitModifyButton);
//
//        //stergem noul entry
//        WebElement deleteButton=getWebDriver().findElement(By.id("delete-record-4"));
//        elementMethods.clickElement(deleteButton);
    }
}
