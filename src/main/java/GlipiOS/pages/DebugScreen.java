package GlipiOS.pages;

import GlipiOS.drivers.startDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DebugScreen extends startDriver {


    //@FindBy(id = "barItemBackBtn")
    //protected WebElement barItemBackBtn = driver.findElement(By.id("barItemBackBtn"));
    protected WebElement DEBUG = driver.findElement(By.xpath("//XCUIElementTypeNavigationBar[@name=\"Debug Console\"]/XCUIElementTypeButton[2]"));
    public void switchEnv2() { DEBUG.click(); }
    //public void back() { barItemBackBtn.click(); }

}
