package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CoachPageAndroid implements CoachPage{

    public CoachPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, 60, TimeUnit.SECONDS), this);
    }

    @FindBy(id = "com.freeletics.debug:id/header")
    private MobileElement coachWeekTitle;
    @FindBy(partialLinkText = "PB")
    private MobileElement beatYourPBDay;
    @FindBy(partialLinkText = "WARMUP")
    private MobileElement warmup;
    @FindBy(id = "com.freeletics.debug:id/buttonCta")
    private MobileElement startWorkout;
    @FindBy(id = "com.freeletics.debug:id/image")
    private MobileElement exerciseImage;
    @FindBy(id = "com.freeletics.debug:id/continue_action_button")
    private MobileElement saveTraining;




    public void startTraining(){

        beatYourPBDay.click();
        warmup.click();
        while (exerciseImage.isDisplayed()){exerciseImage.click();};
        saveTraining.click();



    }
}
