package configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Login;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class FirefoxSettings {
    private FirefoxProfile firefoxProfile = new FirefoxProfile();

    public static WebDriver driver = new FirefoxDriver();

    public static WebDriver navigateToPage(String webpage)
    {
        driver.get(webpage);
        PageFactory.initElements(driver, Login.class);
        return driver;
    }

    WebDriver getBrowser()
    {
        setupBrowser();
        return driver;
    }

    WebDriver closeBrowser()
    {
        driver.quit();
        return driver;
    }

    private WebDriver setupBrowser()
    {
        setBrowserSize();
        setBrowserHomepage();
        clearAllBrowserCookies();

        return driver;
    }

    private WebDriver setBrowserSize()
    {
        driver.manage().window().maximize();
        return driver;
    }

    private WebDriver setBrowserHomepage()
    {
        String BLANK_HOMEPAGE = "about:blank";

        firefoxProfile.setPreference("browser.startup.homepage", BLANK_HOMEPAGE);
        firefoxProfile.setPreference("startup.homepage_welcome_url", BLANK_HOMEPAGE);
        firefoxProfile.setPreference("startup.homepage_welcome_url.additional", BLANK_HOMEPAGE);
        firefoxProfile.setPreference("network.proxy.type","1");

        return driver;
    }

    private WebDriver clearAllBrowserCookies()
    {
        driver.manage().deleteAllCookies();
        return driver;
    }
}
