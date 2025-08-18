package org.example.Day_18_08_25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Labsession4_cart {
    public static void clickEvent(WebDriver driver, String xpath, String Keys){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            element.click();
            if(!Keys.isEmpty()) {
                element.clear();
                element.sendKeys(Keys);
            }
        } catch (Exception e){
            System.out.println("Element not Clickable within the time frame");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");

        Thread.sleep(1000);
        // select laptops
        clickEvent(driver, "//a[3]","");
        // click mackbook pro
        clickEvent(driver, "//a[normalize-space()='MacBook Pro']","");
        // add to cart
        clickEvent(driver, "//a[normalize-space()='Add to cart']","");
        // accept alert
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // click on cart
        clickEvent(driver, "//a[@id='cartur']","");
        // place order
        clickEvent(driver, "//button[normalize-space(text())='Place Order']","");
        // input details
        clickEvent(driver, "//input[@id='name']","Mayank");
        clickEvent(driver, "//input[@id='country']","India");
        clickEvent(driver, "//input[@id='city']","Gurgaun");
        clickEvent(driver, "//input[@id='card']","HDFC Bank");
        clickEvent(driver, "//input[@id='month']","August");
        clickEvent(driver, "//input[@id='year']","2025");
        clickEvent(driver, "//button[normalize-space()='Purchase']","");
        Thread.sleep(1000);
        clickEvent(driver, "//button[normalize-space()='OK']","");
    }
}
