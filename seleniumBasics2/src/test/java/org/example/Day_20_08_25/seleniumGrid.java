package org.example.Day_20_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class seleniumGrid extends seleniumGridHelper{

    @Test
    public void login() throws InterruptedException {
        Thread.sleep(1000);
        // username
        WebElement Username = getDriver().findElement(By.name("username"));
        Username.sendKeys("Admin");
        Thread.sleep(1000);

        // password
        WebElement Password  = getDriver().findElement(By.name("password"));
        Password.sendKeys("admin123");
        Thread.sleep(1000);

        // click
        WebElement LoginButton = getDriver().findElement(By.tagName("button"));
        LoginButton.click();
        Thread.sleep(2000);

    }


}
