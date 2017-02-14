package automationTests.sportResults;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.*;

/**
 * Created by stevenstretton on 10/02/2017.
 */
public class ShouldWowSportAndValidate extends Login{

    private Home home = new Home();
    private Sport sport = new Sport();
    private Wall wall = new Wall();
    private Navbar navbar = new Navbar();

    @Test
    public void shouldWowSportAndValidate() throws InterruptedException{
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
                "Running",
                "5",
                "00:50:31"
        );


        Thread.sleep(1000);

        sport.submit();

        navbar.selectMyWall();

        wall.selectWow();

        Thread.sleep(1000);

        wall.verifyWowCount(1);

        automationSetup.endOfAutomationTest();
    }

}
