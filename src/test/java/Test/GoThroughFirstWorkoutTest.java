package Test;
import org.junit.Test;

public class GoThroughFirstWorkoutTest  extends BaseTestClass {

    @Test
    public void goThroughFirstWorkout() {

        loginPage.login();
        coachPage.selectDay();
        trainingFlowPage.doTraining();
        rewardPage.deleteTraining();

    }
}
