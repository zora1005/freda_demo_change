package GlipiOS.drivers;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.ios.IOSDriver;

import java.util.Set;

public class startDriver {

    protected IOSDriver driver = iOSAppiumDriverManagement.getInstance().getAppiumDriver();
    //protected WebDriver driver = iOSAppiumDriverManagement.getInstance().getAppiumDriver();
    //protected AppiumDriver driver = iOSAppiumDriverManagement.getInstance().getAppiumDriver();

    //private static iOSAppiumDriverManagement  iosDriver = new iOSAppiumDriverManagement();
    //protected AppiumDriver driver = iosDriver.getAppiumDriver();

    /**
     *  设置当前的上下文为原生控件元素
     */
    public void setNativeContext(){
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            if(contextName.contains("NATIVE")){
                driver.context(contextName);
            }
        }
    }

    /**
     *  设置当前的上下文为网页
     */
    public void setWebContext(){
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            if(contextName.contains("WEBVIEW")){
                driver.context(contextName);
            }
        }
    }


}
