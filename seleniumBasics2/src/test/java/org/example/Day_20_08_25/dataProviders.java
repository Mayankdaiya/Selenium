package org.example.Day_20_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviders {

    @DataProvider(name = "loginData")
    public Object[][] getData(){
        return new Object[][]{
                {"admin","admin123"},
                {"admn","admin123"},
                {"adm","admin123"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys(username);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(password);

        // click on login button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
    }
}
