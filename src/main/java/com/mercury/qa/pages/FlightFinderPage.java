package com.mercury.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.qa.base.TestBase;

public class FlightFinderPage extends TestBase
{
  
  @FindBy(xpath="//input[@name='findFlights']")
  WebElement continuebtn;
  
  @FindBy(xpath="//img[@src='/images/masts/mast_flightfinder.gif']")
  WebElement flightImg;
  
  // Initializing the webElements
  
  public FlightFinderPage()
  {
	  PageFactory.initElements(driver, this);
  }
  
  public String validateFlightFinderPageTitle()
  {
	  
  return driver.getTitle();	
  }
  
  public boolean FlightFinderLogo()
    {
	  return  flightImg.isDisplayed();
	}
  public boolean validateContinueButton()
  {
	 return continuebtn.isDisplayed();
	  
  }
  public SelectFlightPage clickContinue()
  {
	  continuebtn.click();
	  return new SelectFlightPage();
	  
  }
}
