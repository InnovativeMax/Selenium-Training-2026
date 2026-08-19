package com.selenium.topics.b_locators.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathIndependentDependent {

    public static void main(String[] args) throws InterruptedException {

        String button = "//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//button";
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // Login
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        Thread.sleep(3000);

        /*
         * Independent Element:
         * Sauce Labs Backpack
         *
         * Dependent Element:
         * Add to cart button belonging to Backpack
         */

        driver.findElement(By.xpath(button)).click();

        Thread.sleep(3000);

        driver.quit();
    }
}