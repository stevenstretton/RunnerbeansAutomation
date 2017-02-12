package automationTests.accounts;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Account;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.Navbar;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldVerifySuccessfulAccountEmailChange extends Login {

    private Home home;
    private Navbar navbar;
    private Account account;

    @Test
    public void shouldVerifySuccessfulAccountEmailChange() throws InterruptedException
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

        navbar.selectAccount();

        account.selectEditEmailBtn();

        account.enterAndSubmitNewEmail("steven@mail.com");

        navbar.selectLogout();

        Thread.sleep(1000);

        navbar.selectLogin();

        addDetails(
                "steven@mail.com",
                "password"
        );

        Thread.sleep(1000);

        navbar.selectAccount();

        account.hasEmailChanged("steven@mail.com");

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();

    }


}
