package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class fileDownload {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        ChromeOptions chromeopt = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeopt);
        driver.get("https://the-internet.herokuapp.com/download");

        Thread.sleep(2500);
        WebElement file = driver.findElement(By.cssSelector("a[href='download/logocss.gif']"));
        file.click();
        Thread.sleep(2000);
        File f = new File("C:\\Users\\Mayank\\Downloads\\logocss.gif");
        if(f.exists()){
            System.out.println("File downloaded successfully");
        } else System.out.println("File not downloaded");
        Thread.sleep(2000);

    }
}
