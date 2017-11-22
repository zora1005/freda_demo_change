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
import org.openqa.selenium.support.PageFactory;


public class GlipEmailSignin {

    public AppiumDriver startDriver = iOSAppiumDriverManagement.getInstance().getAppiumDriver();
    public welcomeScreen welcomeScreen;
    public signinScreen signinScreen;
    public EnvironmentScreen EnvironmentScreen;
    public notificationScreen notificationScreen;

    @Given("^User has valid email and Password$")
    public void userHasValidEmailAndPassword()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User has valid Email and Password.");
        System.out.println();
    }

    @When("^User switch to correctly Env \"([^\"]*)\"$")
    public void userSwitchToCorrectlyEnv(String Env) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        welcomeScreen = PageFactory.initElements(startDriver,welcomeScreen.class);
        welcomeScreen.tapSignInButton();
        signinScreen = PageFactory.initElements(startDriver,signinScreen.class);
        signinScreen.switchEnv();
        EnvironmentScreen = PageFactory.initElements(startDriver,EnvironmentScreen.class);
        EnvironmentScreen.switchEnv(Env);
        System.out.println("User switch Env successfully.");
        System.out.println();
    }


    @When("^User inputs email \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void userInputsEmailAndPassword(String emailAddress, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        signinScreen = PageFactory.initElements(startDriver,signinScreen.class);
        signinScreen.glipEmailLogin(emailAddress,password);

    }


    @Then("^User can sign in app$")
    public void userCanSignInApp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        notificationScreen = PageFactory.initElements(startDriver,notificationScreen.class);
        notificationScreen.SkipNotification();
        System.out.println("User signs in successfully.");
        System.out.println();
    }

}
