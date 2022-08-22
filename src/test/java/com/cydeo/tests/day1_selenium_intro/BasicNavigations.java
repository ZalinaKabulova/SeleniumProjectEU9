package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        //2-create instance of the selenium Webdriver
        // this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();


        //This line will maximize the browser size
        driver.manage().window().maximize();

       // driver.manage().window().fullscreen();

        //3- go to "http://www.tesla.com"
        driver.get("https://tesla.com");

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = "+ currentURL);

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to refresh
        driver.navigate().refresh();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        // use navigate().to():
        driver.navigate().to("https://www.google.com");

        // get the current title after getting the Google page
        currentTitle = driver.getTitle();

        //System.out.println("driver.getTitle() = "+ driver.getTitle());

        System.out.println("currentTitle = "+ currentTitle);

        //Get the current URL using Selenium
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = "+currentURL);

        // this will close the currently opened window
        driver.close();

        // this will close all of opened windows
        driver.quit();










    }
}