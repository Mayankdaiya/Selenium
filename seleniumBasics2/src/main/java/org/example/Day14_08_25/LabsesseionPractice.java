package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LabsesseionPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Actions act = new Actions(driver);

        WebElement show = driver.findElement(By.id("show-textbox"));
        show.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("displayed-text")));
        WebElement inputtxt = driver.findElement(By.id("displayed-text"));
        inputtxt.sendKeys("Hi, I am mayank");
        WebElement hide = driver.findElement(By.id("hide-textbox"));
        hide.click();
    }
}
