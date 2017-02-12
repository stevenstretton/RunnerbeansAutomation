package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 12/02/2017.
 */

public class Sport {

    private Navbar navbar;

    public void add(String type, String distance, String time)
    {
        sportType(type);
        sportDistance(distance);
        sportTime(time);
    }

    public void removeAndValidateSport()
    {
        remove();

    }

    public void submit()
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

    private void remove()
    {
        WebElement removeItemBtn = driver.findElement(By.xpath("html/body/app-root/div[2]/app-root/div[3]/div[2]" +
                "/div/div[3]/button[1]"));

        removeItemBtn.click();
    }

    private boolean isItemRemoved()
    {
        navbar.selectMyWall();



        return false;
    }

}
