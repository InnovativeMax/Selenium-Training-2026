package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWebElementIsSelected {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com";

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
}
