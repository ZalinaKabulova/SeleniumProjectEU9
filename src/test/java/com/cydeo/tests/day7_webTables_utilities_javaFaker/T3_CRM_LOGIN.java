package com.cydeo.tests.day7_webTables_utilities_javaFaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {



    //TC #3: Login scenario

    @Test
    public void crm_login_test() {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser


        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");


        //5. Click to `Log In` button
        WebElement logInBtn = driver.findElement(By.xpath("input[@value='Log In']"));
        logInBtn.click();

        //6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver, "Portal");
        //Expected: Porta

    }

    @Test
    public void crm_login_test2() {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver);

        //helpdesk1@cybertekschool.com  UserUser

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");


    }

    @Test
    public void crm_login_test3() {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver,"helpdesk2@cybertekschool.com","UserUser");

        //helpdesk1@cybertekschool.com  UserUser

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(driver,"Portal");


    }

}