package dropDowns;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BeforeAndAfterSDDV2 {
	
	@Test
	public void BeforeAndAfterSelectedYear() throws InterruptedException{
		
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement selectYear = driver.findElement(By.id("year"));
		Select selectYearDDL = new Select(selectYear);
		
		WebElement selectedValue = selectYearDDL.getFirstSelectedOption();
		System.out.println("Default selected value is: "+selectedValue.getText());
		
		selectYearDDL.selectByIndex(10);
		Thread.sleep(3000);
		
		WebElement selectedValue1 = selectYearDDL.getFirstSelectedOption();
		System.out.println("Selected value is: "+selectedValue1.getText());
		
		driver.quit();
	}

}
