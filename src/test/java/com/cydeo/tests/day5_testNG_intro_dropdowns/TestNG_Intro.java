package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {


    @BeforeClass
    public void tearDown(){
        System.out.println("----> BeforeClass is running");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("----> BeforeMethod is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("----> AfterMethod is running");
    }


    @Test (priority = 1)
    public void test1(){
        System.out.println("Test 1 is running");

        //ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);


    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Test 2 is running");
    }
}

/*
----> BeforeClass is running
----> BeforeMethod is running
Test 1 is running
----> AfterMethod is running
----> BeforeMethod is running
Test 2 is running
----> AfterMethod is running
 */
