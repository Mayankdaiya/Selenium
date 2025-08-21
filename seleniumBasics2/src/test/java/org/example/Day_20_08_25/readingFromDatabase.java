package org.example.Day_20_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;

public class readingFromDatabase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        String dbURL = "jdbc:mysql://localhost:3306/wiprodb2607";
        String username = "root";
        String password = "mayank@12910";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dbURL, username, password);
        Statement st = con.createStatement();
        String query1 = "SELECT * FROM Employees";
        ResultSet rs = st.executeQuery(query1);

        int loop = 3;
        while(loop>0 && rs.next()){
            String name = rs.getString("FirstName");
            String pass = rs.getString("LastName");

            WebDriver driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            Thread.sleep(3000);
            driver.findElement(By.name("username")).sendKeys(name);
            Thread.sleep(2000);

            // enter text in password field
            driver.findElement(By.xpath("//input[@name = 'password']"))
                    .sendKeys(pass);
            Thread.sleep(2000);
            // click login
            driver.findElement(By.xpath("//button[@type = 'submit']")).click();
            Thread.sleep(2000);
            loop--;
        }
    }
}
