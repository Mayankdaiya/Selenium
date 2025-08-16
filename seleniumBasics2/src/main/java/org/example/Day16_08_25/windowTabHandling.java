package org.example.Day16_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class windowTabHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement clickhere = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
        clickhere.click();
        Object windowhandles[] = driver.getWindowHandles().toArray();
//        driver.switchTo().window((String) windowhandles[1]);
        Thread.sleep(1200);
        driver.switchTo().window((String) windowhandles[0]);

    }
}
