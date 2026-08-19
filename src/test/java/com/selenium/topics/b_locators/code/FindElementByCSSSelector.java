package com.selenium.topics.b_locators.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCSSSelector {

    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.saucedemo.com/";

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // tag#id
        driver.findElement(By.cssSelector("input#user-name"))
                .sendKeys("standard_user");

        Thread.sleep(2000);

        // tag[attribute='value']
        driver.findElement(By.cssSelector("input[placeholder='Password']"))
                .sendKeys("secret_sauce");

        Thread.sleep(2000);

        // tag.class
        driver.findElement(By.cssSelector("input.btn_action"))
                .click();

        Thread.sleep(3000);

        driver.quit();
    }
}