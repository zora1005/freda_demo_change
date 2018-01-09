package GlipiOS.pages;

import GlipiOS.drivers.startDriver;

//import javafx.scene.web.WebView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class welcomeScreen extends startDriver {

    @FindBy(id = "SignInButton")
    protected WebElement SignInButton = driver.findElement(By.id("SignInButton"));
    @FindBy(id = "CreateAccountButton")
    protected WebElement CreateAccountButton = driver.findElement(By.id("CreateAccountButton"));
    @FindBy(id = "DebugButton")
    protected WebElement DebugButton = driver.findElement(By.id("DebugButton"));

    public void tapSignInButton() {
        SignInButton.click();
    }

    public void tapCreateAccountButton() {
        CreateAccountButton.click();
    }

    public void switchEnv() {
        for(int count=1;count<=5; count++){DebugButton.click();}

    }

}