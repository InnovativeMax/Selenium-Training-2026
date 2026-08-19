package com.selenium.topics.b_locators.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByContains {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//input[contains(@id,'user')]")
        ).sendKeys("standard_user");

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//input[contains(@id,'pass')]")
        ).sendKeys("secret_sauce");

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//input[contains(@id,'login')]")
        ).click();

        Thread.sleep(3000);

        driver.findElement(
                By.xpath("//a[contains(text(),'Backpack')]")
        ).click();

        Thread.sleep(3000);

        driver.quit();
    }
}