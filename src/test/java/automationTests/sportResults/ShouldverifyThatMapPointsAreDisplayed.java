package automationTests.sportResults;

import configurations.AutomationSetup;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import pageObjects.*;

/**
 * Created by stevenstretton on 10/02/2017.
 */
public class ShouldVerifyThatMapPointsAreDisplayed extends Login{

    private Home home = new Home();
    private Sport sport = new Sport();
    private Wall wall = new Wall();
    private Navbar navbar = new Navbar();

    @Test
    public void shouldVerifyThatMapPointsAreDisplayed() throws InterruptedException{
        AutomationSetup automationSetup = new AutomationSetup();
        automationSetup.executeInitialisationSettings();
        automationSetup.goToDefaultPage();

        home.selectLoginButton();

        addDetails(
                "steven@email.com",
                "password"
        );

        Thread.sleep(1000);

        selectLoginButton();

        wall.goToSportPage();

        sport.add(
                "Canoeing",
                "12",
                "00:13:27"
        );


        Thread.sleep(1000);

        sport.submit();

        navbar.selectMyWall();

        try {
            wall.verifyMapisDisplayedWithPolyline();
        } catch (NoSuchElementException e) {
            Assert.fail("Unable to find map path");
        }

        automationSetup.endOfAutomationTest();
    }

}
