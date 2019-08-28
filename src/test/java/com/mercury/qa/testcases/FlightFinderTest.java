package com.mercury.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.qa.base.TestBase;
import com.mercury.qa.pages.FlightFinderPage;
import com.mercury.qa.pages.LoginPage;
import com.mercury.qa.pages.SelectFlightPage;

public class FlightFinderTest extends TestBase
{
	LoginPage loginPage;
	FlightFinderPage ff;
	SelectFlightPage sf;
public FlightFinderTest()
{
super();	
}
@BeforeMethod
public void setUp() 
{
ff=new FlightFinderPage();
sf=new SelectFlightPage();
initialization();
loginPage =new LoginPage();
ff=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

}
@Test(priority=1)
public void FlightFinderPageTitleTest()
{
Assert.assertEquals(ff.validateFlightFinderPageTitle(),"Find a Flight: Mercury Tours:","Flight finder title is not matched");
}
@Test(priority=2)
public void validateFlightFinderLogoTest()
{

Assert.assertTrue(ff.FlightFinderLogo(),"Flight Finder logo is not displayed");
}


@Test(priority=3)
public void validateContinueButtonTest()
{
Assert.assertTrue(ff.validateContinueButton(), "Continue button is not available");
}


@Test(priority=4)
public void clickContinueButtonTest()
{
sf=ff.clickContinue();	
}

@AfterMethod()
public void tearDown()
{
driver.quit();	
}
}
