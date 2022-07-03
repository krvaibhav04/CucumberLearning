package bddAutomation.cucumberRunnerOtpions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    //format = {"pretty", "html:target/Destination"},
    features="src/test/java/features/Login.feature", 
    glue="stepDefinations")
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
