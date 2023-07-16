import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.SelectFlight;

    public class TestTravel extends BasePage {


        @Test
        public void testNavigationToSelectFlight(){
            HomePage homePage = new HomePage();
            SelectFlight selectFlight = homePage.clickFlightPage();
            Assert.assertTrue(isElementVisible(selectFlight.roundTripButton));
        }
        @Test
        public void testSelectRoundTripFlightType(){
            HomePage homePage = new HomePage();
            SelectFlight selectFlight = homePage.clickFlightPage();
            selectFlight.clickRoundTripButton();
            String text = selectFlight.roundTripButton.getAttribute("aria-selected");
            Assert.assertTrue(text.contains("true"));
        }
        @Test
        public void testSelectOneWayFlightType(){
            HomePage homePage = new HomePage();
            SelectFlight selectFlight = homePage.clickFlightPage();
            selectFlight.clickOneWayTripButton();
            String text = selectFlight.oneWayButton.getAttribute("aria-selected");
            Assert.assertTrue(text.contains("true"));
        }
        @Test
        public void testSelectMultiCityFlightType(){
            HomePage homePage = new HomePage();
            SelectFlight selectFlight = homePage.clickFlightPage();
            selectFlight.clickMultiCityTripButton();
            String text = selectFlight.multiCityButton.getAttribute("aria-selected");
            Assert.assertTrue(text.contains("true"));
        }
        @Test
        public void testSelectDepartingLocation(){
            HomePage homePage = new HomePage();
            SelectFlight selectFlight = homePage.clickFlightPage();
            selectFlight.clickAndSendKeysLeavingFromButton("den",2);
            String actText = selectFlight.leavingFromButton.getAttribute("aria-label");
            Assert.assertTrue(actText.contains("Denver (DEN - Denver Intl.)"));
        }

        @Test
        public void testSelectDestination(){
            HomePage homePage = new HomePage();
            SelectFlight selectFlight = homePage.clickFlightPage();
            selectFlight.clickAndSendKeysGoingToButton("par",2);
            String actText = selectFlight.goingToButton.getAttribute("aria-label");
            Assert.assertTrue(actText.contains("seattle"));
        }

        @Test
        public void testSelectDepartingDate(){
            HomePage homePage = new HomePage();
            SelectFlight selectFlight = homePage.clickFlightPage();
            selectFlight.selectDepartingDate("october","2022",29);
            String text = "october 29";
            Assert.assertEquals(selectFlight.theSelectedDepartDate.getText(),text);
        }
        @Test
        public void testSelectReturningDate(){
            HomePage homePage = new HomePage();
            SelectFlight selectFlight = homePage.clickFlightPage();
            selectFlight.selectReturningDate("november","2023",10);
            String text = "november 5";
            Assert.assertEquals(selectFlight.theSelectedReturnDate.getText(),text);
        }

        @Test
        public void testSearchForFlight(){
            HomePage homePage = new HomePage();
            SelectFlight selectFlight =homePage.clickFlightPage();
            selectFlight.clickRoundTripButton();
            selectFlight.clickAndSendKeysLeavingFromButton("denver",2);
            selectFlight.clickAndSendKeysGoingToButton("seattle",1);
            selectFlight.selectDepartingDate("october","2023",25);
            selectFlight.selectReturningDate("november","2023",10);
            selectFlight.clickSearchButton();
            Assert.assertTrue(
                    selectFlight.searchResultVerification("Denver (DEN) -seattle"));
        }


    }

