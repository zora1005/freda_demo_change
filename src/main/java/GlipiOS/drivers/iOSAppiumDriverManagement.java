package GlipiOS.drivers;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class iOSAppiumDriverManagement{

    private static iOSAppiumDriverManagement  iosDriver = new iOSAppiumDriverManagement();
    private AppiumDriver driver;

    public iOSAppiumDriverManagement(){
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("newCommandTimeout", "30000");
        cap.setCapability("platformName", "iOS"); //待测试手机的操作系统
        cap.setCapability("platformVersion", "10.3.1"); //待测试手机的操作系统
        cap.setCapability("deviceName", "iPhone 6s"); //使用的手机类型或模拟器类型，真机时输入Android Emulator或者手机型号
        cap.setCapability("udid", "74CA198D-08A9-450A-A2BB-BE43E2F50F91"); //连接的物理设备的唯一设备标识,Android可以不设置
        cap.setCapability("app", "/Users/songjiali/Documents/intelliJ project/freda_demo/Glip-3.app");//未安装应用时，设置app的路径
        cap.setCapability("autoAcceptAlerts", "True");


        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

    }

    public static iOSAppiumDriverManagement  getInstance(){  //getInstance是获取实例化对象的意思
        return iosDriver;
    }
    public AppiumDriver getAppiumDriver(){
        return driver;
    }


}
