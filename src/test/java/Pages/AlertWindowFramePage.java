package Pages;

import HelperMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertWindowFramePage extends BasePage{
    public AlertWindowFramePage(WebDriver webDriver) {
        super(webDriver);
    }

//pt ca extends BasePage si fac constructor
//    private ElementMethods elementMethods;
//    private WebDriver webDriver;
//
////    public AlertWindowFramePage(WebDriver webDriver) {
////        this.webDriver = webDriver;
////        elementMethods = new ElementMethods(webDriver);
////        PageFactory.initElements(webDriver, this);
////    }

   @FindBy(xpath = "//span[text()='Alerts']")
   private WebElement browserAlertsField;



   public void navigateToAlertsPage(){
        elementMethods.scrollElementByPixel(0,450);
        elementMethods.clickElement(browserAlertsField);
   }

}

