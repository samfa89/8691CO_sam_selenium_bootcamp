package test_searchbar;

import base.BasePage;
import home_object.HomePage;
import home_object.SearchResultPage;
import home_object.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchBar extends BasePage {

    @Test
    public void TestSearchItem() {
        HomePage hp = new HomePage();

        SearchResultPage searchResultPage = hp.searchProduct("iphone");

    }
}


