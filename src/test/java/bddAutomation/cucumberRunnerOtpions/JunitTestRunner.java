package bddAutomation.cucumberRunnerOtpions;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    //format = {"pretty", "html:target/Destination"},
    features="src/test/java/bddAutomation/features/Login.feature",
    glue="bddAutomation/stepDefinations",
    stepNotifications = true
    )
public class JunitTestRunner {

}
