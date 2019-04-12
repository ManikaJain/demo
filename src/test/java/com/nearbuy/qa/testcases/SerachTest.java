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
import com.nearbuy.qa.pages.SearchPage;


public class SerachTest extends Testbase{
	SearchPage serachPage;
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		serachPage = new SearchPage();
		}
	
	@Test(priority=1)
	public void serachTest() {
		serachPage.ClickInSearchButton();
		//String result =serachPage.EnterDataInSearchBox();
		//System.out.println(result);
		//Assert.assertEquals(result, "Results for \"KFC\"");
	//
	}
	

}
