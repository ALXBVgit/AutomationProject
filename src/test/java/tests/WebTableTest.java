package tests;

import objectData.WebTableObject;
import pages.ElementPage;
import pages.HomePage;
import pages.WebTablePage;
import propertyUtility.PropertyUtility;
import sharedData.SharedData;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {

    @Test
    public void metodaTest(){

        PropertyUtility propertyUtility = new PropertyUtility("WebTableData");
        WebTableObject webTableObject = new WebTableObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToElementsPage();

        ElementPage elementPage = new ElementPage(getWebDriver());
        elementPage.naviagetToWebtablePage();

        WebTablePage webTablePage = new WebTablePage(getWebDriver());
        webTablePage.addNewEntry(webTableObject);

        webTableObject.setFirstnameValue("Bogdan");
        webTableObject.setAgeValue("35");

        webTablePage.editEntry(webTableObject);
        webTablePage.deleteEntry();
    }
}
