package page_object;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

        @FindBy(xpath = "//nav[@class = 'globalnav-primary__nav']//li/button[@name ='Models Flyout' ]")
        public WebElement modelsButton;



        public HomePage(){
            PageFactory.initElements(driver,this);
        }



        public ModelsSubPages navigateToModelsPage(){
            clickOnElement(modelsButton);
            return new ModelsSubPages();
        }
}
