package automationTests.sportResults;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.Sport;
import pageObjects.Wall;

/**
 * Created by stevenstretton on 10/02/2017.
 */
public class ShouldAddASportAndDisplayOnTheWall extends Login{

    private Home home = new Home();
    private Sport sport = new Sport();
    private Wall wall = new Wall();

    @Test
    public void shouldAddASportAndDisplayOnTheWall() throws InterruptedException{
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

        Thread.sleep(3000);

        wall.goToSportPage();

        sport.add(
                "Cycling",
                "43",
                "00:02:31"
        );

        Thread.sleep(1000);

        sport.submit();

        Thread.sleep(2000);

        wall.sportPanelValidateSport("Steven Stretton - Cycling");

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();
    }

}
