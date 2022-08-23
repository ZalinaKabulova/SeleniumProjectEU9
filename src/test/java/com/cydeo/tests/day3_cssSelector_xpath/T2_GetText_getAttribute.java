package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_GetText_getAttribute {


    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/
        driver.navigate().to("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedLabel = "Remember me on this computer";
        String actualLabel = rememberMeLabel.getText();

        if (expectedLabel.equals(actualLabel)) {
            System.out.println("Remember me Label verification is PASSED!");
        }else {
            System.out.println("Remember me Label verification is FAILED!!!");
        }
        
        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedPasswordLink = "Forgot your password?";
        String actualPasswordLink = forgotPasswordLink.getText();

        if (expectedPasswordLink.equals(actualPasswordLink)) {
            System.out.println("Forgot password link text verification is PASSED!");
        }else {
            System.out.println("actualPasswordLink = "+actualPasswordLink);
            System.out.println("expectedPasswordLink = "+expectedPasswordLink);
            System.out.println("Forgot password link text verification is FAILED!!!");
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");

        System.out.println("actualHrefAttributeValue = "+actualHrefAttributeValue);

        if (actualHrefAttributeValue.contains(expectedInHref)) {
            System.out.println("Href attribute value verification is PASSED!");
        }else {

            System.out.println("Href attribute value verification is FAILED!!!");
        }


        //PS: Inspect and decide which locator you should be using to locate web
        //elements


    }
}
