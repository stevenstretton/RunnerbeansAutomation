package automationTests.creatingEvents;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Login;
import pageObjects.Wall;

/**
 * Created by stevenstretton on 10/02/2017.
 */
public class ShouldAddASportAndDisplayOnTheWall extends Login{

    private Wall wall;

    @Test
    public void ShouldAddASportAndDisplayOnTheWall() throws InterruptedException{
        AutomationSetup automationSetup = new AutomationSetup();
        automationSetup.executeInitialisationSettings();
        automationSetup.goToDefaultPage();

        addDetails(
                "steven@email.com",
                "password"
        );

        Thread.sleep(1000);

        selectLoginButton();

        Thread.sleep(1000);

        wall.addSport(
                "Cycling",
                "43",
                "00:02:31"
        );

        Thread.sleep(1000);

        wall.sportSubmit();

        Thread.sleep(1000);





        automationSetup.endOfAutomationTest();
    }

}
