package GlipiOS.pages;

import GlipiOS.drivers.startDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class notificationScreen extends startDriver{


    //@FindBy(id = "Turn Notifications ON")
    //protected WebElement TurnOnNotification = driver.findElement(By.id("Turn Notifications ON"));
    @FindBy(id = "Skip")
    protected WebElement Skip = driver.findElement(By.id("Skip"));

   // public void TurnOnNotification() { TurnOnNotification.click();}
    public void SkipNotification() { Skip.click();}
}
