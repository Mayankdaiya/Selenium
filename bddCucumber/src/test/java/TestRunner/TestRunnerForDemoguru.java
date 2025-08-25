package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/demoguru.feature",
        glue = {"StepDefinitions.demoguru99", "Hooks"},   // <--- match your step definition package
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class TestRunnerForDemoguru extends AbstractTestNGCucumberTests{
}
