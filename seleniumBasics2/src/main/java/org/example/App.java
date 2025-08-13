package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * locators in selenium
 * id - unique attribute
 * name - name attribute - name of the element
 * classname - common class name applied for multiple elements  grouped together
 * linktext - text present on the link
 * partial link text - partial link text text on the web element
 * tagname - the first word in the web element after the opening tag - this is applied for mutlipel web elements in the page
 * css selector - #name
 * div.oxd-form-row:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)
 */

public class App {
    public static void main( String[] args ) throws InterruptedException {
//        ChromeOptions chromeopt = new ChromeOptions();
//        EdgeOptions edgeopt = new EdgeOptions();
//        WebDriverManager.edgedriver().setup();   // automatic setup
//        System.setProperty("webdriver.edge.driver", "C:/drivers/msedgedriver.exe");  // manual setup
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

        Thread.sleep(2500);

        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));


        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBtn.click();

        System.out.println( "Hello World!" );

    }
}
