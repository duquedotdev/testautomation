package steps;

import com.aphelium.testautomation.DriveFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends DriveFactory {

    @Before
    public void beforeScenarios(){
        startDriver();
    }

    @AfterStep
    public void afterStep(Scenario scenario) throws Exception {
        Thread.sleep(500);
    }

    @After
    public void afterScenarios(){
        quitDriver();
    }

}
