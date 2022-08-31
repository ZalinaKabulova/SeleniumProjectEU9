package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class fromMax {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //2. Go to https://https://www.flipkart.com/
        driver.get("https://www.flipkart.com/");

        WebElement skipLogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        skipLogin.click();

       WebElement electronicsButton = driver.findElement(By.xpath("(//div[.='Electronics'])[4]"));
        electronicsButton.click();

        WebElement audioButton = driver.findElement(By.xpath("//a[@class='_6WOcW9']"));
        audioButton.click();

        WebElement wiredHeadphonesBtn = driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe']"));
        wiredHeadphonesBtn.click();

    }
}
