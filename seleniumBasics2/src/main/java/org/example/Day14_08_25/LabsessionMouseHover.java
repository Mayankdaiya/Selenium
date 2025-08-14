package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LabsessionMouseHover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions act = new Actions(driver);
        Thread.sleep(2500);
        WebElement mousehover = driver.findElement(By.xpath("//button[@id='mousehover']"));
        act.moveToElement(mousehover).perform();
        Thread.sleep(2000);
        WebElement joinNow = driver.findElement(By.xpath("//a[normalize-space()='Top']"));
        act.click(joinNow).perform();
        Thread.sleep(2500);
        String url = driver.getCurrentUrl();
        if(url.contains("/#top")){
            System.out.println("On #top url");
        } else System.out.println("Not on #top url");
    }
}
