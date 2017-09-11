package dropDowns;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDDList {
	
	@Test
	public void SelectDDValues() throws InterruptedException{
	
	System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	
	WebElement monthDD = driver.findElement(By.id("month"));
	
	Select monthDDList = new Select(monthDD);
	
	//Select from list
	monthDDList.selectByIndex(3);
	Thread.sleep(5000);
	
	monthDDList.selectByValue("10");
	Thread.sleep(5000);
	
	monthDDList.selectByVisibleText("Aug");
	
	}

}
