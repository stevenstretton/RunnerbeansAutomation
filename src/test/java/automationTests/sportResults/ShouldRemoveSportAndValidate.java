package automationTests.sportResults;

import configurations.AutomationSetup;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import pageObjects.*;

/**
 * Created by stevenstretton on 10/02/2017.
 */
public class ShouldRemoveSportAndValidate extends Login{

    private Home home;
    private Sport sport;
    private Wall wall;
    private Navbar navbar;

    @Test (expected = NoSuchElementException.class)
    public void shouldRemoveSportAndValidate() throws InterruptedException{
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
                "Cycling",
                "43",
                "00:02:31"
        );


        Thread.sleep(1000);

        sport.submit();

        navbar.selectMyWall();

        wall.checkSportHasBeenRemoved();

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();
    }

}
