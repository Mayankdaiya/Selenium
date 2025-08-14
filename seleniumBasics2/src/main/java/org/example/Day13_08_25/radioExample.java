package org.example.Day13_08_25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class radioExample {
    public static void main( String[] args ) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeopt = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeopt);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(2500);

        WebElement radiobtn1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        WebElement radiobtn2 = driver.findElement(By.xpath("//input[@value='radio2']"));

        radiobtn1.click();
        radiobtn2.click();
        System.out.println( "Hello World!" );

    }
}

