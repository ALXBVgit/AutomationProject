package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends  BasePage{
    public WebTablePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "addNewRecordButton")
    private WebElement addField;
    @FindBy(id = "firstName")
    private WebElement firstnameField;
    @FindBy (id = "lastName")
    private WebElement lastNameField;
    @FindBy(id = "userEmail")
    private WebElement emailField;
    @FindBy(id = "age")
    private WebElement ageField;
    @FindBy (id = "salary")
    private WebElement salaryField;
    @FindBy(id = "department")
    private WebElement departmentField;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindBy(id = "edit-record-4")
    private WebElement editButton;
    @FindBy(id = "delete-record-4")
    private WebElement deleteButton;

    public void addNewEntry(String firstnameValue, String lastNameValue,
                            String emailAddr, String ageValue, String salaryValue, String departmentValue){
        elementMethods.clickElement(addField);
        elementMethods.fillElement(firstnameField, firstnameValue);
        elementMethods.fillElement(lastNameField, lastNameValue);
        elementMethods.fillElement(emailField, emailAddr);
        elementMethods.fillElement(ageField, ageValue);
        elementMethods.fillElement(salaryField, salaryValue);
        elementMethods.fillElement(departmentField, departmentValue);
        elementMethods.clickElement(submitButton);
    }
    public void editEntry(String firstnameValue, String ageValue){
        elementMethods.scrollElementByPixel(0, 250);
        elementMethods.clickElement(editButton);
        elementMethods.refillElement(firstnameField, firstnameValue);
        elementMethods.refillElement(ageField, ageValue);
        elementMethods.clickElement(submitButton);
    }
    public void deleteEntry(){
        elementMethods.clickElement(deleteButton);
    }
}
