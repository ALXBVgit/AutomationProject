package Pages;

import LoggerUtility.LoggerUtiliyy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BasePage{
    public WindowPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "tabButton")
    private WebElement newTabButton;
    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    public void interractWithNewTab (){
        elementMethods.clickElement(newTabButton);
        LoggerUtiliyy.infotest("User clicks new Tab");
        windowMethods.switchSpecifictabWindow(1);
        LoggerUtiliyy.infotest("Switch to new tab with index 1");
        windowMethods.closeCurrentTabWindow();
        LoggerUtiliyy.infotest("Close current Tab");
        windowMethods.switchSpecifictabWindow(0);
        LoggerUtiliyy.infotest("Switch to specific tab index 0");
    }
    public void interractWithNewWindow(){
        elementMethods.clickElement(newWindowButton);
        LoggerUtiliyy.infotest("User clicks the new widow button");
        windowMethods.switchSpecifictabWindow(1);
        LoggerUtiliyy.infotest("Switch focus to new window index 1");
        windowMethods.closeCurrentTabWindow();
        LoggerUtiliyy.infotest("Close current window");
        windowMethods.switchSpecifictabWindow(0);
        LoggerUtiliyy.infotest("Switch back to Window index 0");
    }
}
