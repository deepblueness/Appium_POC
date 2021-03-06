package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPageAndroid implements LoginPage {


    @FindBy(id = "com.freeletics.debug:id/app_tour_login_button")
    private MobileElement loginButton;
    @FindBy(id = "com.google.android.gms:id/cancel")
    private MobileElement realDeviceCreadentialsAlert;
    @FindBy(id="com.freeletics.debug:id/login_email_edit_text")
    private MobileElement emailField;
    @FindBy(id="com.freeletics.debug:id/login_password_edit_text")
    private MobileElement passwordField;
    @FindBy(id="com.freeletics.debug:id/login_login_button")
    private MobileElement loginSubmit;
    @FindBy(id="com.freeletics.debug:id/campaign_popup_image")
    private MobileElement signingInPopup;

    public LoginPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver,80, TimeUnit.SECONDS), this);
    }



    public void login() {
        loginButton.click();
        //realDeviceCreadentialsAlert.click();
        //realDeviceCreadentialsAlert.click();
        //emailField.sendKeys("anastasia+appium1@freeletics.com");
        emailField.sendKeys("2@freeletics.com");
        passwordField.sendKeys("freeletics");
        loginSubmit.click();



    }
}
