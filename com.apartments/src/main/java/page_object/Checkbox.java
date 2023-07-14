package page_object;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkbox extends BasePage {

    @FindBy(xpath = "//*[@id=typeSelect]/span[3]/i[1]")
     private WebElement CheckBox ;

}


