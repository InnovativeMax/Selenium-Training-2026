package com.selenium.task.ragini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingCheckBox {
    public static void main(String[]args){
        String url = "https://the-internet.herokuapp.com/checkboxes";
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        boolean isCheckedBoxIsSelected = driver.findElement(By.xpath("")).isSelected();
        boolean isCheckedBoxIsnotSelected = driver.findElement(By.xpath("")).isSelected();
        



    }


}
