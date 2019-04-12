package com.nearbuy.qa.pages;
import com.nearbuy.qa.base.Testbase;

import org.eclipse.jetty.util.annotation.Name;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends Testbase {
	
	//Page Factory OR
	
	
	
	@FindBy(xpath="//input[@formcontrolname='emailOrphone']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-checkmark']")
	WebElement captacha;

	
	@FindBy(xpath="//div[@class='field-group form-group']")
	WebElement loginbutton;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	
	public AfterLoginHomePage login(String un, String pass) {
		try {
			username.sendKeys(un);
			password.sendKeys(pass);
			captacha.click();
			Thread.sleep(1000);
			loginbutton.click();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new AfterLoginHomePage();
		
	}
}
