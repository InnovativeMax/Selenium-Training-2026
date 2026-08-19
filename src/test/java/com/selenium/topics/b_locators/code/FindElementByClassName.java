package com.selenium.topics.b_locators.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByClassName {

    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.saucedemo.com/";

        String username = "user-name";
        String password = "password";
        String loginButton = "login-button";

        String backpackImageClass = "inventory_item_img";

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.id(username))
                .sendKeys("standard_user");

        Thread.sleep(2000);

        driver.findElement(By.id(password))
                .sendKeys("secret_sauce");

        Thread.sleep(2000);

        driver.findElement(By.id(loginButton))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.className(backpackImageClass))
                .click();

        Thread.sleep(3000);

        driver.quit();
    }
}