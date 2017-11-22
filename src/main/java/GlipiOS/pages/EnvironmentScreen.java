package GlipiOS.pages;

import GlipiOS.drivers.startDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnvironmentScreen extends startDriver {

    @FindBy(id = "XMN-Lab")
    protected WebElement XMN_Lab = driver.findElement(By.id("XMN-Lab"));
    @FindBy(id = "GlipDemo")
    protected WebElement GlipDemo = driver.findElement(By.id("GlipDemo"));
    @FindBy(id = "Glip")
    protected WebElement Glip = driver.findElement(By.id("Glip"));
    @FindBy(id = "barItemBackBtn")
    protected WebElement barItemBackBtn = driver.findElement(By.id("barItemBackBtn"));

    public void switchEnv(String Env) {
        if("XMN-Lab".equals(Env)){ XMN_Lab.click(); }
        else if ("GlipDemo".equals(Env)){ GlipDemo.click(); }
        else if ("Glip".equals(Env)){ Glip.click(); }

        barItemBackBtn.click();
    }
}