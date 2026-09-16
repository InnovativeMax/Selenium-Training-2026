package com.selenium.topics.d_synchronization.code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class UsingImplicitWait {
    public static void main(String[] args) {
        String username = "standard_user";
        String password = "secret_sauce";
        String xpath_ProductsInHomepage = "//span[text()='Products']";

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        System.out.println("entered new username : "+username);
        driver.findElement(By.id("password")).sendKeys(password);
        System.out.println("entered new password : "+password);
        driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
        System.out.println("manipulted to clicked on Enter key in keyboard");
        driver.findElement(By.xpath(xpath_ProductsInHomepage)).isDisplayed();
        System.out.println("Products Title is Displayed on homepage");
        driver.quit();
    }
}
