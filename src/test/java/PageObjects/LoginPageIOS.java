package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageIOS implements LoginPage {


    public LoginPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"fl_accessibility_tourpage_login\"]")
    private MobileElement loginButton;
    @FindBy(xpath = "XCUIElementTypeTextField[@name=\"fl_accessibility_enter_email\"]")
    private MobileElement emailField;
    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"fl_accessibility_enter_password\"]")
    private MobileElement passwordField;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"fl_accessibility_send_password_button\"]")
    private MobileElement loginSubmit;
    @FindBy(id="//XCUIElementTypeStaticText[@name=\"fl_accessibility_your_journeys_label\"]")
    private MobileElement tjTitle;




    public void login() {
        emailField.sendKeys("1@freeletics.com");
        passwordField.sendKeys("freeletics");
        loginSubmit.click();
    }
}
