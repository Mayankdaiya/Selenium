package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        Actions act = new Actions(driver);
        Thread.sleep(2500);
        WebElement prime = driver.findElement(By.xpath("//a[normalize-space()='Prime']"));
        act.moveToElement(prime).perform();
        Thread.sleep(2000);
        WebElement joinNow = driver.findElement(By.xpath("//a[@href ='/prime']"));
        act.click(joinNow).perform();
        Thread.sleep(2500);

    }
}
