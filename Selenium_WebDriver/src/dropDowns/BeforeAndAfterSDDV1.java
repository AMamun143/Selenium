package dropDowns;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BeforeAndAfterSDDV1 {
	@Test
	public void BeforeAndAfterSDV(){
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement selectDayFromL = driver.findElement(By.id("day"));
		Select selectDay = new Select(selectDayFromL);
		
		WebElement selectedValue = selectDay.getFirstSelectedOption();
		System.out.println("Default selected value is "+selectedValue.getText());
		
		selectDay.selectByIndex(5);
		WebElement selectedValue1 = selectDay.getFirstSelectedOption();
		System.out.println("Selected value is "+selectedValue1.getText());
		
		driver.quit();
		
	}

}