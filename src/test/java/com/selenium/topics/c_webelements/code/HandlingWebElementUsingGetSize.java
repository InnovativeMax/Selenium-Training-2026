package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;

public class HandlingWebElementUsingGetSize {
    public static void main(String[] args) throws InterruptedException {
        //Test Data
        String url = "https://www.saucedemo.com/inventory.html";
        String username = "standard_user";
        String password = "secret_sauce";
        List<WebElement> imagesNotInExpectedSize = new ArrayList<>();

        //Locator
        String xpath_Images = "//img[@class='inventory_item_img']"; //common xpath

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        List<WebElement> images = driver.findElements(By.xpath(xpath_Images));
        String expectedSize = "159 x 239";
        for(WebElement img:images){
//            GetSize method will return Dimension type object
//            Dimension imgSize = img.getSize();
//            int imageHeight = imgSize.getHeight();
//            int imageWidth = imgSize.getWidth();
            int imageHeight = img.getSize().getHeight(); //method chaining
            int imageWidth = img.getSize().getWidth();
            String actualSize = imageWidth+" x "+imageHeight;

            if (!actualSize.equals(expectedSize)){
                imagesNotInExpectedSize.add(img);
            }
        }
        if(imagesNotInExpectedSize.size() == 0){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}
