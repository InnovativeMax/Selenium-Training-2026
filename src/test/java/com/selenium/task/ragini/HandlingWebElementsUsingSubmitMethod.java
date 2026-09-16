package com.selenium.task.ragini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElementsUsingSubmitMethod {


    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        String username = "standard_user";
        String password = "secret_sauce";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("user-name")).sendKeys(username);
        System.out.println("Entered username : "+username);
        Thread.sleep(4000);
        driver.findElement(By.id("password")).sendKeys(password);
        System.out.println("Entered password : "+password);
        Thread.sleep(4000);
        driver.findElement(By.id("login-button")).submit();
        System.out.println("Clicked on login");
        Thread.sleep(2000);
        driver.quit();



    }

}
