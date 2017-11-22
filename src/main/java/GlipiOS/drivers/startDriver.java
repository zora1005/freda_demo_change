package GlipiOS.drivers;

import io.appium.java_client.AppiumDriver;

public class startDriver {
    protected AppiumDriver driver = iOSAppiumDriverManagement.getInstance().getAppiumDriver();

    //private static iOSAppiumDriverManagement  iosDriver = new iOSAppiumDriverManagement();
    //protected AppiumDriver driver = iosDriver.getAppiumDriver();
}
