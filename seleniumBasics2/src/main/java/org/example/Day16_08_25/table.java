package org.example.Day16_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class table {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        int rowscount = rows.size();
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']/thead/tr[1]/th"));
        int colcount = cols.size();
        System.out.println("rows ->"+rowscount +" , cols ->" +colcount);
        WebElement celltext = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[4]/td[3]"));
        String actualText = celltext.getText();
        String expectText = "tconway@earthlink.net";
        if(actualText.equalsIgnoreCase(expectText)){
            System.out.println("Text matches");
        } else System.out.println("Text do not match");
    }
}
