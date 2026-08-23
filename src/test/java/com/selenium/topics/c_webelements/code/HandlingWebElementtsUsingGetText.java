package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElementtsUsingGetText {
    public static void main(String[] args) throws InterruptedException {
        String username = "standard_user";
        String password = "secret_sauce";

        String actualValueFromProductList = "";
        String expectedValueFromCart = "";

        String xpath_AddToCart = "//div[text()='Sauce Labs Backpack']/ancestor::div/following-sibling::div[@class='pricebar']/descendant::button[text()='Add to cart']";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        // Login
        driver.findElement(By.id("user-name")).sendKeys(username);
        System.out.println("Entered username : "+username);
        Thread.sleep(4000);

        driver.findElement(By.id("password")).sendKeys(password);
        System.out.println("entered password : "+password);
        Thread.sleep(4000);

        driver.findElement(By.id("login-button")).click();
        System.out.println("Clicked login");
        Thread.sleep(4000);

        driver.findElement(By.xpath(xpath_AddToCart)).click();
        actualValueFromProductList = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
        System.out.println("Clicked on Add to cart for the product named " + actualValueFromProductList);
        Thread.sleep(4000);

        driver.findElement(By.className("shopping_cart_link")).click();
        System.out.println("Clicked on Cart Icon");
        Thread.sleep(4000);

        expectedValueFromCart = driver.findElement(By.className("inventory_item_name")).getText();
        Thread.sleep(4000);
        if(actualValueFromProductList.equals(expectedValueFromCart)){
            System.out.println("Test Passed : actual value " + actualValueFromProductList + " is same as expected value "+expectedValueFromCart);
        } else{
            System.out.println("Test Failed : actual value " + actualValueFromProductList + " is not same as expected value "+expectedValueFromCart);
        }
        driver.quit();
    }
}
