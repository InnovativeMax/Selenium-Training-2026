package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElementUsingGetAttributeMethod {
    public static void main(String[] args) throws InterruptedException {
        String username = "standard_user";
        String password = "secret_sauce";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(4000);

        WebElement usernameElement =  driver.findElement(By.id("user-name"));
        String attributeOne = usernameElement.getAttribute("placeholder");
        System.out.println(attributeOne);

        String attributeTwo = usernameElement.getAttribute("data-test");
        System.out.println(attributeTwo);

        String attributeThree = usernameElement.getAttribute("autocorrect");
        System.out.println(attributeThree);

        Thread.sleep(4000);
        driver.quit();
    }
}
