package StepDefinitions.saucedemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import utils.DriverFactory;

public class sauceDemo {
    WebDriver driver;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        System.out.println("User navigated to login page");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/index.html");
        Thread.sleep(3000);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        System.out.println("Clicking on login button");
        driver.findElement(By.id("login-button")).click();
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String user, String pass) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User enters username and password");
        driver.findElement(By.id("user-name")).sendKeys(user);
        Thread.sleep(1000);
        driver.findElement(By.id("password"))
                .sendKeys("admin123");
        Thread.sleep(1000);
    }

    @Then("User should be redirected to the dashboard")
    public void user_should_be_redirected_to_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is navigated to the home page");
        driver.quit();
    }

}
