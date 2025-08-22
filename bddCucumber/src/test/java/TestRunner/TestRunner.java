package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// for login demo by mam
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources/Features",
//        glue = {"StepDefinitions.logindemo", "Hooks"},   // <--- match your step definition package
//        plugin = {"pretty", "html:target/cucumber-reports"},
//        monochrome = true
//)

// labsession sauce demo
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/saucedemo.feature",
        glue = {"StepDefinitions.saucedemo"},   // <--- match your step definition package
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)

public class TestRunner {

}
