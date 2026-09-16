package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class HandlingEbElementUsingGetTagname {
    public static void main(String[] args) {
        String url = "https://demoqa.com/";
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        String tagName = driver.findElement(By.xpath("//*[contains(@href,'elements')]")).getTagName();
        System.out.println(tagName);
        driver.quit();
    }
}
