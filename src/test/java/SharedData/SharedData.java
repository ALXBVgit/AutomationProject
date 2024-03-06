package SharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    private WebDriver webDriver;

    @BeforeMethod
    public void prepareDriver(){
        //deschidem un browser Chrome
        webDriver = new ChromeDriver();
        //accesam un URL
        webDriver.get("https://demoqa.com/");

        //maximizarea ferestrei daca am rezolutie mica
        webDriver.manage().window().maximize();

        //wait implicit
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void clearDriver(){
        webDriver.quit();
    }
    public WebDriver getWebDriver() {
        return webDriver;
    }
}
