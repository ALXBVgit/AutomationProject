package Pages;

import LoggerUtility.LoggerUtiliyy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage{
    public FramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "sampleHeading")
    private WebElement frameElement1;

    public void dealWithFrame(){
        frameMethods.switchSpecificIframe("frame1");
        LoggerUtiliyy.infotest("Switch to frame index 1");
        elementMethods.printElementText(frameElement1);
        LoggerUtiliyy.infotest("get info from frame index 1");
        frameMethods.switchParentFrame();
        LoggerUtiliyy.infotest("Switch to parent frame");
        frameMethods.switchSpecificIframe("frame2");
        LoggerUtiliyy.infotest("Switch back to previous frame ");
        elementMethods.printElementText(frameElement1);
        LoggerUtiliyy.infotest("Info get text from frame");
    }
}
