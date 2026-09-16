package com.selenium.topics.e_takesScreenshot.code;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class TakesPageScreenshot {
    public static void main(String[] args) throws IOException {
        String username = "standard_user";
        String password = "secret_sauce";

        //This will give us current date & time
        String timeStamp = LocalDateTime.now().toString().replace(':', '-');

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        // Login
        driver.findElement(By.id("user-name")).sendKeys(username);
        System.out.println("entered new username : "+username);

        driver.findElement(By.id("password")).sendKeys(password);
        System.out.println("entered password : "+password);

        driver.findElement(By.id("login-button")).submit();
        System.out.println("Clicked login");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String projectPath = System.getProperty("user.dir");
        File destination = new File(
                projectPath + "\\src\\test\\resources\\screenshots\\TestScreenshot001-"+timeStamp+".png"
        );
        //File destination = new File("E:\\SKILLS 2026\\Selenium\\Selenium Training 2026\\src\\test\\resources\\screenshots\\TestScreenshot.png");

        FileUtils.copyFile(source,destination);
        System.out.println("Copied File Successfully");
        driver.quit();
    }
}
