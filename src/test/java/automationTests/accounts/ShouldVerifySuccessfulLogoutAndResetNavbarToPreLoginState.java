package automationTests.accounts;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Home;
import pageObjects.Login;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldVerifySuccessfulLogoutAndResetNavbarToPreLoginState extends Login {

    private Home home;

    @Test
    public void shouldVerifySuccessfulLogoutAndResetNavbarToPreLoginState() throws InterruptedException
    {
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

        Thread.sleep(1000);

        selectLogoutButton();

        home.validatePreLogin();

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();

    }


}
