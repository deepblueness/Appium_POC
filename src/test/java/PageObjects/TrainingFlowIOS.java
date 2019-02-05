package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TrainingFlowIOS implements TrainingFlowPage  {

    public TrainingFlowIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver,60, TimeUnit.SECONDS), this);
        tapCoordinates = new TouchAction(driver);

    }

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
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Finish\"]")
    private MobileElement finishTraining;


    TouchAction tapCoordinates;



    public void doTraining() {

        warmup.click();
        warmup.click(); //to dismiss 2by2

        startButton.click();


        for (int i=0; i<7; i++){

            nextExerciseCell.click();

        }

        finalExerciseLabel.click();
        saveTraining.click();
        finishTraining.click();
        warmup.click();



    }
}
