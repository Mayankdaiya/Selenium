package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        ChromeOptions chromeopt = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeopt);
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions act = new Actions(driver);
        Thread.sleep(2500);

        WebElement from = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement to = driver.findElement(By.xpath("//div[@id='column-b']"));

        act.dragAndDrop(from,to).perform();

    }
}
