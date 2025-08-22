package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// Day 22-08-25
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/loginpom.feature",
        glue = {"StepDefinitions.loginpom"},   // <--- match your step definition package
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class TestRunner2 {
}
