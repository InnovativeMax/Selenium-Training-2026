package com.selenium.topics.f_javascriptexecutor.code;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class E2EOperationUsingJSE {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");

        String xpath_ElementHyperLink = "//a[contains(@href,'elements')]//div[@class='card-body']";
        String xpath_Textbox = "//span[text()='Text Box']";

        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();",driver.findElement(By.xpath(xpath_ElementHyperLink)));
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();",driver.findElement(By.xpath(xpath_Textbox)));
        Thread.sleep(3000);
        driver.quit();
    }
}
