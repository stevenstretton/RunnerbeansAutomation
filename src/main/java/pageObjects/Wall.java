package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 10/02/2017.
 */
public class Wall {

    public void goToSportPage()
    {
        WebElement addSportBtn = driver.findElement(By.xpath("html/body/app-root/div[2]/app-root/div[2]/div/p/a"));

        addSportBtn.click();
    }

    public void sportPanelValidateSport(String sport)
    {
        WebElement findTextString = driver.findElement(By.xpath("//*[contains(text(),\"" + sport + "\")]"));
    }

    public void checkSportHasBeenRemoved()
    {
        driver.findElement(By.cssSelector(""));
    }



}
