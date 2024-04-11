package sharedData;

import sharedData.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SharedData {
    private WebDriver webDriver;
    @BeforeMethod
    public void prepareDriver(){

        webDriver = new BrowserFactory().getBrowserInstance();

//        webDriver = new ChromeDriver();
//        webDriver.get("https://demoqa.com/");
//        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void clearDriver(){
        webDriver.quit();
    }
    public WebDriver getWebDriver() {
        return webDriver;
    }
}
