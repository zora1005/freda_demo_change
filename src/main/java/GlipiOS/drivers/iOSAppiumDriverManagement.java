package GlipiOS.drivers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iOSAppiumDriverManagement{

    private static iOSAppiumDriverManagement iosDriver = new iOSAppiumDriverManagement();
    private IOSDriver driver;
    //private RemoteWebDriver driver;
    //private AppiumDriver driver;

    public iOSAppiumDriverManagement(){
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("newCommandTimeout", "30000");
        cap.setCapability("platformName", "iOS"); //待测试手机的操作系统
        cap.setCapability("platformVersion", "10.3.1");//Vina
        cap.setCapability("udid", "46785E7F-F7AE-4E79-8719-2E12CAE127CA");//Vina mac
        cap.setCapability("deviceName", "iPhone 6"); //使用的手机类型或模拟器类型，真机时输入Android Emulator或者手机型号
        //cap.setCapability("platformVersion", "10.2.1"); // My Mac 待测试手机的操作系统
        //cap.setCapability("udid","83880DE8-EFC4-41DE-AE6C-C7B697CF146C");//MY MAC 连接的物理设备的唯一设备标识,Android可以不设置
        cap.setCapability("app", "/Users/songjiali/Documents/intelliJ project/freda_demo_change/new Glip.app");//未安装应用时，设置app的路径
        cap.setCapability("autoAcceptAlerts", "True");


        try {
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            //driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            //driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

    }

    public static iOSAppiumDriverManagement  getInstance(){  //getInstance是获取实例化对象的意思
        return iosDriver;
    }
    public IOSDriver getAppiumDriver(){ return driver;}
    //public WebDriver getAppiumDriver(){return driver;}
    //public AppiumDriver getAppiumDriver(){return driver;}


    public static WebElement waitForVisible(IOSDriver driver, final By by, int waitTime) {
    //public static WebElement waitForVisible(AppiumDriver driver, final By by, int waitTime) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        WebElement element = null;
        for (int attempt = 0; attempt < waitTime; attempt++) {
            try {
                element = driver.findElement(by);
                break;
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            }
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }


}
