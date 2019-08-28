package com.mercury.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.qa.base.TestBase;
import com.mercury.qa.pages.FlightFinderPage;
import com.mercury.qa.pages.LoginPage;
import com.mercury.qa.pages.SelectFlightPage;

public class SelectFlightPageTest extends TestBase
{
	SelectFlightPage sf;
	LoginPage login;
	FlightFinderPage ff;
	
public SelectFlightPageTest()
{
super();	
}

@BeforeMethod()
public void setUp()
{
initialization();
sf=new SelectFlightPage();
ff=new FlightFinderPage();
login=new LoginPage();
ff=login.login(prop.getProperty("username"), prop.getProperty("password"));
sf=ff.clickContinue();
}
@Test(priority=1)
public void SelectFlightPageTitleTest()
{
	
	Assert.assertEquals(sf.validateSelectFlightPageTitle(),"Select a Flight: Mercury Tours","Select a flight page title does not match");
}
@Test(priority=2)
public void SelecetFlightPageImageTest()
{

Assert.assertTrue(sf.selectFlightImage(),"Select Flight Page image did not found");
}
@AfterMethod()
public void tearDown()
{
driver.quit();	
}
}
