package StepDefinitions.tutorialspoint;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.practiceformsubmit;
import utils.DriverFactory;

import java.util.Map;

public class practiceformsubmission {

    WebDriver driver;
    practiceformsubmit pom;

    @Given("the user is on the form page")
    public void theUserIsOnTheFormPage() {
        driver = DriverFactory.getDriver(); // (Use WebDriverManager or hooks in real setup)
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        pom = new practiceformsubmit(driver);
    }

    @When("the user enters personal information:")
    public void enterPersonalInfo(DataTable data) throws InterruptedException {
        Map<String, String> map = data.asMap(String.class, String.class);
        pom.fillInPersInfo(map);
    }

    @When("the user enters academic information:")
    public void enterAcademics(DataTable data) throws InterruptedException {
        Map<String, String> map = data.asMap(String.class, String.class);
        pom.fillInAcademics(map);
    }

    @When("the user uploads a picture {string}")
    public void uploadPicture(String path) throws InterruptedException {
        pom.uploadFile(path);
    }

    @When("the user enters address and location:")
    public void enterAddressAndLocation(DataTable data) throws InterruptedException {
        Map<String, String> map = data.asMap(String.class, String.class);
        pom.fillInAddress(map);
    }

    @When("the user submits the form")
    public void submitForm() throws InterruptedException {
        pom.submitForm();
    }

    @Then("the form should be submitted successfully")
    public void verifySuccess() {
        System.out.println("Login successfully");
        DriverFactory.quitDriver();
    }
}

// https://reports.cucumber.io/reports/08c4b220-4d75-4fdb-b4dc-8fa5b264fee7 -> report