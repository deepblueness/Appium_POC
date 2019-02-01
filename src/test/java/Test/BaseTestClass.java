package Test;

import AppiumSupport.AppiumBaseClass;
import PageObjects.*;
import org.junit.After;
import org.junit.Before;

import AppiumSupport.AppiumController;

public class BaseTestClass extends AppiumBaseClass{
    LoginPage loginPage;
    CoachPage coachPage;
    TrainingFlowPage trainingFlowPage;
    RewardPage rewardPage;

    @Before
    public void setUp() throws Exception {
        AppiumController.instance.start();
        switch (AppiumController.executionOS) {
            case ANDROID:
            //case ANDROID_BROWSERSTACK:
                loginPage = new LoginPageAndroid(driver());
                coachPage = new CoachPageAndroid(driver());
                trainingFlowPage = new TrainingFlowAndroid(driver());
                rewardPage = new RewardPageAndroid(driver());
                break;
            case IOS:
            //case IOS_BROWSERSTACK:
                loginPage = new LoginPageIOS(driver());
                coachPage = new CoachPageIOS(driver());
                trainingFlowPage = new TrainingFlowIOS(driver());
                rewardPage = new RewardPageAndroid(driver());
                break;
        }
    }

    @After
    public void tearDown() {
        AppiumController.instance.stop();
    }
}
