package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoachPageIOS implements CoachPage {

    public CoachPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(id = "com.freeletics.debug:id/app_tour_login_button")
    private MobileElement loginButton;

    public void startTraining(){

    }
}
