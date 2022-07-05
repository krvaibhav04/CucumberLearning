package bddAutomation.cucumberRunnerOtpions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    //format = {"pretty", "html:target/Destination"},
    features="src/test/java/bddAutomation/features/Login.feature",
    glue="bddAutomation/stepDefinations")
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
