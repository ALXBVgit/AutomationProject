package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementPage extends BasePage{
    public ElementPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTableField;

    public void naviagetToWebtablePage(){
        elementMethods.clickElement(webTableField);

    }
}
