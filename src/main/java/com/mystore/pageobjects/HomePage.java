package com.mystore.pageobjects;

import com.mystore.base.BaseClass;



public class HomePage extends BaseClass {
    public String getCurrURL() {
        String homePageURL = driver.getCurrentUrl();
        return homePageURL;
    }
}
