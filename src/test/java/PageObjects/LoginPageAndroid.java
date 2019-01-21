package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAndroid implements LoginPage {


    public LoginPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.freeletics.debug:id/app_tour_login_button")
    private MobileElement loginButton;
    @FindBy(id="com.freeletics.debug:id/login_email_edit_text")
    private MobileElement emailField;
    @FindBy(id="com.freeletics.debug:id/login_password_edit_text")
    private MobileElement passwordField;
    @FindBy(id="com.freeletics.debug:id/login_login_button")
    private MobileElement loginSubmit;
    @FindBy(id="com.freeletics.debug:id/campaign_popup_image")
    private MobileElement imageCampaign;
    @FindBy(id="com.freeletics.debug:id/title")
    private MobileElement tjTitle;


    public void login() {
        loginButton.click();
        emailField.sendKeys("1@freeletics.com");
        passwordField.sendKeys("freeletics");
        loginSubmit.click();
    }
}
