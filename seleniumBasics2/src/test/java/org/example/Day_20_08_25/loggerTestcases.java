package org.example.Day_20_08_25;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loggerTestcases {
    // Annotations we can control the flow of execution
    private static final Logger log = loggerHelper.getLogger(loggerTestcases.class);
    // by using it we donn't need to create loggerHelper class
//    private static final Logger log = LogManager.getLogger(TestNGTestcase.class);

    @Test
    public void launchbrowser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        log.info("Invoking the browser -> internet_herokuapp");
        driver.get("https://the-internet.herokuapp.com/windows");
        log.info("Maximizing the browser window -> internet_herokuapp");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);
        log.info("Invoking the browser -> orangeHRM");
        WebElement username = driver.findElement(By.name("username"));

        log.info("Entering the username in orangeHRM");
        username.sendKeys("Admin");
        Thread.sleep(2000);

        // enter text in password field
        log.info("Entering the password in orangeHRM");
        driver.findElement(By.xpath("//input[@name = 'password']"))
                .sendKeys("admin123");

        // click on login button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
