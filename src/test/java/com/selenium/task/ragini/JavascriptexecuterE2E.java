package com.selenium.task.ragini;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavascriptexecuterE2E {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();//instance will be create chrome driver will launch
        JavascriptExecutor jse = (JavascriptExecutor) driver; //typecasting webdriver --- JSE
        driver.manage().window().maximize(); // max,
        driver.get("https://demoqa.com/");// go to url

        String xpath_ElementHyperLink = "//a[contains(@href,'elements')]//div[@class='card-body']";//
        String xpath_Textbox = "//span[text()='Text Box']";
        String xpath_FullName = "//input[@id='userName']";
        String xpath_Email = "//input[@id='userEmail']";
        String xpath_CurrentAdd ="//textarea[@id='currentAddress']";
        String xpath_PermanentAdd ="//textarea[@id='permanentAddress']";
        String xpath_Submit = "//button[@id='submit']";
        String validation_Xpath_Fullname ="//*[@id='name' or contains(text(),'Ragini')]";
        String validation_Xpath_Email="//*[@id='email' or contains(text(),'rani789@gmail.com')]";


        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();",driver.findElement(By.xpath(xpath_ElementHyperLink)));
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();",driver.findElement(By.xpath(xpath_Textbox)));
        Thread.sleep(3000);
        jse.executeScript("arguments[0].value='Ragini';",driver.findElement(By.xpath(xpath_FullName)));
        Thread.sleep(3000);
        jse.executeScript("arguments[0].value='rani789@gmail.com';",driver.findElement(By.xpath(xpath_Email)));
        Thread.sleep(3000);
        jse.executeScript("arguments[0].value='30,67th main,Hyd-560042';",driver.findElement(By.xpath(xpath_CurrentAdd)));
        Thread.sleep(3000);
        jse.executeScript("arguments[0].value='Tamilnadu 560002';",driver.findElement(By.xpath(xpath_PermanentAdd)));
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();",driver.findElement(By.xpath(xpath_Submit)));
        Thread.sleep(3000);
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(3000);
        driver.findElement(By.xpath(validation_Xpath_Fullname)).isDisplayed();
        driver.findElement(By.xpath(validation_Xpath_Email)).isDisplayed();
        Thread.sleep(3000);
        jse.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
        Thread.sleep(3000);
        driver.quit();


    }
}
