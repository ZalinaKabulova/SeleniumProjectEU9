package com.cydeo.tests.day2_homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_3 {

    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.navigate().to(" https://google.com");
        driver.findElement(By.id("L2AGLb")).click();

        //3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.className("gb_d"));
        gmail.click();

        //4- Verify title contains:
        //Expected: Gmail
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        if (actualTitle.contains("Google")) {
            System.out.println("Title verification is PASSED!");
        } else {
            System.out.println("Title verification is FAILED!!!");
        }
        //5- Go back to Google by using the .back();
        driver.navigate().back();


        //6- Verify title equals:
        //Expected: Google
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Google";

        if (actualTitle1.equals(expectedTitle1)) {
            System.out.println("Title verification is PASSED!");
        } else {
            System.out.println("Title verification is FAILED!!!");
        }


        driver.close();


    }
}
