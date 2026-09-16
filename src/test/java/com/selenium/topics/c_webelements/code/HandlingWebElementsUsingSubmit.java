package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingWebElementsUsingSubmit {
    public static void main(String[] args) throws InterruptedException {
        String username = "standard_user";
        String password = "secret_sauce";
        String xpath_ProductsInHomepage = "//span[text()='Products']";

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        // Login
        driver.findElement(By.id("user-name")).sendKeys(username);
        Thread.sleep(2000);
        System.out.println("entered new username : "+username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
        System.out.println("entered password : "+password);
        driver.findElement(By.id("login-button")).submit();
        System.out.println("Clicked login");
        Thread.sleep(5000);
        //Validation
        driver.findElement(By.xpath(xpath_ProductsInHomepage)).isDisplayed();
        driver.quit();
    }
}
