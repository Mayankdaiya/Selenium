package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class checkboxExample {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        ChromeOptions chromeopt = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeopt);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(2500);

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));

        checkbox1.click();
        checkbox2.click();
        System.out.println( "Hello World!" );
    }
}
