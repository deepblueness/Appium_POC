package PageObjects;


import io.appium.java_client.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;



public class LoginPageIOS implements LoginPage {


    public LoginPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, 80, TimeUnit.SECONDS), this);

    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"fl_accessibility_tourpage_login\"]")
    private MobileElement loginButton;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"fl_accessibility_enter_email\"]")
    private MobileElement emailField;
    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"fl_accessibility_enter_password\"]")
    private MobileElement passwordField;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"fl_accessibility_send_password_button\"]")
    private MobileElement loginSubmit;


    public void login() {

        loginButton.click();
        System.out.println("i clicked the login button");
        emailField.sendKeys("anastasia+appium1@freeletics.com");
        System.out.println("i filled in the email");
        passwordField.sendKeys("test");
        System.out.println("i filled in the pass");
        loginSubmit.click();
        System.out.println("i fuking logged in");

    }
}
