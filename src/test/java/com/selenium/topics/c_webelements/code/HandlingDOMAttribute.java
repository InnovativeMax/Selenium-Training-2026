package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDOMAttribute {

    public static void main(String[] args) throws InterruptedException {
        String url = "https://demo.nopcommerce.com/shoes";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        Thread.sleep(2000);
        WebElement searchBox =
                driver.findElement(By.id("small-searchterms"));

        System.out.println(
                "getAttribute: "
                        + searchBox.getAttribute("value")
        );

        System.out.println(
                "getDomAttribute: "
                        + searchBox.getDomAttribute("value")
        );

        System.out.println(
                "getDomProperty: "
                        + searchBox.getDomProperty("value")
        );
    }
}
