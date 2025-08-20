package org.example.Day_18_08_25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.naming.Name;
import java.io.File;
import java.time.Duration;

public class Labsession_testng {
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

    @Test (enabled = false, groups = {"Form Filling and Submission"}, priority = 3)
    public static void formFilling() throws InterruptedException {
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

    @Test (groups = {"Login Automation", "Automation"}, priority = 0)
    @Parameters({"name", "password"})
    public static void loginAutomation(String Name, String Password) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
        // check for valid credentials
        // username
        clickEvent(driver,"//input[@id='username']", "student");
        // password
        clickEvent(driver,"//input[@id='password']","Password123");
        // enter submit
        clickEvent(driver, "//button[@id='submit']", "");
        // check login status
        if(driver.getCurrentUrl().contains("/logged-in-successfully/")){
            System.out.println("Login successfully");
        } else {
            System.out.println("Login failed");
            String err = driver.findElement(By.xpath("//div[@id='error']")).getText();
            System.out.println(err);
        }
        // logout
        clickEvent(driver, "//a[normalize-space()='Log out']","");
        // Check for invalid username
        // username
        clickEvent(driver,"//input[@id='username']", Name);
        // password
        clickEvent(driver,"//input[@id='password']","Password123");
        // enter submit
        clickEvent(driver, "//button[@id='submit']", "");
        // check login status
        if(driver.getCurrentUrl().contains("/logged-in-successfully/")){
            System.out.println("Login successfully");
        } else {
            System.out.println("Login failed");
            String err = driver.findElement(By.xpath("//div[@id='error']")).getText();
            System.out.println(err);
        }
        // Check for valid username but invalid password
        // username
        clickEvent(driver,"//input[@id='username']", "student");
        // password
        clickEvent(driver,"//input[@id='password']",Password);
        // enter submit
        clickEvent(driver, "//button[@id='submit']", "");
        // check login status
        if(driver.getCurrentUrl().contains("/logged-in-successfully/")){
            System.out.println("Login successfully");
        } else {
            System.out.println("Login failed");
            String err = driver.findElement(By.xpath("//div[@id='error']")).getText();
            System.out.println(err);
        }

    }

    @Test (groups = {"End-to-End Booking Flow for Hotel"}, priority = 2)
    public static void bookingHotel() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.net/");
        Thread.sleep(1500);
        // Hotels
        clickEvent(driver, "//ul[@id='tab']/li[2]/button", "");
        // city
        clickEvent(driver,"//span[@id='select2-hotels_city-container']", "");
        WebElement city = driver.findElement(By.xpath("//input[@role='searchbox']"));
        city.sendKeys("Dubai");
        Thread.sleep(800);
        city.sendKeys(Keys.ENTER);
        // checkin
        clickEvent(driver, "//input[@id='checkin']", "25-08-2025");
        // checkout
        clickEvent(driver, "//input[@id='checkout']","26-08-2025");
        // travellers
        clickEvent(driver, "//form[@id='hotels-search']//div[@class='dropdown dropdown-contain show active']","");
        // rooms
        clickEvent(driver, "//input[@id='hotels_rooms']","2");
        // adults
        clickEvent(driver, "//input[@id='hotels_adults']","");
        // search
        clickEvent(driver, "//form[@id='hotels-search']//button[@type='submit']","");
        // view more hotel
        clickEvent(driver, "//li[2]//div[1]//div[1]//div[1]//div[2]//div[1]//div[2]//div[2]//a[1]","");
        // book now
        Thread.sleep(4000);
        clickEvent(driver, "//strong[@class='fw-light']","");
//        Thread.sleep(1000);
        // Enter personal information
        clickEvent(driver, "//input[@id='p-first-name']","Mayank");
        clickEvent(driver, "//input[@id='p-last-name']","Kumar");
        clickEvent(driver, "//input[@id='p-email']","mayank@xyz.com");
        clickEvent(driver, "//input[@id='p-phone']","9273293747");
        clickEvent(driver, "//input[@id='p-address']","Gurgaon, Haryana, India");
//        clickEvent(driver, "//div[@class='dropdown-menu show']//input[@aria-label='Search']","India");

        // Enter traveller information
        clickEvent(driver, "//input[@name='firstname_1']", "Mayank");
        clickEvent(driver, "//input[@name='lastname_1']", "Kumar");
//        Thread.sleep(500);
        clickEvent(driver, "//input[@name='firstname_2']", "Dhruv");
        clickEvent(driver, "//input[@name='lastname_2']", "Mangla");

        // select payment option
        clickEvent(driver, "//input[@id='gateway_bank_transfer']", "");
        // check agreement
        clickEvent(driver, "//input[@id='agreechb']", "");
        // confirm booking
        clickEvent(driver, "//button[@id='booking']", "");
    }

    @Test (dependsOnMethods = {"bookingHotel"}, groups = {"Cart Automation", "Automation"}, priority = 1)
    public static void cartAutomation() throws InterruptedException {
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
