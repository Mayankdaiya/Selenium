package org.example.Day13_08_25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browserCommands {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(2000);
        System.out.println(driver.getTitle());     // get the page title
        Thread.sleep(2000);
        System.out.println(driver.getPageSource()); // get source code of the html page
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());    // get the current url

        driver.close();
    }
}
