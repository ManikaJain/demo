package com.nearbuy.qa.pages;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nearbuy.qa.base.Testbase;

public class SearchPage extends Testbase{
	
	@FindBy(xpath="//div//BUTTON[@class='btn btn--primary btn--small search-bar__btn'][text()='Search']")
	WebElement searchbutton;
	
	@FindBy(xpath ="(//INPUT[@autocomplete='off'])[1]")
	WebElement searchTextBox;
	
	@FindBy(xpath ="//BUTTON[@class='btn btn--primary'][text()='Search']")
	WebElement searchButtonOnSearchPage;
	
	@FindBy(xpath ="//H4[@class='font-weight-light padding-bottom-xs']")
	WebElement searchText;
	
	public void ClickInSearchButton() {
	
			PageFactory.initElements(driver,this);
			List<WebElement> linkedList = driver.findElements(By.tagName("a"));
			System.out.println(linkedList.size());
			
			for (int i =0; i<linkedList.size();i++) {
			
				
				System.out.println(linkedList.get(i));
			}
			
			
			//searchbutton.click();
			
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(src, new File("/Users/Manika/eclipse-workspace/nearbuy/src/element.png"));
			
	// //TD[text()='07-03-2019']/parent::tr//preceding-sibling::tr//TD[text()='07-04-2019']
	}
	
	public String EnterDataInSearchBox() {
		searchTextBox.sendKeys("KFC");
		searchButtonOnSearchPage.click();
		return searchText.getText();
	}
	
	

}
