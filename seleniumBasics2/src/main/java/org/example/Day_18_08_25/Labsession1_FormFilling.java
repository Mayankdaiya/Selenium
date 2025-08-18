package org.example.Day_18_08_25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Labsession1_FormFilling {
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
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
        // firstname
        clickEvent(driver,"//input[@name='firstname']", "Mayank");
        // lastname
        clickEvent(driver,"//input[@name='lastname']", "Kumar");
        // gender
        clickEvent(driver,"//input[@id='sex-0']", "");
        // experience
        clickEvent(driver,"//input[@id='exp-1']", "");
        // datepicker
        clickEvent(driver,"//input[@id='datepicker']", "10/07/2021");
        // profession
        clickEvent(driver,"//input[@id='profession-0']", "");
        clickEvent(driver,"//input[@id='profession-1']", "");
        // automation tools
        clickEvent(driver,"//input[@id='tool-2']", "");
        // continents
        WebElement cont = driver.findElement(By.xpath("//select[@id='continents']"));
        Select sel = new Select(cont);
        sel.selectByVisibleText("Australia");
        // selenium commands
        WebElement comm = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
        sel = new Select(comm);
        sel.selectByVisibleText("WebElement Commands");
        // upload image
        driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\Mayank\\Downloads\\logocss.gif");
        // download file
        clickEvent(driver,"//a[normalize-space()='Click here to Download File']", "");
        Thread.sleep(1500);
        clickEvent(driver, "//button[@class='Box-sc-g0xbh4-0 ivobqY prc-Button-ButtonBase-c50BI prc-Button-IconButton-szpyj']","");
        Thread.sleep(1000);
        File file = new File("C:\\Users\\Mayank\\Downloads\\conf.yaml");
        if(file.exists()) System.out.println("File downloaded successfully");
        else System.out.println("File not downloaded");
        // submit button
        driver.navigate().back();
        clickEvent(driver,"//button[@id='submit']", "");

    }
}
