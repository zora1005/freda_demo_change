package GlipiOS.pages;

import GlipiOS.drivers.iOSAppiumDriverManagement;
import GlipiOS.drivers.startDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnifiedLogin extends startDriver {

    //@FindBy(id ="loginCredentialNext")
    //private WebElement UnifiedLoginNext = driver.findElement(By.id("loginCredentialNext"));


    public void UnifiedLogin(String emailAddress, String password) throws InterruptedException {


        setWebContext(); //设置当前的上下文为网页
        WebElement accountFieldForUL = iOSAppiumDriverManagement.waitForVisible(driver, By.id("credential"),60);
        if(accountFieldForUL != null){
            accountFieldForUL.sendKeys(emailAddress);
        }
        WebElement butNext = iOSAppiumDriverManagement.waitForVisible(driver, By.id("loginCredentialNext"),60);
        if(butNext != null){
            butNext.click();
        }

        //setWebContext(); //设置当前的上下文为网页
        WebElement passwordFieldForUL = iOSAppiumDriverManagement.waitForVisible(driver, By.id("password"),60);
        if(passwordFieldForUL != null){
            passwordFieldForUL.sendKeys(password);
        }
        WebElement butSignIn = iOSAppiumDriverManagement.waitForVisible(driver, By.xpath("//*[@id='pageContent']/div/div/div/form/div/div[2]/div/div[2]/button") ,60);
        if(butSignIn != null){
            butSignIn.click();
        }
        setNativeContext();

    }
}

