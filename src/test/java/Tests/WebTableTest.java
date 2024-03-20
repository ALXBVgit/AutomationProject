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

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToElementsPage();

        ElementPage elementPage = new ElementPage(getWebDriver());
        elementPage.naviagetToWebtablePage();

        String firstnameValue="Alex";
        String lastNameValue="Mirza";
        String emailAddr="email@gmail.com";
        String ageValue="43";
        String salaryValue="999";
        String departmentValue="QA Testing";
        String firstnameModifyValue="Gabriel";
        String editAgeValue="44";

        WebTablePage webTablePage = new WebTablePage(getWebDriver());
        webTablePage.addNewEntry(firstnameValue, lastNameValue, emailAddr, ageValue, salaryValue, departmentValue);
        webTablePage.editEntry(firstnameModifyValue, editAgeValue);
        webTablePage.deleteEntry();
    }
}
