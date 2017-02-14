package automationTests.navigation;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.*;

/**
 * Created by stevenstretton on 10/02/2017.
 */
public class ShouldVerifyCorrectNavbarLinksAreDisplayed extends Login{

    private Navbar navbar = new Navbar();

    @Test
    public void shouldWowSportAndValidate() throws InterruptedException{
        AutomationSetup automationSetup = new AutomationSetup();
        automationSetup.executeInitialisationSettings();
        automationSetup.goToDefaultPage();

        //pre login stage
        navbar.selectAbout();

        Thread.sleep(1000);

        navbar.selectSignup();

        Thread.sleep(1000);

        navbar.selectLogin();

        addDetails(
                "steven@email.com",
                "password"
        );

        selectLoginButton();

        Thread.sleep(2000);

        //post login stage
        navbar.selectAccount();

        Thread.sleep(1000);

        navbar.selectSport();

        Thread.sleep(1000);

        navbar.selectMyWall();

        Thread.sleep(1000);

        navbar.selectLogout();

        Thread.sleep(1000);

        navbar.selectHome();

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();
    }

}
