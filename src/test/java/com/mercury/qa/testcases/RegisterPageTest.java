package com.mercury.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.qa.base.TestBase;
import com.mercury.qa.pages.LoginPage;
import com.mercury.qa.pages.RegisterPage;

public class RegisterPageTest extends TestBase
{
    RegisterPage rp;	
	public RegisterPageTest()
	{
      super();	
	}
	
	@BeforeMethod
	public void setUp()
	{
	initialization();
	rp=new RegisterPage();
	rp.clickOnRegisterLink();
	}
@Test(priority=1)
public void clickOnRegisterLinkTest()
{
	rp=rp.clickOnRegisterLink();	
}
@Test(priority=2)
public void validateRegisterPageTitle()
{
	String title=rp.registerPageTitle();
	Assert.assertEquals(title, "Register: Mercury Tours");
	
}
@Test(priority=3)
public void validateRegisterPageLogo()
{
boolean flag=rp.registerPageLogo();	
Assert.assertTrue(flag);
}
@AfterMethod()
public void  tearDown()
{
driver.quit();	
}
}
