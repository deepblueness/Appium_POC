package AppiumSupport;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumController {

    //Browserstack setup
    private static String BS_USERNAME = "<your_browserstack_username>";
    private static String BS_ACCESSKEY = "<your_browserstack_accesskey>";
    private static String IOS_HASHED_APP_ID = "<your_ios_hashed_appid>";
    private static String ANDROID_HASHED_APP_ID = "<your_android_hashed_appid>";

    public static OS executionOS = OS.ANDROID;

    public enum OS {
        ANDROID,
        IOS,
        ANDROID_BROWSERSTACK,
        IOS_BROWSERSTACK
    }

    public static AppiumController instance = new AppiumController();
    public AppiumDriver driver;

    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        DesiredCapabilities capabilities = new DesiredCapabilities();
        switch (executionOS) {
            case ANDROID:
                //File classpathRoot = new File(System.getProperty("user.dir"));
                //File appDir = new File(classpathRoot, "/app/Android");
                //File app = new File (appDir, "Freeletics.apk");
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("deviceName", "Google Pixel");
                capabilities.setCapability("app", "/Users/anastasia/Downloads/Freeletics-productionApi-debug.apk");
                //capabilities.setCapability("appPackage", "com.jayway.contacts");
                //capabilities.setCapability("appActivity", "com.jayway.contacts.MainActivity");
                capabilities.setCapability("newCommandTimeout", "120");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            case IOS:
                //classpathRoot = new File(System.getProperty("user.dir"));
                //appDir = new File(classpathRoot, "/app/iOS/");
                //app = new File(appDir, "Freeletics_simulator.app");
                capabilities.setCapability("platformName", "ios");
                capabilities.setCapability("deviceName", "iPhone X");
                capabilities.setCapability("app", "/Users/anastasia/Downloads/Freeletics.app");
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("platformVersion", "12.1");
                capabilities.setCapability("udid", "D44A76AE-9E30-4F36-991F-6B97BD45B184");
                capabilities.setCapability("xcodeOrgId", "6QF744V9B9");
                capabilities.setCapability("xcodeSigningId", "iPhone Developer");
                capabilities.setCapability("newCommandTimeout", "120");
                capabilities.setCapability("noReset", "true");
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

                break;
            case ANDROID_BROWSERSTACK:
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("deviceName", "NotUsed");
                capabilities.setCapability("appPackage", "com.jayway.contacts");
                capabilities.setCapability("appActivity", "com.jayway.contacts.MainActivity");
                capabilities.setCapability("device", "Samsung Galaxy S8");
                capabilities.setCapability("os_version", "7.0");
                capabilities.setCapability("browserstack.debug", true);
                capabilities.setCapability("app", "bs://" + ANDROID_HASHED_APP_ID);
                driver = new AndroidDriver(new URL("https://" + BS_USERNAME + ":" + BS_ACCESSKEY + "@hub-cloud.browserstack.com/wd/hub"), capabilities);
                break;
            case IOS_BROWSERSTACK:
                capabilities.setCapability("platformName", "ios");
                capabilities.setCapability("deviceName", "iPhone 7");
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("browserstack.debug", true);
                capabilities.setCapability("app", "bs://" + IOS_HASHED_APP_ID);
                driver = new IOSDriver(new URL("https://" + BS_USERNAME + ":" + BS_ACCESSKEY + "@hub-cloud.browserstack.com/wd/hub"), capabilities);
                break;
        }
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}