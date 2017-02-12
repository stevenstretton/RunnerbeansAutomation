package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 12/02/2017.
 */
public class Account {

    public void selectEditEmailBtn()
    {
        WebElement editEmail = driver.findElement(By.cssSelector("#edit"));

        editEmail.click();
    }

    public void selectDeleteAccountBtn()
    {
        WebElement deleteAccount = driver.findElement(By.cssSelector("#delete"));

        deleteAccount.click();
    }

    public void selectSaveChangesBtn()
    {
        WebElement saveOtherMemberViewChanges = driver.findElement(By.cssSelector("#display"));

        saveOtherMemberViewChanges.click();
    }

    public boolean hasEmailChanged(String email)
    {
        return driver.getPageSource().contains(email);
    }

    public void enterAndSubmitNewEmail(String email)
    {
        enterEmailAddress(email);
        submitNewEmail();
    }

    private void enterEmailAddress(String email)
    {
        WebElement newEmail = driver.findElement(By.xpath("html/body/app-root/div[2]/app-account/div/div[2]/div[1]" +
                "/div[2]/table/tbody/tr[3]/td/form/fieldset/div/input"));

        newEmail.sendKeys(email);
    }

    private void submitNewEmail()
    {
        WebElement submitEmail = driver.findElement(By.xpath("html/body/app-root/div[2]/app-account/div/div[2]" +
                "/div[1]/div[2]/table/tbody/tr[3]/td/form/fieldset/div/span/button"));

        submitEmail.click();
    }


}
