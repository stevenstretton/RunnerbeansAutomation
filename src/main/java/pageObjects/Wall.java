package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 10/02/2017.
 */
public class Wall {

    public void goToSportPage()
    {
        WebElement addSportBtn = driver.findElement(By.xpath("html/body/app-root/div[2]/app-root/div/div[2]/div/div[3]/a"));

        addSportBtn.click();
    }

    public void sportPanelValidateSport(String sport)
    {
        WebElement findTextString = driver.findElement(By.xpath("//*[contains(text(),'" + sport + "')]"));

        try {
            Assert.assertTrue(sport.contains(findTextString.getText()));
        } catch (Exception e ) {
            Assert.fail("Incorrect sport, expected: " + sport + ", but was: " + findTextString.getText());
        }
    }

    public void selectDeleteSportBtn()
    {
        WebElement selectDeleteBtn = driver.findElement(By.xpath(".//*[@id='delete']"));
        selectDeleteBtn.click();
    }

    public void checkSportHasBeenRemoved(String sport)
    {
        driver.findElement(By.xpath("//*[contains(text(),'" + sport + "')]"));
    }

    public void selectWow()
    {
        WebElement wowBtn = driver.findElement(By
                .xpath("html/body/app-root/div[2]/app-root/div[2]/div[2]/div/div[3]/button[2]"));

        wowBtn.click();
    }

    public void verifyWowCount(int expectedWow)
    {
        WebElement numOfWows = driver.findElement(By.xpath("html/body/app-root/div[2]/app-root/div[3]/div[2]/" +
                "div/div[2]/table/tbody/tr[4]/td"));

        try {
            Assert.assertTrue(expectedWow == Integer.parseInt(numOfWows.getText()));
        } catch (Exception e ) {
            Assert.fail("Incorrect wow value, expected: " + expectedWow +
                    ", but was: " + Integer.parseInt(numOfWows.getText()));
        }

    }

    public boolean verifyMapisDisplayedWithPolyline()
    {
        return driver.findElements(By.xpath("html/body/app-root/div[2]/app-root/div[2]/div[2]/div" +
                "/div[2]/table/tbody/tr[3]/td/sebm-google-map/div[2]/sebm-google-map-polyline" +
                "/sebm-google-map-polyline-point")).size() > 0;

    }




}
