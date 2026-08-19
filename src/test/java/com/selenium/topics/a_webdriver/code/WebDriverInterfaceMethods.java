package com.selenium.topics.a_webdriver.code;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.*;


public class WebDriverInterfaceMethods {
    public static void main(String[] args) throws InterruptedException {
        //Webdriver Interface non static methods
        //Initialize the WebDriver interface
        WebDriver driver = new ChromeDriver();

        //1. get() method: This method is used to open a specified URL in the browser.
        driver.get("https://elevenlabs.io/");

        //2. getTitle() method: This method is used to retrieve the title of the current page.
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);

        System.out.println("----------------------------------------------------");

        //3. getCurrentUrl() method: This method is used to retrieve the current URL of the page.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        System.out.println("----------------------------------------------------");

        //4. getPageSource() method: This method is used to retrieve the source code of the current page.
        String pageSource = driver.getPageSource();
        if(pageSource.contains("elevenlabs")) {
            System.out.println("Pass: Page source contains 'elevenlabs'");
        } else {
            System.out.println("Fail: Page source does not contain 'elevenlabs'");
        }

        System.out.println("----------------------------------------------------");

        //Hard wait for 3 seconds
        Thread.sleep(3000);

        //5. navigate() method: This method is used to navigate to a specified URL, go back, go forward, or refresh the page.
        Navigation nav = driver.navigate();

        //navigate to a new URL (same as get() method)
        nav.to("https://www.google.com/");
        String googleTitle = driver.getTitle();
        System.out.println("Title of the page: " + googleTitle);

        Thread.sleep(3000);

        //navigate back to the previous page
        nav.back();
        String backTitle = driver.getTitle();
        System.out.println("Title of the page after navigating back: " + backTitle);

        Thread.sleep(3000);

        //navigate forward to the next page
        nav.forward();
        String forwardTitle = driver.getTitle();
        System.out.println("Title of the page after navigating forward: " + forwardTitle);

        Thread.sleep(3000);

        //navigate refresh the current page
        nav.refresh();

        //6. manage() method: This method is used to manage the browser window, cookies, timeouts, etc.
        //Options: This is a nested interface within the WebDriver interface that provides methods to manage the browser window
        // and other browser-related settings like cookies, timeouts, etc.
        Options opt = driver.manage();
        Window win = opt.window();
        win.maximize(); //Maximize the browser window

        Thread.sleep(3000);

        win.minimize(); //Minimize the browser window

        Thread.sleep(3000);

        win.fullscreen(); //Make the browser window fullscreen

        Thread.sleep(3000);

        Dimension dimension = new Dimension(800, 600); //Set the browser window size to 800x600
        win.setSize(dimension);

        Thread.sleep(3000);

        Point point = new Point(500,500); //Set the browser window position to (100, 100)
        win.setPosition(point);

//		driver.manage().window().maximize(); //Maximize the browser window

        Thread.sleep(3000);

        //7. close() and quit() methods: These methods are used to close the browser window(s) opened by the WebDriver.

        //close() method: This method is used to close the current browser window.
        //driver.close();

        //quit() method: This method is used to close all browser windows opened by the WebDriver. And it also
        //terminates the WebDriver session.
        driver.quit();
    }
}
