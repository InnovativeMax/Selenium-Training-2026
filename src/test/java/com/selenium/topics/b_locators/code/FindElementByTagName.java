package com.selenium.topics.b_locators.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByTagName {

    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.saucedemo.com/";

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        Thread.sleep(3000);

        List<WebElement> inputElements =
                driver.findElements(By.tagName("input"));

        System.out.println("Number of input elements: "
                + inputElements.size());

        for (WebElement element : inputElements) {
            System.out.println(
                    "Input type: " + element.getAttribute("type")
            );
        }

        Thread.sleep(3000);

        driver.quit();
    }
}