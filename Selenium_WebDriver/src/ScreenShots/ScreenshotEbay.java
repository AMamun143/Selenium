package ScreenShots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Library.Utility;

public class ScreenshotEbay {
	
	@Test
	public void EbayScreenshot(){
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Utility.TakeScreenshots(driver, "EbayMainPage");
		
		driver.findElement(By.xpath(".//*[@id='gh-ac']")).sendKeys("Laptops");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Utility.TakeScreenshots(driver, "EbaySearchItem");
		
		driver.findElement(By.xpath(".//*[@id='gh-btn']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Utility.TakeScreenshots(driver, "EbayResults");
		
		driver.quit();
	}

}
