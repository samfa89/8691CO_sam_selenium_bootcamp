package page_object;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class HomePage extends BasePage {
    @FindBy (xpath ="//*[@id=e1]/a/div[2]/span")
    private WebElement  clickButton;

}
