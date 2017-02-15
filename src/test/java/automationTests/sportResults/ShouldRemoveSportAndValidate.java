package automationTests.sportResults;

import configurations.AutomationSetup;
import org.junit.Test;
import org.openqa.selenium.ElementNotVisibleException;
import pageObjects.*;

/**
 * Created by stevenstretton on 10/02/2017.
 */
public class ShouldRemoveSportAndValidate extends Login{

    private Home home = new Home();
    private Sport sport = new Sport();
    private Wall wall = new Wall();
    private Navbar navbar = new Navbar();

    @Test (expected = ElementNotVisibleException.class)
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

        Thread.sleep(2000);

        wall.selectDeleteSportBtn();

        Thread.sleep(1000);

        wall.checkSportHasBeenRemoved("Steven Stretton - Cycling");

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();
    }

}
