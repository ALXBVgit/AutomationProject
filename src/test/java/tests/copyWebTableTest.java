package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class copyWebTableTest {

    public WebDriver webDriver;

    @Test
    public void metodaTest(){
        //deschidem un browser Chrome
        webDriver=new ChromeDriver();
        //accesam un URL
        webDriver.get("https://demoqa.com/");

        //maximizarea ferestrei daca am rezolutie mica
        webDriver.manage().window().maximize();

        //facem scroll in pagina
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,450)", "");

        //identificam un element
        WebElement consentField=webDriver.findElement(By.className("fc-button-label"));
        consentField.click();

        WebElement elementsField=webDriver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsField.click();

        js.executeScript("window.scrollBy(0,10)", "");
        WebElement webTableField=webDriver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTableField.click();

        WebElement addField=webDriver.findElement(By.id("addNewRecordButton"));
        addField.click();

        WebElement firstnameField=webDriver.findElement(By.id("firstName"));
        String firstnameValue="Alex";
        firstnameField.sendKeys(firstnameValue);

        WebElement lastNameField=webDriver.findElement(By.id("lastName"));
        String lastNameValue="Mirza";
        lastNameField.sendKeys(lastNameValue);

        WebElement emailField=webDriver.findElement(By.id("userEmail"));
        String emailAddr="alexandru.mirza@gmail.com";
        emailField.sendKeys(emailAddr);

        WebElement ageField=webDriver.findElement(By.id("age"));
        String ageValue="43";
        ageField.sendKeys(ageValue);

        WebElement salaryField=webDriver.findElement(By.id("salary"));
        String salaryValue="999";
        salaryField.sendKeys(salaryValue);

        WebElement departmentField=webDriver.findElement(By.id("department"));
        String departmentValue="QA Testing";
        departmentField.sendKeys(departmentValue);

        WebElement submitButton=webDriver.findElement(By.id("submit"));
        submitButton.click();

        //modificam entry-ul adaugat mai sus

        WebElement editField=webDriver.findElement(By.id("edit-record-4"));
        editField.click();

        WebElement firstnameModifyField=webDriver.findElement(By.id("firstName"));
        String firstnameModifyValue="Gabriel";
        firstnameModifyField.clear(); //stergem numele completat anterior
        firstnameModifyField.sendKeys(firstnameModifyValue);

        WebElement editAgeField=webDriver.findElement(By.id("age"));
        String editAgeValue="44";
        editAgeField.clear();
        editAgeField.sendKeys(editAgeValue);

        WebElement submitModifyButton=webDriver.findElement(By.id("submit"));
        submitModifyButton.click();

        //stergem noul entry
        WebElement deleteButton=webDriver.findElement(By.id("delete-record-4"));
        deleteButton.click();

        //inchidem browser-ul
        //webDriver.close(); inchide doar tabul curent
        //webDriver.quit(); inchide browser-ul
        webDriver.quit();
    }
}
