package org.example.Day_16_08_25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterisedTestNG {
    @Parameters({ "browser", "platform" })
    @Test
    public void testparameters(String browser, String platform) {
        if (browser.equals("chrome")) {
            if(platform.equals("widnows")) {
                ChromeOptions chromeOptions = new ChromeOptions();

                WebDriverManager.chromedriver().setup();

                WebDriver driver = new ChromeDriver(chromeOptions);

                driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            }
        }else {
            // Create EdgeDriver instance
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            // Open a webpage
            driver.get("https://www.google.com");
        }

    }
}
