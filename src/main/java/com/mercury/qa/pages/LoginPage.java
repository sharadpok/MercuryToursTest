package com.mercury.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.qa.base.TestBase;

public class LoginPage extends TestBase
{
//Page Factory=Object Repository- Here we need to define all the web elements available on this page.
// As well as all the methods/functions or the actions needs to be perform based on this elements 
 @FindBy(name="userName")
 @CacheLookup
 private WebElement username;

public WebElement getUsername() {
	return username;
}

@FindBy(name="password")
WebElement password;

@FindBy(xpath="//input[@name='login']")
WebElement loginBtn;

@FindBy(xpath="//img[@src='/images/masts/mast_signon.gif']")
WebElement logo;

// Initializing the Page Objects
public LoginPage()
{
	PageFactory.initElements(driver, this);
}
//Actions:
public String validateLoginpagetitle()
{
return driver.getTitle();	
}

public boolean validateMercuryLogo()
{
	return logo.isDisplayed();
}
public FlightFinderPage login(String un, String psw)
{
	//username.sendKeys(un);	
	getUsername().sendKeys(un);
	password.sendKeys(psw);
	loginBtn.click();
	
	return new FlightFinderPage();
}
}
 
