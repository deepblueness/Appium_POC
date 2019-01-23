package Test;
import AppiumSupport.AppiumController;
import org.junit.Test;

public class LoginTest  extends BaseTestClass {

    @Test
    public void login() {

        loginPage.login();

        coachPage.startTraining();


    }
}
