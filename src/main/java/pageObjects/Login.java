package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class Login {

    public void selectLoginButton()
    {
        WebElement formSignIn = driver.findElement(By.cssSelector(".btn.btn-primary"));

        formSignIn.click();
    }


    private void enterEmailAddress(String email)
    {
        WebElement formEmail = driver.findElement(By.xpath("html/body/app-root/div[2]/app-login/form" +
                "/fieldset/div[1]/div/input"));

        formEmail.sendKeys(email);
    }

    private void enterPassword(String password)
    {
        WebElement formPassword = driver.findElement(By.xpath("html/body/app-root/div[2]/app-login/form" +
                "/fieldset/div[2]/div/input"));

        formPassword.sendKeys(password);
    }

    protected void addDetails(String formEmail, String formPassword)
    {
        enterEmailAddress(formEmail);
        enterPassword(formPassword);
    }
}
