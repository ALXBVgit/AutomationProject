package pages;

import helperMethods.AlertMethods;
import helperMethods.ElementMethods;
import helperMethods.FrameMethods;
import helperMethods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver webDriver;
    protected ElementMethods elementMethods;
    protected AlertMethods alertMethods;
    protected WindowMethods windowMethods;
    protected FrameMethods frameMethods;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        elementMethods = new ElementMethods(webDriver);
        alertMethods = new AlertMethods(webDriver);
        windowMethods = new WindowMethods(webDriver);
        frameMethods = new FrameMethods(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}