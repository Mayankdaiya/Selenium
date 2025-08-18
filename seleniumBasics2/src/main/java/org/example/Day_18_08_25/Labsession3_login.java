package org.example.Day_18_08_25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Labsession3_login {
    public static void clickEvent(WebDriver driver, String xpath, String Keys){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            element.click();
            if(!Keys.isEmpty()) {
                element.clear();
                element.sendKeys(Keys);
            }
        } catch (Exception e){
            System.out.println("Element not Clickable within the time frame");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
        // check for valid credentials
        // username
        clickEvent(driver,"//input[@id='username']", "student");
        // password
        clickEvent(driver,"//input[@id='password']","Password123");
        // enter submit
        clickEvent(driver, "//button[@id='submit']", "");
        // check login status
        if(driver.getCurrentUrl().contains("/logged-in-successfully/")){
            System.out.println("Login successfully");
        } else {
            System.out.println("Login failed");
            String err = driver.findElement(By.xpath("//div[@id='error']")).getText();
            System.out.println(err);
        }
        // logout
        clickEvent(driver, "//a[normalize-space()='Log out']","");
        // Check for invalid username
        // username
        clickEvent(driver,"//input[@id='username']", "student2");
        // password
        clickEvent(driver,"//input[@id='password']","Password123");
        // enter submit
        clickEvent(driver, "//button[@id='submit']", "");
        // check login status
        if(driver.getCurrentUrl().contains("/logged-in-successfully/")){
            System.out.println("Login successfully");
        } else {
            System.out.println("Login failed");
            String err = driver.findElement(By.xpath("//div[@id='error']")).getText();
            System.out.println(err);
        }
        // Check for valid username but invalid password
        // username
        clickEvent(driver,"//input[@id='username']", "student");
        // password
        clickEvent(driver,"//input[@id='password']","Password3");
        // enter submit
        clickEvent(driver, "//button[@id='submit']", "");
        // check login status
        if(driver.getCurrentUrl().contains("/logged-in-successfully/")){
            System.out.println("Login successfully");
        } else {
            System.out.println("Login failed");
            String err = driver.findElement(By.xpath("//div[@id='error']")).getText();
            System.out.println(err);
        }

    }
}
