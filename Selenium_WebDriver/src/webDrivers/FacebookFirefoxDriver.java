package webDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookFirefoxDriver {

	public static void main(String[] args) {
		//initiate firefox driver and navigate to facebook.com
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//Click on create a page link and navigate back to signup page
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		driver.navigate().back();
		
		//Input first name, last name and phone number in webedit
		driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("Abdullah");
		driver.findElement(By.xpath(".//*[@id='u_0_b']")).sendKeys("Mamun");
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("3476850094");
		
		//Select march from month dropdown list
		Select selectMonth = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		selectMonth.selectByVisibleText("Mar");
		
		//Select day
		Select selectDay = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		selectDay.selectByIndex(20);
		
		//Select year
		Select selectYear = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		selectYear.selectByValue("1984");
		
		//Select male radio button
		driver.findElement(By.xpath(".//*[@id='u_0_p']/span[2]")).click();
		
		//Click create account button
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).click();
		
		//Quit FireFox
		driver.quit();

	}

}
