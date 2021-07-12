package com.bridgelabz.selenium.object.repository.pages;

import com.bridgelabz.selenium.object.repository.base.BaseClass;
import com.bridgelabz.selenium.object.repository.utility.Library;
import com.bridgelabz.selenium.object.repository.utility.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login extends BaseClass{

    @FindBy (name = "email")
    WebElement input_email;

    @FindBy(name = "pass")
    WebElement input_pass;

    @FindBy(name = "login")
    WebElement login_btn;

    public Login(){
        PageFactory.initElements(driver,this);
    }

    public String login() {

        Log.info ("fetch the user name from config file");
        input_email.sendKeys(Library.getProperty(Library.CONFIG_PATH,"username"));

        Log.info ("fetch the user pass from config file");
        input_pass.sendKeys(Library.getProperty(Library.CONFIG_PATH,"password"));

        login_btn.click();
        return driver.getTitle();
    }
}
