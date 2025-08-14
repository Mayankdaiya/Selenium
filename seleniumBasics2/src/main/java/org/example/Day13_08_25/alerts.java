package org.example.Day13_08_25;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);
        //simple alert
        WebElement simpleAlert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        Thread.sleep(2000);
        simpleAlert.click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        //Confirmation alert
        WebElement confirmAlert = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        Thread.sleep(2000);
        confirmAlert.click();
        Thread.sleep(1000);
        alert.dismiss();
        Thread.sleep(2000);
        //Promt alert
        WebElement promtAlert = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        Thread.sleep(2000);
        promtAlert.click();
        Thread.sleep(1000);
        alert.sendKeys("Mayank");
        alert.accept();
        Thread.sleep(2000);
    }
}
