package com.mercury.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.qa.base.TestBase;

public class SelectFlightPage extends TestBase

{

	@FindBy(xpath="//img[@src='/images/masts/mast_selectflight.gif']")
	WebElement SelFlightImg;
	
	public SelectFlightPage()
	{
		PageFactory.initElements(driver, this);
	}
	
    public String validateSelectFlightPageTitle()
    {
      return driver.getTitle();	
    }
    
    public boolean selectFlightImage()
    {
	return SelFlightImg.isDisplayed();
    }
}
