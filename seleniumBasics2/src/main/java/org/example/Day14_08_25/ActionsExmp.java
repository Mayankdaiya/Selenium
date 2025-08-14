package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsExmp {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        ChromeOptions chromeopt = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeopt);
        driver.get("https://www.amazon.in");
        Actions act = new Actions(driver);
        Thread.sleep(2500);
        WebElement sell = driver.findElement(By.xpath("//a[normalize-space()='Sell']"));
        act.doubleClick(sell).perform();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2500);
        WebElement mobiles = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
        act.doubleClick(mobiles).perform();
    }
}
