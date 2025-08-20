package org.example.Day_19_08_25;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readExcelFile {
    static WebDriver driver;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static XSSFCell cell;

    public static void login() throws IOException{
        File src = new File("E:\\Study\\Wipro\\Selenium\\seleniumBasics2\\src\\test\\java\\org\\example\\Day_19_08_25\\testData.xlsx");
        FileInputStream fis = new FileInputStream(src);
        // load the workbook and sheet
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);

        // create a for loop to iterate in the sheet of rows and columns
        for (int i = 1; i<= sheet.getLastRowNum(); i++) {
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/login");
            // import  the username from the excel sheet
            cell = sheet.getRow(i).getCell(0);
            // entering username
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys(cell.getStringCellValue());
            cell = sheet.getRow(i).getCell(1);
            // entering password
            driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(cell.getStringCellValue());
        }
    }

    public static void main(String[] args) throws IOException {
        login();
    }
}
