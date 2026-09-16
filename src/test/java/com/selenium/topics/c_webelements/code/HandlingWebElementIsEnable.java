package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElementIsEnable {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://demoqa.com/dynamic-properties";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        boolean isButtonEnabledBefore5Seconds = driver.findElement(By.xpath("//button[text()='Will enable 5 seconds']")).isEnabled(); //false
        Thread.sleep(7000);
        boolean isButtonEnabledAfter5Seconds = driver.findElement(By.xpath("//button[text()='Will enable 5 seconds']")).isEnabled(); //true

        if(!isButtonEnabledBefore5Seconds){
            if (isButtonEnabledAfter5Seconds){
                System.out.println("Test Passed");
            } else {
                System.out.println("Test Failed: Button is still disabled even after 7 seconds");
            }
        } else {
            System.out.println("Test Failed: Button is enabled before 5 seconds or by default");
        }
        driver.quit();
    }
}
