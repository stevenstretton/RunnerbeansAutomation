package configurations;

import org.openqa.selenium.WebDriver;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class AutomationSetup {
    private FirefoxSettings firefoxSettings = new FirefoxSettings();

    public void goToDefaultPage()
    {
        String LINK = "http://localhost:4200/home";
        navigateToPage(LINK);
    }
    public void executeInitialisationSettings()
    {
        firefoxSettings.getBrowser();
    }

    public void endOfAutomationTest()
    {
        firefoxSettings.closeBrowser();
    }

    private static WebDriver navigateToPage(String link)
    {
        return FirefoxSettings.navigateToPage(link);
    }

}
