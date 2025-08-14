package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fileUpload {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        ChromeOptions chromeopt = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeopt);
        driver.get("https://the-internet.herokuapp.com/upload");

        Thread.sleep(2500);
        WebElement fileupload = driver.findElement(By.xpath("//input[@id='file-upload']"));
        fileupload.sendKeys("C:\\Users\\Mayank\\Downloads\\logocss.gif");
        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.xpath("//input[@id='file-submit']"));
        submit.click();
    }
}
