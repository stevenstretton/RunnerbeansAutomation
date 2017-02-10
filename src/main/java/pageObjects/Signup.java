package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class Signup {

    public void addDetails(String formFirstname, String formSurname,
                              String formEmail, String formPassword)
    {
        setFormFirstname(formFirstname);
        setFormSurname(formSurname);
        setFormEmail(formEmail);
        setFormPassword(formPassword);
    }

    public void submitSignupRequest()
    {
        WebElement submitSignup = driver.findElement(By.cssSelector(".btn.btn-primary"));

        submitSignup.click();
    }

    private void setFormFirstname(String firstname)
    {
        WebElement formFirstname = driver.findElement(By.xpath("html/body/app-root/div[2]/app-signup/form" +
                "/fieldset/div[1]/div/input"));

        formFirstname.sendKeys(firstname);
    }

    private void setFormSurname(String surname)
    {
        WebElement formSurname = driver.findElement(By.xpath("html/body/app-root/div[2]/app-signup/form" +
                "/fieldset/div[2]/div/input"));

        formSurname.sendKeys(surname);
    }

    private void setFormEmail(String email)
    {
        WebElement formEmail = driver.findElement(By.xpath("html/body/app-root/div[2]/app-signup/form" +
                "/fieldset/div[3]/div/input"));

        formEmail.sendKeys(email);
    }

    private void setFormPassword(String password)
    {
        WebElement formPassword = driver.findElement(By.xpath("html/body/app-root/div[2]/app-signup/form" +
                "/fieldset/div[4]/div/input"));

        formPassword.sendKeys(password);
    }

}
