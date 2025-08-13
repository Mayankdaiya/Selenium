package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class labDeselect {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://grotechminds.com/multiple-select/?automobiles=motorcycle");
        Thread.sleep(2000);
        WebElement input = driver.findElement(By.xpath("//select[@id = 'automobiles']"));
        Select select = new Select(input);

        Thread.sleep(2000);
        select.selectByVisibleText("Motorcycle");
        Thread.sleep(2000);
        select.selectByVisibleText("SUV");
        select.selectByVisibleText("Sedan");
        Thread.sleep(2000);
        select.deselectByVisibleText("Motorcycle");
        select.deselectAll();

    }
}
