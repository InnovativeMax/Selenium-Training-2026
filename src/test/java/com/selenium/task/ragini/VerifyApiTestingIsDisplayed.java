package com.selenium.task.ragini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyApiTestingIsDisplayed {

    public static void main(String[]args) throws InterruptedException {
        String url = "https://automationexercise.com/login";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(5000);

        boolean  apiTesting = driver.findElement(By.xpath("//a[text()=' API Testing']")).isDisplayed();
        if(apiTesting){
            System.out.println("Test Passed");
        } else{
            System.out.println("Test Failed");
        }
        driver.quit();


    }
}
