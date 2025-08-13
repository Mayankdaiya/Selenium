package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class dropdownExample {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        ChromeOptions chromeopt = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeopt);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(2500);

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select select = new Select(dropdown);
        Thread.sleep(2000);
        select.selectByVisibleText("Option1");
        Thread.sleep(2000);
        select.selectByValue("option2");

        System.out.println( "Hello World!" );
    }
}
