package pages;

import loggerUtility.LoggerUtiliyy;
import objectData.WebTableObject;
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

    public void addNewEntry(WebTableObject webTableObject){
        elementMethods.clickElement(addField);
        LoggerUtiliyy.infotest("User clicks add button");
        elementMethods.fillElement(firstnameField, webTableObject.getFirstnameValue());
        LoggerUtiliyy.infotest("User fills in first name");
        elementMethods.fillElement(lastNameField, webTableObject.getLastNameValue());
        LoggerUtiliyy.infotest("User fills in last name");
        elementMethods.fillElement(emailField, webTableObject.getEmailAddr());
        LoggerUtiliyy.infotest("User fills in email value");
        elementMethods.fillElement(ageField, webTableObject.getAgeValue());
        LoggerUtiliyy.infotest("User fills in age value");
        elementMethods.fillElement(salaryField, webTableObject.getSalaryValue());
        LoggerUtiliyy.infotest("User fills in salary field");
        elementMethods.fillElement(departmentField, webTableObject.getDepartmentValue());
        LoggerUtiliyy.infotest("User fills in department");
        elementMethods.clickElement(submitButton);
        LoggerUtiliyy.infotest("User clicks submit");
    }
    public void editEntry(WebTableObject webTableObject){
        elementMethods.scrollElementByPixel(0, 250);
        LoggerUtiliyy.infotest("User scrolls");
        elementMethods.clickElement(editButton);
        LoggerUtiliyy.infotest("User selects edit button");
        elementMethods.refillElement(firstnameField, webTableObject.getFirstnameValue());
        LoggerUtiliyy.infotest("User changes the firstname");
        elementMethods.refillElement(ageField, webTableObject.getAgeValue());
        LoggerUtiliyy.infotest("User changes the age");
        elementMethods.clickElement(submitButton);
        LoggerUtiliyy.infotest("User clicks submit");
    }
    public void deleteEntry(){
        elementMethods.clickElemForce(deleteButton);
        LoggerUtiliyy.infotest("User clicks on delete entry button");
    }
}
