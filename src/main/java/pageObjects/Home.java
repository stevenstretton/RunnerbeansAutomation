package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 10/02/2017.
 */
public class Home {

    public void validatePreLogin()
    {
        isLoginDisplayed();
        isSignupDisplayed();
    }

    public void selectLoginButton()
    {
        WebElement formSignIn = driver.findElement(By.cssSelector(".btn.btn-primary.btn-md"));

        formSignIn.click();
    }

    public void selectSignUpButton()
    {
        WebElement formCreateAccount = driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg"));

        formCreateAccount.click();
    }

    private boolean isLoginDisplayed()
    {
        return driver.getPageSource().contains("Login");
    }

    private boolean isSignupDisplayed()
    {
        return driver.getPageSource().contains("Signup");
    }




}
