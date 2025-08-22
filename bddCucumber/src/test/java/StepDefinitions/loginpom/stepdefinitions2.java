package StepDefinitions.loginpom;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.loginpage;
import utils.DriverFactory;

import java.util.List;
import java.util.Map;

public class stepdefinitions2 {

    WebDriver driver = DriverFactory.getDriver();
    loginpage lp = new loginpage(driver);

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        System.out.println("User navigated to login page");
//        driver = DriverFactory.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
    }

    @When("user enters credentials")
    public void user_enters_credentials(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> user : users) {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(10000);

            String username = user.get("username");
            String password = user.get("password");

            WebElement username1 = driver.findElement(By.name("username"));
            Thread.sleep(4000);
            username1.sendKeys(username);
            Thread.sleep(2000);

            WebElement password1 = driver.findElement(By.name("password"));
            password1.sendKeys(password);
            Thread.sleep(2000);

        }
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        System.out.println("user clicks on login button");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() throws InterruptedException {
        // fail your scenerio
        if(driver.getCurrentUrl().contains("/dashboard")) System.out.println("User navigated to home page");
        else Assert.fail("This scenario is failed intentionally");
        Thread.sleep(2000);
        DriverFactory.quitDriver();
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        // launch the application on the chrome browser
        Thread.sleep(10000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
        lp.enterCredentials(username, password);
    }

    @Then("the user should be navigated to the home page")
    public void the_user_should_be_navigated_to_the_home_page() throws InterruptedException {
        lp.clickLogin();
        Thread.sleep(2000);
        DriverFactory.quitDriver();
    }
}
