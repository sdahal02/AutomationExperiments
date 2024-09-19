package com.mystore.testcase;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    IndexPage indexPage;
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setup(){
        launchApp();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void loginTest() throws Throwable {
        indexPage= new IndexPage();
        loginPage=indexPage.clickOnSignIn();
        homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"),homePage);
        String actualURL=homePage.getCurrURL();
        String expectedURL="http://www.automationpractice.pl/index.php?controller=my-account";
        Assert.assertEquals(actualURL, expectedURL);
    }



}
