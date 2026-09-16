package com.selenium.topics.e_takesScreenshot.code;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class TakesWebElementScreenshot {
    public static void main(String[] args) throws IOException {
        String username = "standard_user";
        String password = "secret_sauce";

        //This will give us current date & time
        String timeStamp = LocalDateTime.now().toString().replace(':', '-');

        String xpath_SauceLabBackpack = "//img[@data-test='inventory-item-sauce-labs-backpack-img']";

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

        String projectPath = System.getProperty("user.dir");
        File destination = new File(
                projectPath + "\\src\\test\\resources\\screenshots\\TestWebElementScreenshot001-"+timeStamp+".png"
        );

        File sourceWebElement = driver.findElement(By.xpath(xpath_SauceLabBackpack)).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(sourceWebElement,destination);
        System.out.println("Copied File Successfully");
        driver.quit();

    }
}
