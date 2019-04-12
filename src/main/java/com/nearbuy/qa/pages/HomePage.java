package com.nearbuy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nearbuy.qa.base.Testbase;

public class HomePage extends Testbase {
	
	@FindBy(xpath="//a//div/span[text()='Login / Sign Up']")
	WebElement loginHomePage;
	
	@FindBy(xpath="//div//a//img[@class='header-logo']")
	WebElement nearbuylogo;
	
	
	public HomePage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateNearbuyLogo() {
		return nearbuylogo.isDisplayed();
		
	}
	
	public void LogigInvoke() {
		loginHomePage.click();
	}
}
