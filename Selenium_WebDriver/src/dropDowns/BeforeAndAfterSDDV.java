package dropDowns;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BeforeAndAfterSDDV {

	@Test
	public void BeforeAndAfterSelectedV(){
		
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement monthDDList = driver.findElement(By.id("month"));
		Select monthFromDDList = new Select(monthDDList);
		
		WebElement selectedValue = monthFromDDList.getFirstSelectedOption();
		System.out.println("Default selected value is "+selectedValue.getText());
		
		monthFromDDList.selectByIndex(5);
		WebElement selectedValue1 = monthFromDDList.getFirstSelectedOption();
		System.out.println("Selected value is "+selectedValue1.getText());
		
		driver.quit();
	}
}
