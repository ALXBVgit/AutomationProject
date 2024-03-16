package Pages;

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
        windowMethods.switchSpecifictabWindow(1);
        windowMethods.closeCurrentTabWindow();
        windowMethods.switchSpecifictabWindow(0);
    }
    public void interractWithNewWindow(){
        elementMethods.clickElement(newWindowButton);
        windowMethods.switchSpecifictabWindow(1);
        windowMethods.closeCurrentTabWindow();
        windowMethods.switchSpecifictabWindow(0);
    }
}
