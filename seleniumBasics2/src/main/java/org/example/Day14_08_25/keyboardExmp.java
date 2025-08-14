package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardExmp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Actions act = new Actions(driver);
        Thread.sleep(2500);
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        act.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.xpath("//input[@id='pass'"));
        act.moveToElement(pass).keyDown(Keys.SHIFT).sendKeys("hi").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(2500);
    }
}
