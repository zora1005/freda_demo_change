package steps;

import GlipiOS.drivers.iOSAppiumDriverManagement;
//import GlipiOS.pages.EnvironmentScreen;
//import GlipiOS.pages.welcomeScreen;
//import GlipiOS.pages.signinScreen;
//import GlipiOS.pages.notificationScreen;
import GlipiOS.pages.*;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class GlipEmailSignin {

    public WebDriver startDriver = iOSAppiumDriverManagement.getInstance().getAppiumDriver();
    //public AppiumDriver startDriver = iOSAppiumDriverManagement.getInstance().getAppiumDriver();
    public welcomeScreen welcomeScreen;
    public signinScreen signinScreen;
    public EnvironmentScreen EnvironmentScreen;
    public notificationScreen notificationScreen;
    public UnifiedLogin UnifiedLoginScreen;
    public DebugScreen DebugScreen;

    @Given("^User has valid email and Password$")
    public void userHasValidEmailAndPassword()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User has valid Email and Password.");
        System.out.println();
    }

   /* @Given("^User switch to correctly Env \"([^\"]*)\"$")
    public void userSwitchToCorrectlyEnv(String Env) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        welcomeScreen = PageFactory.initElements(startDriver,welcomeScreen.class);
        welcomeScreen.switchEnv();
        //DebugScreen = PageFactory.initElements(startDriver,DebugScreen.class);
        //DebugScreen.switchEnv2();
        //EnvironmentScreen = PageFactory.initElements(startDriver,EnvironmentScreen.class);
        //EnvironmentScreen.switchEnv3(Env);
        //DebugScreen = PageFactory.initElements(startDriver,DebugScreen.class);
        //DebugScreen.back();

        System.out.println("User switch Env successfully.");
        System.out.println();
    }
    */


    @When("^User inputs email \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void userInputsEmailAndPassword(String emailAddress, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions


        welcomeScreen = PageFactory.initElements(startDriver,welcomeScreen.class);
        welcomeScreen.tapSignInButton();
        System.out.println("Enter Sign in screen");

        UnifiedLoginScreen = PageFactory.initElements(startDriver,UnifiedLogin.class);
        UnifiedLoginScreen.UnifiedLogin(emailAddress,password);
        System.out.println("Sign in");

    }


    @Then("^User can sign in app$")
    public void userCanSignInApp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        notificationScreen = PageFactory.initElements(startDriver,notificationScreen.class);
        notificationScreen.TurnOnNotification();
        System.out.println("User signs in successfully.");
        System.out.println();
    }

}
