package StepDefinitions.demoguru99;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.formsubmit;
import utils.DriverFactory;

import java.util.Map;

public class formsubmission {

    WebDriver driver;
    formsubmit pom;

    @Given("the user is on the contact registration page")
    public void user_is_on_contact_registration_page() {
        driver = DriverFactory.getDriver(); // (Use WebDriverManager or hooks in real setup)
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        pom = new formsubmit(driver);
    }

    @When("the user fills in contact information with:")
    public void fill_contact_information(DataTable data) throws InterruptedException {
        // fill contact information
        Map<String,String> map = data.asMap(String.class, String.class);
        pom.fillInContInfo(map);
    }

    @And("the user fills in mailing information with:")
    public void fill_mailing_information(DataTable data) throws InterruptedException {
        // fill mailing information
        Map<String,String> map = data.asMap(String.class, String.class);
        pom.fillInMailingInfo(map);
    }

    @And("the user fills in user information with:")
    public void fill_user_information(DataTable data) throws InterruptedException {
        // fill user information
        Map<String,String> map = data.asMap(String.class, String.class);
        pom.fillInUserInfo(map);
    }

    @And("the user submits the form")
    public void submit_form() throws InterruptedException {
        // submit the form
        pom.submit();
    }

    @Then("the form should be submitted successfully")
    public void verify_submission() throws InterruptedException {
        // verify if submit
        Thread.sleep(1000);
        if(driver.getCurrentUrl().contains("/register_sucess")) System.out.println("Registered successfully");
        else Assert.fail("Registration fails");
        DriverFactory.quitDriver();
    }
}

//  https://reports.cucumber.io/reports/1cb377f5-3ad9-4f0b-98e5-4e284acbabb1  -> report pass scenerio
// https://reports.cucumber.io/reports/5a404a5c-1abf-4a3c-83a7-a27b24d503bb   -> report fail scenerio
