package org.manikanti.swsolutions.Junit.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	
	// Locators of elements as properties in page class
	@FindBy(name="q")
	private WebElement searchbox;
	
	
	//constructor Method
	public GooglePage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Operational & observational Method
	public void fillSearchBoxAndClickEnter( String data) throws Exception
	{
		
		searchbox.clear();
		Thread.sleep(3000);
		searchbox.sendKeys(data, Keys.ENTER);
		Thread.sleep(3000);
	}
	
	public boolean verifyTitle( RemoteWebDriver driver, String expected)
	{
		if( driver.getTitle().contains(expected))
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
}
