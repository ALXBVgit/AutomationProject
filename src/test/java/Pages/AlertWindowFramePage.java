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

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement browserAlertsField;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserWindowField;
    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement alertFramesPage;

   public void navigateToAlertsPage(){
        elementMethods.scrollElementByPixel(0,450);
        elementMethods.clickElement(browserAlertsField);
   }
   public void navigateToWindowPage(){
       elementMethods.scrollElementByPixel(0,250);
       elementMethods.clickElement(browserWindowField);
   }
   public void navigateToFramePage(){
       elementMethods.scrollElementByPixel(0,250);
       elementMethods.clickElement(alertFramesPage);
   }
}

