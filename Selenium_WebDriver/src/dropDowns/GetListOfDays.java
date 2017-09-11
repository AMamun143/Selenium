package dropDowns;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetListOfDays {
	
	@Test
	public void GetListOfDaysFromDD(){
		
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement selectDaysFromList = driver.findElement(By.id("day"));
		Select selectDays = new Select(selectDaysFromList);
		
		List<WebElement> daysList = selectDays.getOptions();
		 int totalDays = daysList.size();
		 
		 Assert.assertEquals(totalDays, 32);
		 System.out.println("Number of days are: "+totalDays);
		 
		 for (WebElement ele:daysList){
			 String daysName = ele.getText();
			 System.out.println("Days are: "+daysName);
		 }
		 
		 driver.quit();
		
	}

}
