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


    public void addNewEntry(String firstnameValue, String lastNameValue,
                            String emailAddr, String ageValue, String salaryValue){

        elementMethods.fillElement(firstnameField, firstnameValue);
        elementMethods.fillElement(lastNameField, lastNameValue);
        elementMethods.fillElement(emailField, emailAddr);
        elementMethods.fillElement(ageField, ageValue);
        elementMethods.fillElement(salaryField, salaryValue);
    }
}
