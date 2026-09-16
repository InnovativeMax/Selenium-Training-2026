package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;

public class HandlingWebElementUsingGetLocation {
    public static void main(String[] args) {
        //Test Data
        String url = "https://demoqa.com/";
        List<WebElement> cardsThatAreNotAlligned = new ArrayList<>();
        //Locator
        String xpath_AllCardsInFirstRow = "//div[@class='category-cards']/a[not(@href='/books')]/div";
        int expectedTopAllignment = 368;
        //Pre-Condition
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        //Actual Script
        List<WebElement> listOfCards = driver.findElements(By.xpath(xpath_AllCardsInFirstRow));
        for(WebElement card:listOfCards){
//            getLocation() method will return Point type Object
//            Point point = card.getLocation();
//            int yAxis = point.getY();
//            System.out.println(yAxis);
            int actualTopAllignment = card.getLocation().getY();
            //368 != 368 - false
            if(expectedTopAllignment != actualTopAllignment){
                cardsThatAreNotAlligned.add(card);
            }
        }
        if(cardsThatAreNotAlligned.size() == 0){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}
