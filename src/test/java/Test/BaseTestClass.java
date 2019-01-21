package Test;

import AppiumSupport.AppiumBaseClass;
import PageObjects.*;
import org.junit.After;
import org.junit.Before;

import AppiumSupport.AppiumController;

public class BaseTestClass extends AppiumBaseClass{
    LoginPage loginPage;

    @Before
    public void setUp() throws Exception {
        AppiumController.instance.start();
        switch (AppiumController.executionOS) {
            case ANDROID:
            case ANDROID_BROWSERSTACK:
                loginPage = new LoginPageAndroid(driver());
                break;
            case IOS:
            case IOS_BROWSERSTACK:
                loginPage = new LoginPageIOS(driver());
                break;
        }
    }

    @After
    public void tearDown() {
        AppiumController.instance.stop();
    }
}
