package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BaseClass {

    @FindBy(xpath = "//a[@class ='login']")
    WebElement signInBtn;
    @FindBy (xpath = "//*[@id=\"header_logo\"]/a/img")
    WebElement myStoreLogo;

    @FindBy(id = "search_query_top")
    WebElement searchProductBox;

    @FindBy(name = "submit_search")
    WebElement submitButton;

    public IndexPage(){
        PageFactory.initElements(driver,this);
    }

    public LoginPage clickOnSignIn(){
        Action.click(driver,signInBtn);
        return new LoginPage();
    }

    public boolean validateLogo(){
        return Action.isDisplayed(driver,myStoreLogo);
    }

    public String getMystoreTitle(){
        String myStoreTitle = driver.getTitle();
        return myStoreTitle;
    }

}
