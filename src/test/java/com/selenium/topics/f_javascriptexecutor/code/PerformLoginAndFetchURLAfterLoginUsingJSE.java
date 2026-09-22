package com.selenium.topics.f_javascriptexecutor.code;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PerformLoginAndFetchURLAfterLoginUsingJSE {
    public static void main(String[] args) throws InterruptedException {
        String username = "standard_user";
        String password = "secret_sauce";

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);

        //Elements
        WebElement usernameElement = driver.findElement(By.id("user-name"));
        WebElement passwordElement = driver.findElement(By.id("password"));
        WebElement loginButtonElement = driver.findElement(By.id("login-button"));

        //Parsing driver to JSE
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //entering value into TB using JSE
        jse.executeScript("arguments[0].value = 'standard_user'",usernameElement);
        jse.executeScript("arguments[0].value = 'secret_sauce'",passwordElement);

        //Clicking on an Element Using JSE
        jse.executeScript("arguments[0].click();",loginButtonElement);

        //Fetching URL using JSE, it works like getURL method
        String url= (String) jse.executeScript("return document.URL");
        System.out.println("Fetching URL after login : "+url);

        driver.quit();
    }
}
