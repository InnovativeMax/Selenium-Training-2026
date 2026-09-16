package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElementCssValue {
    public static void main(String[] args) {
        //Test Data
        String url = "https://automationexercise.com/?utm_source=chatgpt.com#google_vignette";
        String expectedOrangeColorCode = "rgba(254, 152, 15, 1)";
        String expectedGreyColorCode = "rgba(180, 177, 171, 1)";

        //Locator
        String xpath_FirstText = "(//span[text()='Automation'])[1]";
        String xpath_SecondText = "(//h1[text()='Exercise'])[1]";

        //Actual Selenium Code Starts Here
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        String actualOrangeColorCode = driver.findElement(By.xpath(xpath_FirstText)).getCssValue("color");
        String actualGreyColorCode = driver.findElement(By.xpath(xpath_SecondText)).getCssValue("color");

        if(actualOrangeColorCode.equals(expectedOrangeColorCode)){
            if(actualGreyColorCode.equals(expectedGreyColorCode)){
                System.out.println("Test Passed : Both Orange and Grey Text are displayed as expected. Actual Orange Value : "+actualOrangeColorCode+
                        " , Actual Grey Value : "+actualGreyColorCode);
            } else {
                System.out.println("Test Failed : Actual and expected Grey color is not matching. Actual Grey : "+actualGreyColorCode+
                        " , Expected Grey : "+expectedGreyColorCode);
            }
        } else {
            System.out.println("Test Failed : Actual and expected Orange color is not matching. Actual Orange : "+actualOrangeColorCode+
                    " , Expected Orange : "+expectedOrangeColorCode);
        }
        driver.quit();
    }
}
