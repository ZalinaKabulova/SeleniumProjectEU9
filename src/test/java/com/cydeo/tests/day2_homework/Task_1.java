package com.cydeo.tests.day2_homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {

    public static void main(String[] args) {

        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.navigate().to("https://www.etsy.com");

        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/div[2]/div[2]/button")).click();

        //3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);


        //4. Verify title:
       // Expected: “Wooden spoon - Etsy
        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon - Etsy";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!");
        }else{
            System.out.println("Title verification is FAILED!!!");
        }

        driver.close();




    }
}
