package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class navigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();  // Maximize the Window

        Thread.sleep(2000);
        driver.navigate().back();     // Navigate to back on window
        Thread.sleep(2000);
        driver.navigate().forward();    // Navigate to forward on window
        Thread.sleep(2000);
        driver.navigate().refresh();    // Navigate to refresh on window

        driver.close();
    }
}
