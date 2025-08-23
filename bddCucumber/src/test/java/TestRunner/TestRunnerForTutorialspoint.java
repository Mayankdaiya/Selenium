package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

// using junit
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources/Features/tutorialspoint.feature",
//        glue = {"StepDefinitions.tutorialspoint", "Hooks"},   // <--- match your step definition package
//        plugin = {"pretty", "html:target/cucumber-reports"},
//        monochrome = true
//)
//public class TestRunnerForTutorialspoint {
//}

// using testng
@CucumberOptions(
        features = "src/test/resources/Features/tutorialspoint.feature",
        glue = {"StepDefinitions.tutorialspoint", "Hooks"},   // <--- match your step definition package
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class TestRunnerForTutorialspoint extends AbstractTestNGCucumberTests {
}
