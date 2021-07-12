package com.bridgelabz.object.repository.test;

import com.bridgelabz.selenium.object.repository.base.BaseClass;
import com.bridgelabz.selenium.object.repository.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ObjectRepositoryTest extends BaseClass{

    @Test
    public void loginTest()  {
        Login login = new Login();
        String actual_title = login.login();
        String expected_title = "Facebook";
        Assert.assertEquals(actual_title,expected_title);
        System.out.println("Welcome to Facebook");
    }
}

