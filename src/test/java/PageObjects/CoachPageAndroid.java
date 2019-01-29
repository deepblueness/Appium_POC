package PageObjects;

import AppiumSupport.AppiumController;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class CoachPageAndroid implements CoachPage{

    public CoachPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, 80, TimeUnit.SECONDS), this);
    }


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.freeletics.debug:id/list_item_coach_day_title\").instance(9)")
    private MobileElement strength;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.freeletics.debug:id/list_item_coach_workout_title\").instance(0)")
    private MobileElement warmup;
    @FindBy(id = "com.freeletics.debug:id/buttonCta")
    private MobileElement startWorkout;
    @FindBy(id= "com.freeletics.debug:id/continueButton")
    private MobileElement start;
    @FindBy(id = "com.freeletics.debug:id/image")
    private MobileElement exerciseImage;
    @FindBy(id = "com.freeletics.debug:id/continue_action_button")
    private MobileElement saveTraining;
    @FindBy(id="com.freeletics.debug:id/switchForActionBar")
    private MobileElement trainingFallbackSwitch;

    

    public void startTraining(){

        strength.click();
        trainingFallbackSwitch.click();
        warmup.click();
        startWorkout.click();
        start.click();

        while (exerciseImage.isDisplayed()){exerciseImage.click();};
        saveTraining.click();



    }
}
