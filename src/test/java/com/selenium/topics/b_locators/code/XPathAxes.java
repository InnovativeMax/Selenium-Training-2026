package com.selenium.topics.b_locators.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxes {

    public static void main(String[] args) throws InterruptedException {

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

        // ------------------------------------------------
        // 1. ANCESTOR
        // ------------------------------------------------

        driver.findElement(
                By.xpath(
                        "//div[text()='Sauce Labs Backpack']" +
                                "/ancestor::div[@class='inventory_item']"
                )
        );

        Thread.sleep(2000);

        // ------------------------------------------------
        // 2. PARENT
        // ------------------------------------------------

        driver.findElement(
                By.xpath(
                        "//div[text()='Sauce Labs Backpack']/parent::*"
                )
        );

        Thread.sleep(2000);

        // ------------------------------------------------
        // 3. CHILD
        // ------------------------------------------------

        driver.findElement(
                By.xpath(
                        "//div[@class='inventory_item']/child::div"
                )
        );

        Thread.sleep(2000);

        // ------------------------------------------------
        // 4. DESCENDANT
        // ------------------------------------------------

        driver.findElement(
                By.xpath(
                        "//div[@class='inventory_item']" +
                                "/descendant::button"
                )
        );

        Thread.sleep(2000);

        // ------------------------------------------------
        // 5. FOLLOWING-SIBLING
        // ------------------------------------------------

        driver.findElement(
                By.xpath(
                        "//div[text()='Sauce Labs Backpack']" +
                                "/following-sibling::div"
                )
        );

        Thread.sleep(2000);

        // ------------------------------------------------
        // 6. PRECEDING-SIBLING
        // ------------------------------------------------

        driver.findElement(
                By.xpath(
                        "//div[text()='Sauce Labs Backpack']" +
                                "/preceding-sibling::a"
                )
        );

        Thread.sleep(2000);

        driver.quit();
    }
}