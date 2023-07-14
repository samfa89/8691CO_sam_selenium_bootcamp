package data_providers;

import base.BasePage;
import page_object.HomePage;
import org.testng.annotations.DataProvider;

public class DataProviderClass extends BasePage{
    @DataProvider(name = "Models")
    public static Object[][] getModels() {
        return excel.readStringArrays("Models");
    }

    @DataProvider(name = "RanVehicleData")
    public static Object[][] getVehicleFromModels() {
        return excel.readStringArrays("RanVehicleData");
    }

    @DataProvider(name = "AllModelsDesign")
    public static Object[][] selectDesignFromAllModels() {
        return excel.readStringArrays("AllModelsDesign");
    }

    @DataProvider(name = "AllModelsInterior")
    public static Object[][] selectInteriorUpholsteryFromAllModels() {
        return excel.readStringArrays("AllModelsInterior");
    }
    @DataProvider(name = "AllModelsExterior")
    public static Object[][] selectExteriorFromAllModels() {
        return excel.readStringArrays("AllModelsExterior");
    }

    @DataProvider(name = "AllModelsOptions")
    public static Object[][] selectFeaturedPackagesFromAllModels() {
        return excel.readStringArrays("AllModelsOptions");
    }

    @DataProvider(name = "SAVsDesign")
    public static Object[][] selectDesignFromSAVs() {
        return excel.readStringArrays("SAVsDesign");
    }

    @DataProvider(name = "SAVsExterior")
    public static Object[][] selectExteriorFromSAVs() {
        return excel.readStringArrays("SAVsExterior");
    }

    @DataProvider(name = "SAVsInterior")
    public static Object[][] selectInteriorFromSAVs() {
        return excel.readStringArrays("SAVsInterior");
    }

    @DataProvider(name = "SAVsOptions")
    public static Object[][] selectFeaturedPackagesFromSAVs() {
        return excel.readStringArrays("SAVsOptions");
    }

    @DataProvider(name = "SedansDesign")
    public static Object[][] selectDesignFromSedans() {
        return excel.readStringArrays("SedansDesign");
    }

    @DataProvider(name = "SedansExterior")
    public static Object[][] selectExteriorFromSedans() {
        return excel.readStringArrays("SedansExterior");
    }

    @DataProvider(name = "SedansInterior")
    public static Object[][] selectInteriorFromSedans() {
        return excel.readStringArrays("SedansInterior");
    }

    @DataProvider(name = "SedansOptions")
    public static Object[][] selectOptionsFromSedans() {
        return excel.readStringArrays("SedansOptions");
    }

}
