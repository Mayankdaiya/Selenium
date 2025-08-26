package pages;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class practiceformsubmit {

    private WebDriver driver;

    // locators
    private By ename = By.name("name");
    private By eemail = By.name("email");
    private By[] egender = {By.id("gender"), By.xpath("//div[3]//div[1]//div[1]//div[2]//input[1]"), By.xpath("//div[3]//div[1]//div[1]//div[3]//input[1]")};
    private By emobile = By.id("mobile");
    private By edob = By.id("dob");
    private By esubjects = By.id("subjects");
    private By[] ehobbies = {By.id("hobbies"), By.xpath("//div[7]//div[1]//div[1]//div[2]//input[1]"), By.xpath("//div[7]//div[1]//div[1]//div[3]//input[1]")};
    private By epicture = By.xpath("//input[@id='picture']");
    private By eaddress = By.xpath("//textarea[@id='picture']");
    private String estate = "//select[@id='state']/option[@value='";
    private String ecity = "//select[@id='city']/option[@value='";
    private By esubmit = By.xpath("//input[@value='Login']");

    public practiceformsubmit(WebDriver driver){
        this.driver = driver;
    }

    public void fillInPersInfo(Map<String, String> map) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(ename).sendKeys(map.get("Name"));
        driver.findElement(eemail).sendKeys(map.get("Email"));
        String gender = map.get("Gender");
        if(gender.equals("Male")) driver.findElement(egender[0]).click();
        else if(gender.equals("Female")) driver.findElement(egender[1]).click();
        else driver.findElement(egender[2]).click();
        driver.findElement(emobile).sendKeys(map.get("Mobile"));
        driver.findElement(edob).sendKeys(map.get("DOB"));
    }

    public void fillInAcademics(Map<String,String> map) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(esubjects).sendKeys(map.get("Subjects"));
        String hob = map.get("Hobbies");
        if(hob.contains("Sports")) driver.findElement(ehobbies[0]).click();
        if(hob.contains("Reading")) driver.findElement(ehobbies[1]).click();
        if(hob.contains("Music")) driver.findElement(ehobbies[2]).click();
    }

    public void uploadFile(String path) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(epicture).sendKeys(path);
    }

    public void fillInAddress(Map<String,String> map) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(eaddress).sendKeys(map.get("Address"));
        estate += map.get("State")+"']";
        driver.findElement(By.xpath(estate)).click();
        ecity += map.get("City")+"']";
        driver.findElement(By.xpath(ecity)).click();
    }

    public void submitForm() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(esubmit));
//        driver.findElement().click();
    }
}
