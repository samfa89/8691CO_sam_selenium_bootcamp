package test_app;

import base.BasePage;
import page_object.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_object.HomePage;
import page_object.ModelsSubPages;

public class TestModelsPage extends BasePage {
    @Test
    public void testNavigatingToModels() {
        HomePage homePage = new HomePage();
        ModelsSubPages modelsPage = homePage.navigateToModelsPage();
        Assert.assertTrue(isElementVisible(modelsPage.modelsList.get(0)));
    }

    @Test(dataProviderClass = data_providers.DataProviderClass.class, dataProvider = "Models")
    public void testNavigatingToModelsSupPages(String model) {
        HomePage homePage = new HomePage();
        ModelsSubPages modelsPage = homePage.navigateToModelsPage();
        modelsPage.selectModel(model);
        if (model.equalsIgnoreCase("All Models")) {
            Assert.assertTrue(isElementVisible(modelsPage.allModHeadline));
        } else if (model.equalsIgnoreCase("Coupes")) {
            Assert.assertTrue(isElementVisible(modelsPage.coupesHeadline));
        } else {
            Assert.assertTrue(isElementVisible(modelsPage.convertiblesHeadline));
        }
    }

    @Test(dataProviderClass = data_providers.DataProviderClass.class,dataProvider = "RanVehicleData")
    public void testSelectingVehicleFromAllModelsSection(String model, String num, String index, String expText){
        HomePage homePage = new HomePage();
        ModelsSubPages modelsPage = homePage.navigateToModelsPage();
        modelsPage.selectModel(model);
        modelsPage.selectVehicle(num, index);
        webDriverWait.until(ExpectedConditions.visibilityOf(modelsPage.vehicleSelected));
        String actText = modelsPage.vehicleSelected.getText().trim();
        Assert.assertEquals(actText,expText);
    }





}
