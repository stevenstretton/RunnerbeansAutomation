package automationTests.accounts;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.Signup;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldCreateAndVerifyANewUserAccount extends Login {

    private Home home = new Home();

    @Test
    public void shouldCreateAndVerifyANewUserAccount()  throws InterruptedException
    {
        AutomationSetup automationSetup = new AutomationSetup();
        automationSetup.executeInitialisationSettings();
        automationSetup.goToDefaultPage();

        home.selectSignUpButton();

        Signup signup = new Signup();

        signup.addDetails(
                "Steven",
                "Stretton",
                "steven@email.com",
                "password"
        );

        Thread.sleep(1000);

        signup.submitSignupRequest();

        automationSetup.goToDefaultPage();

        home.selectLoginButton();

        addDetails(
                "steven@email.com",
                "password"
        );

        Thread.sleep(1000);

        selectLoginButton();

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();

    }
}
