package StepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinitions {

        @Given("User is on the login page")
        public void user_is_on_the_login_page() {
            System.out.println("User navigated to login page");
        }

        @When("user enters the username")
        public void user_enters_the_username() {
            System.out.println("User enters username");
        }

        @When("user enters the password")
        public void user_enters_the_password() {
            System.out.println("User enters password");
        }

        @When("user clicks on the login button")
        public void user_clicks_on_the_login_button() {
            System.out.println("User clicks login");
        }

        @Then("user is navigated to home page")
        public void user_is_navigated_to_home_page() {
            System.out.println("User navigated to home page");
        }
}
