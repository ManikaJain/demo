package com.nearbuy.qa.testcases;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.nearbuy.qa.base.Testbase;
import com.nearbuy.qa.pages.AfterLoginHomePage;
import com.nearbuy.qa.pages.HomePage;
import com.nearbuy.qa.pages.LoginPage;


public class LoginPageTest extends Testbase{
	LoginPage loginPage;
	HomePage homePage;
	AfterLoginHomePage afterLoginHomePage;
	
	public LoginPageTest() {
		super();
		}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title =homePage.validateLoginPageTitle();
		Assert.assertEquals(title, "Discover, Experience & Save in New Delhi On Hotels, Food, Spas, Beauty, Health... Around You | nearbuy");
	}
	@Test(priority=2)
	public void loginPageLogoTest() {
		boolean flag =homePage.validateNearbuyLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=1)
	public void loginPageTest() {
		homePage.LogigInvoke();
		loginPage = new LoginPage();
		afterLoginHomePage =loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
