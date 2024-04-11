package tests;

import helperMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alexPractice {
    public WebDriver webDriver;

    @Test
    public void metodaTest(){

        webDriver = new ChromeDriver();
        webDriver.get("https://snowsports.ro/");
        webDriver.manage().window().maximize();

        ElementMethods elementMethods = new ElementMethods(webDriver);
        WebElement cookiesAccept = webDriver.findElement(By.id("__gomagCookiePolicy"));
     // cookiesAccept.click();
        elementMethods.clickElement(cookiesAccept);

    }
}
