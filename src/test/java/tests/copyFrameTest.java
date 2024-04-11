package tests;

import helperMethods.ElementMethods;
import helperMethods.FrameMethods;
import sharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class copyFrameTest extends SharedData {
   // comment pentru ca am adaugat mai sus extends ca sa preia pre-test conditions
   // public WebDriver webDriver;

    @Test
    public void windowMethod() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        FrameMethods frameMethods = new FrameMethods(getWebDriver());

        elementMethods.scrollElementByPixel(0,450);

//        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
//        elementMethods.clickElement(consentField);

        WebElement alertFramesField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(alertFramesField);

        elementMethods.scrollElementByPixel(0,250);
        WebElement browserFrameField = getWebDriver().findElement(By.xpath("//span[text()='Frames']"));
        elementMethods.clickElement(browserFrameField);

        //interactionam cu un iframe
        frameMethods.switchSpecificIframe("frame1");
       // webDriver.switchTo().frame("frame1");

        WebElement frameElement1 = getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frameElement1);

        //revenim la frame-ul curent
       // webDriver.switchTo().parentFrame();
        frameMethods.switchParentFrame();

      //  webDriver.switchTo().frame("frame2");
        frameMethods.switchSpecificIframe("frame2");
        WebElement frameElement2 = getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frameElement2);
    }
}
