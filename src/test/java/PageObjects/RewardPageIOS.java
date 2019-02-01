package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RewardPageIOS implements RewardPage  {

    public RewardPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver,60, TimeUnit.SECONDS), this);
        tapCoordinates = new TouchAction(driver);

    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1\"]")
    private MobileElement day1;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Dynamic Warmup \"]")
    private MobileElement warmup;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Start\"]")
    private MobileElement startButton;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save training\"]")
    private MobileElement saveTraining;
    @FindBy(xpath = "//XCUIElementTypeTable[@name=\"FINAL EXERCISE\"]")
    private MobileElement finalExerciseLabel;
    @FindBy(xpath = "//XCUIElementTypeCell[1]")
    private MobileElement nextExerciseCell;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Next\"]")
    private MobileElement nextExerciseCell1;

    @FindBy(xpath = "XCUIElementTypeStaticText[`name CONTAINS[cd] \"%\"`]")
    private MobileElement percentage;


    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Finish\"]")
    private MobileElement finishTraining;
    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"icon_interval_middle\"]")
    private MobileElement iconFinish;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"icon edit\"]")
    private MobileElement editIcon;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete Workout\"]")
    private MobileElement deleteButtoon;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete Training\"]")
    private MobileElement confirmDelete;


    TouchAction tapCoordinates;



    public void startTraining() {



        day1.click();
        warmup.click();

        startButton.click();

        /*while (nextExerciseCell.isEnabled()) {
            nextExerciseCell1.click();
            System.out.println("clicked");
        } */

        for (int i=0; i<7; i++){

            nextExerciseCell.click();

            }

        finalExerciseLabel.click();

        saveTraining.click();
        finishTraining.click();
        warmup.click();
        editIcon.click();
        deleteButtoon.click();
        confirmDelete.click();
        day1.click();


    }
    public void deleteTraining(){

    }
}
