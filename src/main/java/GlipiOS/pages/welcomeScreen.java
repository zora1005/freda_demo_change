package GlipiOS.pages;

import GlipiOS.drivers.startDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class welcomeScreen extends startDriver {

    @FindBy(id = "SignInButton")
    protected WebElement SignInButton = driver.findElement(By.id("SignInButton"));
    @FindBy(id = "CreateAccountButton")
    protected WebElement CreateAccountButton = driver.findElement(By.id("CreateAccountButton"));

    public void tapSignInButton() {
        SignInButton.click();
    }

    public void tapCreateAccountButton() {
        CreateAccountButton.click();
    }
}