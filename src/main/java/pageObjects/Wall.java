package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 10/02/2017.
 */
public class Wall {

    public void addSport(String type, String distance, String time)
    {
        sportType(type);
        sportDistance(distance);
        sportTime(time);
    }

    public void sportSubmit()
    {
        WebElement sportSubmit = driver.findElement(By.cssSelector("#submit"));

        sportSubmit.click();
    }


    private void sportType(String type)
    {
        WebElement sportSelectEvent = driver.findElement(By.cssSelector("#sport.type"));

        sportSelectEvent.sendKeys(type);
    }

    private void sportDistance(String distance)
    {
        WebElement sportEnterDistance = driver.findElement(By.cssSelector("#sport.type"));

        sportEnterDistance.sendKeys(distance);
    }

    private void sportTime(String time)
    {
        WebElement sportEnterTime = driver.findElement(By.cssSelector("#sport.type"));

        sportEnterTime.sendKeys(time);
    }


    private void sportPanelFindRun()
    {
        WebElement findTextString = driver.findElement(By.xpath("//*[contains(text(),\"Running\")]"));


    }





}
