package com.nearbuy.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.nearbuy.qa.util.TestUtil;

public class Testbase {
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/Manika/eclipse-workspace/nearbuy/"
					+ "src/main/java/com/nearbuy/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
			ChromeDriverService chromeservice = new ChromeDriverService.Builder().build();
			driver = new ChromeDriver();
		}
		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/gecko");
			driver = new FirefoxDriver();
		}
		
		try {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			Thread.sleep(500);
			System.out.println("Successful lgin");
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println();
		}
	}

}
