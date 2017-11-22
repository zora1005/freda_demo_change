package GlipiOS.pages;

import GlipiOS.drivers.startDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signinScreen extends startDriver {

    @FindBy(id ="UserNameTextField")
    private WebElement UserNameInputField = driver.findElement(By.id("UserNameTextField"));
    @FindBy(id ="PasswordTextField")
    private WebElement PasswordInputField = driver.findElement(By.id("PasswordTextField"));
    @FindBy(id ="SignInButton")
    private WebElement SignInButton = driver.findElement(By.id("SignInButton"));
    @FindBy(id ="SignInRingCentralButton")
    private WebElement SignInRingCentralButton = driver.findElement(By.id("SignInRingCentralButton"));

    public void glipEmailLogin(String emailAddress, String password) throws InterruptedException {
        UserNameInputField.clear();
        UserNameInputField.sendKeys(emailAddress);
        PasswordInputField.sendKeys(password);
        SignInButton.click();
        Thread.sleep(3000);

    }

    public void tapSignInRingCentralButton() {
        SignInRingCentralButton.click();

    }

    public void switchEnv()  {
        UserNameInputField.clear();
        UserNameInputField.sendKeys("/debug");
        PasswordInputField.sendKeys("Test!123");
        SignInButton.click();
    }

}
