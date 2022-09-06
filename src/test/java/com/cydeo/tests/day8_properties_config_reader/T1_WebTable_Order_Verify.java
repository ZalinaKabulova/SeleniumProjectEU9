package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @Test
    public void order_name_verify_test() {


        //Locate the cell that has Bob Martin text in it
        WebElement bobsName = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        System.out.println("bobsName.getText() = " + bobsName.getText());
        //System.out.println("bobsName = " + bobsName);//  //table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        String expectedBobName = "Bob Martin";
        String actualBobName = bobsName.getText();

        Assert.assertEquals(actualBobName, expectedBobName);


        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        WebElement bobMartinsDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedBobDate = "12/31/2021";
        String actualBobDate = bobMartinsDate.getText();

        Assert.assertEquals(actualBobDate, expectedBobDate);
    }


    //We use the utility method we created.
    @Test
    public void test2() {

        String costumerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");

        String costumerOrderDate2 = WebTableUtils.returnOrderDate(driver, "John Doe");

        System.out.println("costumerOrderDate1 = " + costumerOrderDate1);
        System.out.println("costumerOrderDate2 = " + costumerOrderDate2);
    }

    //Using WebTableUtils.orderVerify(); method
    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver, "Bart Fisher", "01/16/2021");
    }

}