package StepDefinitions.logindemo;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;


public class StepDefinitions {

        WebDriver driver;

        @Given("User is on the login page")
        public void user_is_on_the_login_page() throws InterruptedException {
            System.out.println("User navigated to login page");
//            driver = new ChromeDriver();
            driver = DriverFactory.getDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(3000);
        }

        @When("user enters the username {string}")
        public void user_enters_the_username(String user) throws InterruptedException {
            System.out.println("User enters username");
            driver.findElement(By.name("username")).sendKeys(user);
            Thread.sleep(1000);
        }

        @When("user enters the password {string}")
        public void user_enters_the_password(String pass) throws InterruptedException {
            System.out.println("User enters password");
            driver.findElement(By.xpath("//input[@name = 'password']"))
                    .sendKeys(pass);
            Thread.sleep(1000);
        }

        @When("user clicks on the login button")
        public void user_clicks_on_the_login_button() throws InterruptedException {
            WebElement element = driver.findElement(By.xpath("//button[@type = 'submit']"));
            if(element.isDisplayed()){
                element.click();
                System.out.println("User clicks login");
            }
            else {
                System.out.println("User unable to click login");
            }
            Thread.sleep(1000);
        }

        @Then("user is navigated to home page")
        public void user_is_navigated_to_home_page() throws InterruptedException {
            // fail your scenerio
            if(driver.getCurrentUrl().contains("/dashboard")) System.out.println("User navigated to home page");
            else Assert.fail("This scenario is failed intentionally");
            Thread.sleep(2000);
            DriverFactory.quitDriver();
        }
}
