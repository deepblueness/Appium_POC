package PageObjects;

import AppiumSupport.AppiumController;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.ElementNotVisibleException;
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
    @FindBy(id="com.freeletics.debug:id/switchForActionBar")
    private MobileElement trainingFallbackSwitch;
    @FindBy(id = "com.freeletics.debug:id/buttonCta")
    private MobileElement startWorkout;
    @FindBy(id= "com.freeletics.debug:id/continueButton")
    private MobileElement start;
    @FindBy(id = "com.freeletics.debug:id/title")
    private MobileElement exerciseTitle;
    @FindBy(id = "com.freeletics.debug:id/continue_action_button")
    private MobileElement saveTraining;
    @FindBy(id = "com.freeletics.debug:id/workout_summary_finish_button")
    private MobileElement finishButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.freeletics.debug:id/counter_label\").instance(1)")
    private MobileElement checkMark;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.freeletics.debug:id/list_item_coach_time\").instance(1)")
    private MobileElement completedIcon;
    @FindBy(id= "com.freeletics.debug:id/workout_summary_time_text_view")
    private MobileElement timeOrDoneIcon;
    @FindBy(id= "com.freeletics.debug:id/reward_points_text_view")
    private MobileElement pointsTotal;
    @FindBy(id= "com.freeletics.debug:id/workout_summary_edit")
    private MobileElement editWorkout;
    @FindBy(id= "com.freeletics.debug:id/title")
    private MobileElement deleteButoon;
    @FindBy(id= "android:id/button1")
    private MobileElement confirmDeletion;
    
    public void startTraining(){

        strength.click();
        trainingFallbackSwitch.click();
        warmup.click();
        startWorkout.click();
        start.click();

        //7 exercises
        int count =0 ;

        while (count < 7)
        {
            exerciseTitle.click();
            count++;
        }

        saveTraining.click();
        finishButton.click();
        warmup.click();
        Assert.assertTrue(timeOrDoneIcon.isDisplayed());
        Assert.assertTrue(pointsTotal.isDisplayed());
        editWorkout.click();
        deleteButoon.click();
        confirmDeletion.click();


        //Assert.assertEquals(checkMark.getText().toString(), "");
        //Assert.assertEquals(completedIcon.getText().toString(), (""));




    }
}
