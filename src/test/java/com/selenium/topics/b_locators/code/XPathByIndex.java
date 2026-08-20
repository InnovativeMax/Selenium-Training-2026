package com.selenium.topics.b_locators.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByIndex {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

        // First product
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();

        // Second product
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[last()]")).click();

        Thread.sleep(3000);

        driver.findElement(By.className("shopping_cart_link")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}