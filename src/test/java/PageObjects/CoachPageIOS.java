package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CoachPageIOS implements CoachPage  {

    public CoachPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver,60, TimeUnit.SECONDS), this);

    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1\"]")
    private MobileElement day1;


    public void selectDay(){

        day1.click();
    };
}
