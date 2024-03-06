package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends SharedData {
 //  public WebDriver webDriver;

    @Test
    public void windowMethod(){
        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        WindowMethods windowMethods = new WindowMethods(getWebDriver());

        elementMethods.scrollElementByPixel(0, 450);
        
        WebElement consentField=getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        WebElement alertFramesField=getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));

        elementMethods.clickElement(alertFramesField);

        WebElement browserWindowField=getWebDriver().findElement(By.xpath("//span[text()='Browser Windows']"));

        elementMethods.clickElement(browserWindowField);

        WebElement newTabButton=getWebDriver().findElement(By.id("tabButton"));
        newTabButton.click();

        //trebuie sa identificam numarul de tab-uri deschise
//        List<String> tabsOpened = new ArrayList<>(webDriver.getWindowHandles());
//        System.out.println("Tab-ul curent are url-ul "+webDriver.getCurrentUrl());
//        webDriver.switchTo().window(tabsOpened.get(1));
//        System.out.println("Tab-ul curent are url-ul "+webDriver.getCurrentUrl());

        windowMethods.switchSpecifictabWindow(1);
        //ca sa inchidem tab-ul curent = close
        //ca sa inchidem browser-ul = quit

//        webDriver.close();
        windowMethods.closeCurrentTabWindow();
        windowMethods.switchSpecifictabWindow(0);
//        webDriver.switchTo().window(tabsOpened.get(0));

        WebElement newWindowButton = getWebDriver().findElement(By.id("windowButton"));
        elementMethods.clickElement(newWindowButton);

        windowMethods.switchSpecifictabWindow(1);

        windowMethods.closeCurrentTabWindow();
        windowMethods.switchSpecifictabWindow(0);

    }
}
