package baseClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {

            public static AppiumDriver<MobileElement> driver;
            @BeforeTest
            @Parameters({"deviceName","udid", "platformVersion","url"})
            public void setup(String deviceName, String udid,String platformVersion,String url) throws InterruptedException, MalformedURLException
            {
                DesiredCapabilities cap=new DesiredCapabilities();
                cap.setCapability("deviceName", "Pixel 2");
                cap.setCapability("udid", udid);
                cap.setCapability("appActivity", "com.android.calculator2.Calculator");
                cap.setCapability("appPackage", "com.google.android.calculator");
                cap.setCapability("platformName", "Android");
                cap.setCapability("platformVersion", platformVersion);
                driver=new AppiumDriver<MobileElement>(new URL(url), cap);
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                Thread.sleep(5000);
              
            }

}
