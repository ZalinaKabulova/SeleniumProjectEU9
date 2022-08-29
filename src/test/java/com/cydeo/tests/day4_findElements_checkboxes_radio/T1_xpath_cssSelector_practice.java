package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        //XPATH and CSS Selector PRACTICES
       // DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.navigate().to("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        // Locate homelink using cssSelector syntax #1
        WebElement homelink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homelink using cssSelector syntax #2
        WebElement homelink2 = driver.findElement(By.cssSelector("a.nav-link"));

        //Locate homelink using cssSelector href value SYNTAX #1
        WebElement homelink3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        //Locate header using cssSelector: locate parent element and move down to h2
        WebElement header_1 = driver.findElement(By.cssSelector(" div[class='example']>h2"));

        //Locate header using xpath, and using web elements text "Forgot Password"
        //WebElement header_2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header_2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        //Locate inputBox using xpath contains method
        //tagName[contains(@attribute, 'value')]
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]"));

        //e. “Retrieve password” button
        //button[@type='submit']
        //button[@class='radius']
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.

        System.out.println("homelink1.isDisplayed() = "+homelink1.isDisplayed());
        System.out.println("header_1.isDisplayed() = "+header_1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = "+emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = "+inputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = "+retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = "+poweredByCydeoText.isDisplayed());

        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible


    }
}
