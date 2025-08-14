package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class datePicker {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        ChromeOptions chromeopt = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeopt);
        driver.get("https://ui.shadcn.com/docs/components/date-picker");

        Thread.sleep(2500);
        WebElement picker = driver.findElement(By.id("date"));
        picker.click();
        Thread.sleep(1000);
        WebElement pic = driver.findElement(By.xpath("//button[@aria-label='Wednesday, August 20th, 2025']"));
        pic.click();
        Thread.sleep(1500);
        WebElement pic2 = driver.findElement(By.xpath("//button[@data-day='10/10/2010']"));
        pic2.click();


    }
}
