package page_object;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortButton extends BasePage {

    @FindBy(xpath ="//*[@id=sortSearchIcon']/span")

    private WebElement SortButton;

    @FindBy (xpath ="//*[@id=searchResultSortMenu']/ul/li[6]/span" )

    private WebElement LastUpdated;

 @FindBy (xpath = "//*[@id=searchBarLookup']")

    private WebElement SearchBar;

}

