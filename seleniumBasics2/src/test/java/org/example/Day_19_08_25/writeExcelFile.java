package org.example.Day_19_08_25;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeExcelFile {
    static WebDriver driver;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static XSSFCell cell;

    public static void login() throws IOException {
        File src = new File("E:\\Study\\Wipro\\Selenium\\seleniumBasics2\\src\\test\\java\\org\\example\\Day_19_08_25\\testData.xlsx");
        // we have to read first then apply write operation
        FileInputStream fis = new FileInputStream(src);
        // load the workbook and sheet
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);

        // create a for loop to iterate in the sheet of rows and columns
        for (int i = 1; i<= sheet.getLastRowNum(); i++) {
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/login");
            String title = driver.getTitle();
            FileOutputStream fos = new FileOutputStream(src);
            // import  the username from the excel sheet
            sheet.getRow(i).createCell(2).setCellValue(title);
            workbook.write(fos);
            fos.close();
        }
    }

    public static void main(String[] args) throws IOException {
        login();
    }
}
