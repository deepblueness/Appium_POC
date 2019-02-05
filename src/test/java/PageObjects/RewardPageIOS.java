package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RewardPageIOS implements RewardPage  {

    public RewardPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver,60, TimeUnit.SECONDS), this);

    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1\"]")
    private MobileElement day1;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Dynamic Warmup \"]")
    private MobileElement warmup;

    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"icon_interval_middle\"]")
    private MobileElement iconFinish;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"icon edit\"]")
    private MobileElement editIcon;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete Workout\"]")
    private MobileElement deleteButtoon;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete Training\"]")
    private MobileElement confirmDelete;


    public void deleteTraining(){
        editIcon.click();
        deleteButtoon.click();
        confirmDelete.click();
        day1.click();
    }
}
