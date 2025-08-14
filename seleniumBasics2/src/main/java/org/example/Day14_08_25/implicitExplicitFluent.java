package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
/*
Implicit Wait: Set it once for basic stability.
Explicit Wait: Preferred for most modern web apps (Angular, React, etc.).
Fluent Wait: Use when: Element timing is highly variable
                       You need custom polling and exception handling
*/

public class implicitExplicitFluent {
    public static void implicitWait(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static void explicitWait(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitBtn")));
    }

    public static void fluentWait(WebDriver driver){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(dr -> dr.findElement(By.id("email")));
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        // implicit wait global
        implicitWait(driver);

        // explicit wait for specific condition to occur
        /* visibilityOfElementLocated()
           elementToBeClickable()
           presenceOfElementLocated()
           alertIsPresent()
           titleIs(), urlContains()   */
        explicitWait(driver);

        // fluent wait for customized version of explicit wait
        fluentWait(driver);
        Thread.sleep(2500);
    }
}
