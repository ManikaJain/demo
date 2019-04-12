import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumGetCommands {
	
	WebDriver driver;
	
	public void invokeBrowser() {
		
		
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html/body/root/app/nb-header/header/div/div[2]/div/div[1]/div/div[1]/div")).sendKeys("kfc");
		driver.findElement(By.xpath("/html/body/root/app/nb-header/header/div/div[2]/div/div[1]/div/div[2]/button")).click();	
	}
	
	public void getCommands() {
		
		try {
			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			String titleOfPage = driver.getTitle();
			System.out.println("Title of the page is "+ titleOfPage);
			driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
			//driver.findElement(By.linkText("Today's Deals")).click();
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current url is "+currentUrl);
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			driver.close();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		
		seleniumGetCommands getClass = new seleniumGetCommands();
		
		getClass.invokeBrowser();
		getClass.getCommands();
		

	}

}
