package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.navigate().to("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("input[onclick ='BX.addClass(this, 'wait');']"));
        //locating reset password button using class attribute and its value
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        //locating reset password button using VALUE attribute and its value
        String expectedResetButton = "Reset password";
        String actualResetButton = resetPasswordButton.getText();

        System.out.println("actualResetButton = " + actualResetButton);

        if (actualResetButton.equals(expectedResetButton)) {
            System.out.println("Button text verification PASSED!");
        } else {
            System.out.println("Button text verification FAILED!");

            // /html/body/table/tbody/tr[2]/td/div/div/form/div[4]/button
            //*[@id="login-popup"]/form/div[4]/button


        }
    }
}