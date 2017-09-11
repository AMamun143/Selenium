package dropDowns;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDDList2 {
	
	@Test
	public void SelectYearDDList() throws InterruptedException{
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement selectYearDD = driver.findElement(By.id("year"));
		Select selectDDYear = new Select(selectYearDD);
		
		selectDDYear.selectByIndex(10);
		Thread.sleep(5000);
		
		selectDDYear.selectByValue("2003");
		Thread.sleep(5000);
		
		selectDDYear.selectByVisibleText("1996");
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
