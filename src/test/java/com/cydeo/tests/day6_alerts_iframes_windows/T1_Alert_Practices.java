package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    public WebDriver driver;

    //TC #1: Information alert practice


    @BeforeMethod
    public void setupMethod() {

        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }


    @Test
    public void alert_test1() {
        //3. Click to “Click for JS Alert” button
                                                                              // making it using text //button[.='Click for JS Alert']
        WebElement jsAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlertButton.click();

        //4. Click to OK button from the alert
        // To be able to click to Alert OK button we need to switch driver's focus to Alert itself
        Alert alert = driver.switchTo().alert();

        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

        //Failure message wil only be displayed if assertion fails: "Result text is NOT displayed."
        Assert.assertTrue(result.isDisplayed(),"Result text is NOT displayed.");

        //String expectedText = "You successfully clicked an alert";
        //String actualText = result.getText();

        //System.out.println(actualText);

        //Assert.assertEquals(actualText, expectedText);
    }


    @Test
    public void test_2(){

        //3. Click to “Click for JS Confirm” button
        WebElement confirmBtn = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        confirmBtn.click();

        //4. Click to OK button from the alert
        // To be able to click to Alert OK button we need to switch driver's focus to Alert itself

        Alert alert = driver.switchTo().alert();
        alert.accept();



        //5. Verify “You clicked: Ok” text is displayed

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(result.isDisplayed(),"Result text is NOT displayed.");

    }

    @Test
    public void test_3(){
        //3. Click to “Click for JS Prompt” button
        WebElement jsPromptBtn = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPromptBtn.click();

        //4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");
        //5. Click to OK button from the alert
        alert.accept();

        //6. Verify “You entered: hello” text is displayed
        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(result.isDisplayed(),"Result text is NOT displayed.");

    }




}
