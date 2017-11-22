package GlipiOS.pages;

import GlipiOS.drivers.startDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signinRCScreen extends startDriver {

        protected WebElement RCPhoneNumber = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Sign in - RingCentral\"]/XCUIElementTypeTextField[1]"));
        protected WebElement Password = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Sign in - RingCentral\"]/XCUIElementTypeSecureTextField"));
        @FindBy(id = "Sign In")
        protected WebElement SignInButton = driver.findElement(By.id("Sign In"));


    public void glipRCLogin(String emailAddress, String password)throws InterruptedException{
        RCPhoneNumber .clear();
        RCPhoneNumber.sendKeys(emailAddress);
        Password .sendKeys(password);
        SignInButton.click();
        Thread.sleep(10000);

    }


}
