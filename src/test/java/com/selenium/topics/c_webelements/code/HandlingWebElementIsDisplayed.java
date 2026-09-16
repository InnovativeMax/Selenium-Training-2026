package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElementIsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        //Test Data
        String url = "https://automationexercise.com/login";
        String username = "TestAutomation@example.com";
        String password = "Test@123";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(5000);
        boolean flag = driver.findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect!')]")).isDisplayed();

        if(flag){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed : Error not displayed");
        }
        driver.quit();
    }
}
