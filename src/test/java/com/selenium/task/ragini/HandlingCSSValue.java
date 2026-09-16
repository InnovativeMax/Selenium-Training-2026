package com.selenium.task.ragini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCSSValue {

    public static void main(String[]args){

        //test data
        String url ="https://automationexercise.com/?utm_source=chatgpt.com#google_vignette";
        String expectedFontFamily = "Roboto";

        //Xpath
        String xpathFullFledged ="(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        String actualFontFamily = driver.findElement(By.xpath(xpathFullFledged)).getCssValue("font-family");

        if(actualFontFamily.contains(expectedFontFamily)){
            System.out.println("Test Passed : Both texts are displayed ");
        } else{
            System.out.println("Test Failed : expected and actual are not same. Actual Font Family : " +actualFontFamily+
                    " Expected Font Family : " +expectedFontFamily);
        }
        driver.quit();

    }
}
