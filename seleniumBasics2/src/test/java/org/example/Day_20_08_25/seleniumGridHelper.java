package org.example.Day_20_08_25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class seleniumGridHelper {
    // remote web driver to support remote computers and browsers
    // Thread local is for the parallel execution support

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

    // my remote ip
    public static String remote_url = "http://192.168.29.29:4444";

    @BeforeMethod
    public void setDriver() throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();
        driver.set(new RemoteWebDriver(new URL(remote_url), options));
        driver.get().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.get().manage().window().maximize();

    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void closeBrowser() {
        //driver.get().quit();
        //driver.remove();
    }
}

