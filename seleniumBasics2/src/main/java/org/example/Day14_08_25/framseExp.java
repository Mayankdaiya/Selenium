package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framseExp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        Actions act = new Actions(driver);
        Thread.sleep(1000);
        // identify the ifram and switch to it
        // index or xpath can be used
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//        driver.switchTo().frame(0);
        driver.switchTo().frame(frame);
        Thread.sleep(2500);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        act.dragAndDrop(drag,drop).perform();
    }
}
