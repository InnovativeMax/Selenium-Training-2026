package com.selenium.topics.c_webelements.code;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;

public class HandlingWebElementUsingGetRect {
    public static void main(String[] args) {
        //Test Data
        String url = "https://demoqa.com/";
        List<WebElement> cardsThatAreNotSame = new ArrayList<>();
        //Locator
        String xpath_AllCardsInFirstRow = "//div[@class='category-cards']/a[not(@href='/books')]/div";
        int expectedTopAllignment = 368;
        String expectedSize = "307 x 400";
        //Pre-Condition
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        //Actual Script
        List<WebElement> listOfCards = driver.findElements(By.xpath(xpath_AllCardsInFirstRow));
        for(WebElement card:listOfCards){
            //getRect will return Rectangle type object
            Rectangle rect = card.getRect();
            int widthOfCard = rect.getWidth();
            int heightOfCard = rect.getHeight();
            String actualSize = widthOfCard + " x " + heightOfCard;
            int actualTopAllignment = rect.getY();
            if((!expectedSize.equals(actualSize)) || expectedTopAllignment!=actualTopAllignment){
                cardsThatAreNotSame.add(card);
            }
        }
        if(cardsThatAreNotSame.size() == 0){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}
