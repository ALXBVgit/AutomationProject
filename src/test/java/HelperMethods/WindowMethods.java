package HelperMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {
    private WebDriver webDriver;

    public WindowMethods(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public void switchSpecifictabWindow(Integer index){
        List<String> tabsOpened = new ArrayList<>(webDriver.getWindowHandles());
      //  System.out.println("Tab-ul curent are url-ul "+webDriver.getCurrentUrl());
        webDriver.switchTo().window(tabsOpened.get(index));
        System.out.println("Tab-ul curent are url-ul "+webDriver.getCurrentUrl());
    }

    public void closeCurrentTabWindow(){

        webDriver.close();
    }
}
