package com.bridgelabz.object.repository.test;

import com.bridgelabz.selenium.object.repository.base.BaseClass;
import com.bridgelabz.selenium.object.repository.pages.Login;
import com.bridgelabz.selenium.object.repository.utility.BrokenLink;
import com.bridgelabz.selenium.object.repository.utility.ToolTip;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginTest extends BaseClass{

    @Severity (SeverityLevel.CRITICAL)
    @Description("Login to application with valid credentials")
    @Story("Test login account ")
    @Test(priority = 1)
    public void loginTest()  {
        Login login = new Login();
        login.login ();

    }

    @Severity(SeverityLevel.MINOR)
    @Description("Verifying the list item title after hovering mouser using tooltip")
    @Story ("ToolTip test")
    @Test(priority = 2)
    public void toolTipVerify() throws  InterruptedException {

        Login login = new Login();
        login.login ();

        ToolTip toolTip = new ToolTip (driver);
        toolTip.toolTipVerifyTitle ();

//        String expectedTooltip= "null";
//        Assert.assertEquals(toolTip.toolTipVerifyTitle(),expectedTooltip);
    }

    @Severity(SeverityLevel.MINOR)
    @Description("Verifying the active link  after using broken link")
    @Story ("ToolTip test")
    @Test(priority = 3)
    public void broken_link() throws IOException {
        Login login = new Login();
        login.login ();

        BrokenLink brokenLink = new BrokenLink (driver);
        brokenLink.brokenLink ();
    }
}

