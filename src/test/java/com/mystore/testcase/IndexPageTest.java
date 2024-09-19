package com.mystore.testcase;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IndexPageTest extends BaseClass {
    IndexPage indexPage;
    @BeforeMethod
    public void setup(){
        launchApp();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyLogo(){
        indexPage = new IndexPage();
        boolean result = indexPage.validateLogo();
        Assert.assertTrue(result);
    }
    @Test
    public void verifyTitle(){
        String ActualTitle = indexPage.getMystoreTitle();
        Assert.assertEquals(ActualTitle,"My Shop");
    }
}
