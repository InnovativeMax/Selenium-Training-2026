package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElementUsingClickMethod {
    public static void main(String[] args) throws InterruptedException {
        String username = "standard_user";
        String password = "secret_sauce";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        // Login
        driver.findElement(By.id("user-name")).sendKeys(username);
        System.out.println("Entered username : "+username);
        Thread.sleep(4000);
        driver.findElement(By.id("user-name")).clear();
        System.out.println("cleared username : "+username);
        Thread.sleep(4000);
        username = "error_user";
        driver.findElement(By.id("user-name")).sendKeys(username);
        Thread.sleep(4000);
        System.out.println("re-entered new username : "+username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
        System.out.println("entered password : "+password);
        driver.findElement(By.id("login-button")).click();
        System.out.println("Clicked login");
        Thread.sleep(2000);
        driver.quit();
    }
}
