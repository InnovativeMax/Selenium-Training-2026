package com.selenium.topics.b_locators.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByConditions {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//input[@id='user-name' and @placeholder='Username']")
        ).sendKeys("standard_user");

        Thread.sleep(2000);

        driver.quit();
    }
}