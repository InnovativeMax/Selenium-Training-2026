package com.selenium.topics.b_locators.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageValidationInPDP {

    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.saucedemo.com/";

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.name("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.name("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.name("login-button"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Sauce Labs Backpack"))
                .click();

        Thread.sleep(3000);

        boolean imageDisplayed =
                driver.findElement(By.tagName("img"))
                        .isDisplayed();

        System.out.println("Product image displayed: "
                + imageDisplayed);

        Thread.sleep(3000);

        driver.quit();
    }
}