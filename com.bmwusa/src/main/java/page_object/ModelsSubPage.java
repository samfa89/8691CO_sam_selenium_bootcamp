package page_object;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

   public class BuildVehicle extends BasePage{

        @FindBy(xpath = "//nav[@class = 'globalnav-primary-vehicles__filter-nav']//li/button")
        public List<WebElement> modelsList;

        @FindBy(xpath = "//div[@data-filter ='all models']//div[@class = 'globalnav-primary-vehicles__headline']")
        public WebElement allModHeadline;

        @FindBy(xpath = "//div[@data-filter ='coupes']//div[@class = 'globalnav-primary-vehicles__headline']")
        public WebElement coupesHeadline;

        @FindBy(xpath = "//div[@data-filter ='convertibles']//div[@class = 'globalnav-primary-vehicles__headline']")
        public WebElement convertiblesHeadline;

        @FindBy(xpath = "//h2[@class ='globalnav-local__title label-1--bold']")
        public WebElement vehicleSelected;

        @FindBy(xpath = "//a[@class = ' white-bg dark-txt  adaptive cta-rounded-corners '] ")
        public WebElement buildYoursButton;

        @FindBy(xpath = "//a[@class = 'byo-model-variant-selector__build-button cta icon-none']")
        public WebElement buildYourOwnButton;


        public  ModelsSubPages {
            PageFactory.initElements(driver, this);
        }

        public void selectModel(String model) {
            switch (model) {
                case "All Models":
                    clickOnElement(modelsList.get(0));
                    break;
                case "SAVs":
                    clickOnElement(modelsList.get(1));
                    break;
                case "Sedans":
                    clickOnElement(modelsList.get(2));
                    break;
                case "Coupes":
                    clickOnElement(modelsList.get(3));
                    break;
                case "Convertibles":
                    clickOnElement(modelsList.get(4));
                    break;
                case "Electrified":
                    clickOnElement(modelsList.get(5));
                    break;
                case "BMW M":
                    clickOnElement(modelsList.get(6));
                    break;
                default:
                    System.out.println("Invalid model");
            }
        }

        public void selectVehicle(String modelListNum, String vehicleIndex){
            WebElement ele;
            int Index = Integer.parseInt(vehicleIndex);
            int num = Integer.parseInt(modelListNum);
            if(num < 0 || num > 5){
                System.out.println("Invalid list number!!!");
            }else{
                List<WebElement> vehiclesList =
                        driver.findElements(By.xpath("//div[@class='globalnav-primary-vehicles__tab-holder']" +
                                "/div["+num+"]//div[@class = 'globalnav-primary-vehicles__cars']//a"));
                if(Index < 0 || Index > vehiclesList.size()){
                    System.out.println("Invalid vehicleIndex!!!");
                }else{
                    ele = vehiclesList.get(Index);
                    safeClickOnElement(ele);
                }
            }
        }

        public BuildVehicle navigateToBuildYourOwnPage(){
            fluentWait.until(ExpectedConditions.visibilityOf(buildYoursButton));
            safeClickOnElement(buildYoursButton);
            safeClickOnElement(buildYourOwnButton);
            return new BuildVehicle();
        }
}
