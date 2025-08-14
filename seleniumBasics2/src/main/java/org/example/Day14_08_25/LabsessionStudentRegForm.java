package org.example.Day14_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LabsessionStudentRegForm {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        ChromeOptions chromeopt = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeopt);
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        Thread.sleep(2500);
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Mayank");
        Thread.sleep(1200);
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("mayank@xyz.com");
        Thread.sleep(1200);
        WebElement gender = driver.findElement(By.xpath("//input[@id='gender']"));
        gender.click();
        Thread.sleep(1200);
        WebElement number = driver.findElement(By.cssSelector("#mobile"));
        number.sendKeys("9998887770");
        Thread.sleep(1200);
        WebElement date = driver.findElement(By.id("dob"));
        date.sendKeys("01/01/1999");
        Thread.sleep(1200);
        WebElement subject = driver.findElement(By.cssSelector("#subjects"));
        subject.sendKeys("Computer Science Engineering");
        Thread.sleep(1200);
        WebElement hobbies1 = driver.findElement(By.xpath("//input[@id='hobbies']"));
        WebElement hobbies2 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//input[1]"));
        hobbies1.click();
        Thread.sleep(1000);
        hobbies2.click();
        Thread.sleep(1200);
        WebElement upload = driver.findElement(By.xpath("//input[@id='picture']"));
        upload.sendKeys("C:\\Users\\Mayank\\Downloads\\logocss.gif");
        Thread.sleep(1200);
        WebElement address = driver.findElement(By.xpath("//textarea[@id='picture']"));
        address.sendKeys("Haryana, India");
        Thread.sleep(1200);
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        WebElement city = driver.findElement(By.xpath("//select[@id='city']"));
        Select selectState = new Select(state);
        Select selectCity = new Select(city);
        selectState.selectByVisibleText("Haryana");
        selectCity.selectByVisibleText("Agra");
        Thread.sleep(1200);
        WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();
//        Thread.sleep(1200);
//        Thread.sleep(1200);
    }
}
