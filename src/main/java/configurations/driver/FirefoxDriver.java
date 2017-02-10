package configurations.driver;

import configurations.FirefoxSettings;
import org.openqa.selenium.WebDriver;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class FirefoxDriver {
    public static void goToPage(String link)
    {
        goToFirefoxURL(link);
    }

    private static WebDriver goToFirefoxURL(String link)
    {
        return FirefoxSettings.navigateToPage(link);
    }
}
