package dropDowns;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class GetListOfMonths {
	
	@SuppressWarnings("deprecation")
	@Test
	public void GetListFromDD(){
		
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement selectMonthList = driver.findElement(By.id("month"));
		Select selectMonth = new Select(selectMonthList);
		
		List<WebElement> monthsList = selectMonth.getOptions();
		
		int numberOfMonths = monthsList.size();
		Assert.assertEquals(numberOfMonths, 13);
		
		System.out.println("Total number of months are: "+numberOfMonths);
		
		for(WebElement ele:monthsList){
			String monthName = ele.getText();
			System.out.println("Months are: "+monthName);
		}
		
		driver.quit();
		
	}

}
