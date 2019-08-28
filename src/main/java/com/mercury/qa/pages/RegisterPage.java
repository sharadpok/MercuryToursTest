package com.mercury.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.qa.base.TestBase;

public class RegisterPage extends TestBase
{
//Page factory=Object repository
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement registerLink;
	
	@FindBy(xpath="//img[@src='/images/masts/mast_register.gif']")
	WebElement registerLogo;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
public RegisterPage clickOnRegisterLink()
{
	 registerLink.click();
	 return new RegisterPage();
}
public String registerPageTitle()
{
return driver.getTitle();	
}

public boolean registerPageLogo()
{
	return registerLogo.isDisplayed();
}
	
}

