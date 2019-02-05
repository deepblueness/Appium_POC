package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RewardPageAndroid implements RewardPage{

    public RewardPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, 80, TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.freeletics.debug:id/list_item_coach_workout_title\").instance(0)")
    private MobileElement warmup;
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


    public void deleteTraining(){
        warmup.click();
        Assert.assertTrue(timeOrDoneIcon.isDisplayed());
        Assert.assertTrue(pointsTotal.isDisplayed()); //i should better assert the actual amount of points
        editWorkout.click();
        deleteButoon.click();
        confirmDeletion.click();
        Assert.assertTrue(warmup.isDisplayed());

    }
}
