package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class formsubmit {

    private WebDriver driver;

    // contactInfo locators
    private By efname = By.name("firstName");
    private By elname = By.name("lastName");
    private By ephone = By.name("phone");
    private By eemail = By.id("userName");

    // MailingInfo locators
    private By eaddress = By.name("address1");
    private By ecity = By.name("city");
    private By estate = By.name("state");
    private By epostal = By.name("postalCode");
    private By ecountries = By.xpath("//select/option");

    // UserInfo locators
    private By euser = By.id("email");
    private By epass = By.name("password");
    private By ecpass = By.name("confirmPassword");

    // submit button locator
    private By esubmit = By.name("submit");

    public formsubmit(WebDriver driver) {
        this.driver = driver;
    }

    // page actions
    public void fillInContInfo(Map<String, String> map) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(efname).sendKeys(map.get("First Name"));
        driver.findElement(elname).sendKeys(map.get("Last Name"));
        driver.findElement(ephone).sendKeys(map.get("Phone"));
        driver.findElement(eemail).sendKeys(map.get("Email"));
    }

    public void fillInMailingInfo(Map<String, String> map) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(eaddress).sendKeys(map.get("Address"));
        driver.findElement(ecity).sendKeys(map.get("City"));
        driver.findElement(estate).sendKeys(map.get("State"));
        driver.findElement(epostal).sendKeys(map.get("Postal Code"));
        List<WebElement> countries = driver.findElements(ecountries);
        String country = map.get("Country");
        for(WebElement el: countries){
            if(el.getText().equals(country)){
                el.click();
                break;
            }
        }
    }

    public void fillInUserInfo(Map<String, String> map) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(euser).sendKeys(map.get("User Name"));
        driver.findElement(epass).sendKeys(map.get("Password"));
        driver.findElement(ecpass).sendKeys(map.get("Confirm Password"));
    }

    public void submit() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(esubmit).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
