package dropDowns;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDDList1 {
	
	@Test
	public void SelectDropDList() throws InterruptedException{
		
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement selectDayDD = driver.findElement(By.id("day"));
		
		Select dayDDValue = new Select(selectDayDD);
		
		dayDDValue.selectByIndex(19);
		Thread.sleep(5000);
		dayDDValue.selectByValue("19");
		Thread.sleep(5000);
		dayDDValue.selectByVisibleText("20");
		Thread.sleep(5000);
		driver.quit();
	}

}
