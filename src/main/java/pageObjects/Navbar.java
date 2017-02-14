package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class Navbar {

    public void selectHome()
    {
        WebElement selectHomeBtn = driver.findElement(By.cssSelector(".navbar-brand"));

        selectHomeBtn.click();
    }

    public void selectAbout()
    {
        WebElement selectAboutBtn = driver.findElement(By.cssSelector(".nav.navbar-nav>li:nth-child(1)>a"));

        selectAboutBtn.click();
    }

    public void selectLogin()
    {
        WebElement selectLoginBtn = driver.findElement(By.xpath(".//*[@id='navbar-main']/ul[2]/li[5]/a"));

        selectLoginBtn.click();
    }

    public void selectSignup()
    {
        WebElement selectSignupBtn = driver.findElement(By.xpath(".//*[@id='navbar-main']/ul[2]/li[6]/a"));

        selectSignupBtn.click();
    }

    public void selectMyWall()
    {
        WebElement selectMyWallBtn = driver.findElement(By.xpath(".//*[@id='navbar-main']/ul[2]/li[1]/a"));

        selectMyWallBtn.click();
    }

    public void selectSport()
    {
        WebElement selectMyWallBtn = driver.findElement(By.xpath(".//*[@id='navbar-main']/ul[2]/li[2]/a"));

        selectMyWallBtn.click();
    }

    public void selectAccount()
    {
        WebElement selectAccountBtn = driver.findElement(By.xpath(".//*[@id='navbar-main']/ul[2]/li[3]/a"));

        selectAccountBtn.click();
    }

    public void selectLogout()
    {
        WebElement selectLogoutBtn = driver.findElement(By.xpath(".//*[@id='navbar-main']/ul[2]/li[4]/a"));

        selectLogoutBtn.click();
    }


}
