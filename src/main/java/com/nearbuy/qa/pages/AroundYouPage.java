package com.nearbuy.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.nearbuy.qa.base.Testbase;

public class AroundYouPage extends Testbase {
	@FindBy(xpath="//A[@class='main_menu']")
	WebElement aroundYouTab;
	
	
	
	public void hoverOnAroundYoubutton() {
		
		Actions action = new Actions(driver);
		
		//action.moveToElement(aroundYouTab).perform();
		
		Alert alert =driver.switchTo().alert();
		
		
	}
	

}
