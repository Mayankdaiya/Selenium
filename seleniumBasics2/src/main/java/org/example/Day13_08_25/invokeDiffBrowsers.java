package org.example.Day13_08_25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invokeDiffBrowsers {
    public static void invokeChromeBrowser(){
        WebDriverManager.chromedriver().setup();   // Automatic
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.google.com/chrome/what-you-make-of-it/");
    }

    public static void invokeFireFoxBrowser(){
        WebDriverManager.firefoxdriver().setup();  // Automatic
        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://www.firefox.com/en-US/?utm_campaign=SET_DEFAULT_BROWSER");
    }

    public static void invokeMSEdgeBrowse(){
        System.setProperty("webdriver.edge.driver", "C:/drivers/msedgedriver.exe");    // Manual
        WebDriver msedge = new EdgeDriver();
        msedge.get("https://www.microsoft.com/en-us/edge/download?ch=1&form=MA13FJ");
    }

    public static void main(String[] args) {
        invokeMSEdgeBrowse();
    }
}
