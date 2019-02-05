package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CoachPageAndroid implements CoachPage{

    public CoachPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, 90, TimeUnit.SECONDS), this);
    }


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.freeletics.debug:id/list_item_coach_day_title\").instance(9)")
    private MobileElement day1;



    public void selectDay(){
        day1.click();
    };
}
