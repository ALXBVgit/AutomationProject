package Pages;

import ObjectData.WebTableObject;
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

    public void addNewEntry(WebTableObject webTableObject){
        elementMethods.clickElement(addField);
        elementMethods.fillElement(firstnameField, webTableObject.getFirstnameValue());
        elementMethods.fillElement(lastNameField, webTableObject.getLastNameValue());
        elementMethods.fillElement(emailField, webTableObject.getEmailAddr());
        elementMethods.fillElement(ageField, webTableObject.getAgeValue());
        elementMethods.fillElement(salaryField, webTableObject.getSalaryValue());
        elementMethods.fillElement(departmentField, webTableObject.getDepartmentValue());
        elementMethods.clickElement(submitButton);
    }
    public void editEntry(WebTableObject webTableObject){
        elementMethods.scrollElementByPixel(0, 250);
        elementMethods.clickElement(editButton);
        elementMethods.refillElement(firstnameField, webTableObject.getFirstnameValue());
        elementMethods.refillElement(ageField, webTableObject.getAgeValue());
        elementMethods.clickElement(submitButton);
    }
    public void deleteEntry(){
        elementMethods.clickElement(deleteButton);
    }
}
