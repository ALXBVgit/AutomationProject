package Pages;

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
        elementMethods.printElementText(frameElement1);
        frameMethods.switchParentFrame();
        frameMethods.switchSpecificIframe("frame2");
        elementMethods.printElementText(frameElement1);
    }
}
