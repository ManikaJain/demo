package com.nearbuy.qa.pages;

import com.nearbuy.qa.base.Testbase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterLoginHomePage extends Testbase  {
	
	@FindBy(xpath="//a[text()='My Account']")
	WebElement usernameLabel;
	
	@FindBy(xpath="//p[text()='Eat Out']")
	WebElement eatOutLabel;
	
	@FindBy(xpath="//p[text()='Spa']")
	WebElement spaLabel;
	
	public AfterLoginHomePage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public boolean verfifyUserLogin() {
		
		return usernameLabel.isDisplayed();
	}
	
	public EatOutPage clickOnEatOut() {
		eatOutLabel.click();
		return new EatOutPage();
	}
	
	public SpaPage clickOnSpa() {
		spaLabel.click();
		return new SpaPage();
	}
	
}
	


