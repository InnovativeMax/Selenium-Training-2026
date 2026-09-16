package com.selenium.task.ragini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyProduct {
    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");//open url
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        String actualValueFromProductList = "";
        String  expectedValueFromCart = "";
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(4000);
        String  xPathaddToCart  ="//div[text()='Sauce Labs Bike Light']/ancestor::div[@class='inventory_item_label']/following-sibling::div[@class='pricebar']/descendant::button[text()='Add to cart']";
        driver.findElement(By.xpath(xPathaddToCart)).click();//click on the addtocart button
        Thread.sleep(2000);
        actualValueFromProductList = driver.findElement(By.xpath("//div[contains(@class,'inventory_item_name') and text()='Sauce Labs Bike Light']")).getText();
        driver.findElement(By.className("shopping_cart_link")).click();//click's on shopping cart icoThread.sleep(4000);
        expectedValueFromCart = driver.findElement(By.xpath("//div[contains(@class,'inventory_item_name')]")).getText();
        if(actualValueFromProductList.equals(expectedValueFromCart)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}
