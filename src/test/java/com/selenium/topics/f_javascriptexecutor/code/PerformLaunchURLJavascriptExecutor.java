package com.selenium.topics.f_javascriptexecutor.code;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PerformLaunchURLJavascriptExecutor {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        //location is a parameter where main URL is stored
        //location = "https://www.saucedemo.com"
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.location='https://www.saucedemo.com/'");
        driver.quit();
    }
}
