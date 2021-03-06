package dropDowns;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetListOfYears {
	
	@Test
	public void GetYearsFromList(){
		
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement selectYearsFromDD = driver.findElement(By.id("year"));
		Select selectYears = new Select(selectYearsFromDD);
		
		List<WebElement> listOfYears = selectYears.getOptions();
		int totalYears = listOfYears.size();
		
		Assert.assertEquals(totalYears, 114);
		System.out.println("Number of Years: "+totalYears);
		
		for (WebElement ele:listOfYears){
			String yearNumber = ele.getText();
			System.out.println("Year number: "+yearNumber);
		}
		
		driver.quit();
	}

}
