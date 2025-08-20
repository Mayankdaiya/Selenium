package org.example.Day16_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iFrameExmp {
    // An iframe (short for inline frame) is an HTML element (<iframe>) that allows
    // one web page to be embedded inside another. Think of it as a window within a window.
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));

//         driver.switchTo().frame(0);   // using index
//         driver.switchTo().frame("singleframe"); // using ID
//         driver.switchTo().frame("SingleFrame"); // using Name
         driver.switchTo().frame(frame1); // using Webelement
        // at last click on the item
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mayank");
         // switch to the main page using this
         driver.switchTo().defaultContent();
         // for nested frames we use to switch back to parent frame
//        driver.switchTo().parentFrame();
    }
}
