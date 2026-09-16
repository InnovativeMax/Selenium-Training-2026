package com.selenium.task.ragini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ChromDriverDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();//instance creation
        driver.get("https://accounts.google.com");//
        System.out.println(driver.getTitle());// Sign in - Google Accounts
        System.out.println("----------------------------------------------------");

        Thread.sleep(3000);//waits for 3s
        driver.findElement(By.id("identifierId")).sendKeys("raginim678@gmail.com");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//span[text()='Next']")).click();

        driver.quit();




    }
}
