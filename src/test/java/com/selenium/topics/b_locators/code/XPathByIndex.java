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

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        Thread.sleep(3000);

        // First product
        driver.findElement(
                By.xpath("(//div[@class='inventory_item'])[1]")
        ).click();

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(2000);

        // Second product
        driver.findElement(
                By.xpath("(//div[@class='inventory_item'])[2]")
        ).click();

        Thread.sleep(3000);

        driver.quit();
    }
}