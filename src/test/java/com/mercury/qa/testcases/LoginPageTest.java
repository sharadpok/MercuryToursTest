package com.mercury.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.qa.base.TestBase;
import com.mercury.qa.pages.FlightFinderPage;
import com.mercury.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginPage;
	FlightFinderPage ff;
   public LoginPageTest()
    {
     super();	 
    }
@BeforeMethod
public void setUp()
{
initialization();
loginPage=new LoginPage();

}


@Test(priority=1)
public void loginPageTitleTest()
{
	String title=loginPage.validateLoginpagetitle();
	Assert.assertEquals(title, "Sign-on: Mercury Tours");
}



@Test(priority=2)
public void loginPageMercuryLogoTest()
{
boolean flag=loginPage.validateMercuryLogo();
Assert.assertTrue(flag);
}


@Test(priority=3)
public void loginTest()
{
ff=loginPage.login(prop.getProperty("username"), prop.getProperty("password"))	;
}
@AfterMethod
public void tearDown()
{
driver.quit();	
}
}

