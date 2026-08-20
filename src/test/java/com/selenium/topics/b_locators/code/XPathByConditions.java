package com.selenium.topics.b_locators.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByConditions {

    public static void main(String[] args) throws InterruptedException {

        //launch the browser
        WebDriver driver = new ChromeDriver();

        //it is going to enter the URL and click GO
        driver.get("https://www.saucedemo.com/");

        //Maximize the browser
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //sendkeys enters standard_user in user name field
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //sendkeys enters secret_sauce in password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //clicks on login button
        driver.findElement(By.id("login-button")).click();

        //waits for 5 seconds
        Thread.sleep(5000);

        // First product
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();

        Thread.sleep(3000);

        // Second product
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[last()]")).click();

        Thread.sleep(3000);

        //clicks on cart icon
        driver.findElement(By.className("shopping_cart_link")).click();

        Thread.sleep(5000);

        //xpath by condition
        driver.findElement(
                By.xpath("//button[text()='Remove' and @id='remove-test.allthethings()-t-shirt-(red)']")
        ).click();

        Thread.sleep(2000);

        //terminate the entire session
        driver.quit();
    }
}