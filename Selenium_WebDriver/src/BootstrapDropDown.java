import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropDown {
	
	@Test
	public void FacebookLogfOut(){
		
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("mamun0320@gmail.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("march320");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#u_0_2")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#userNavigationLabel")).click();
		
		List<WebElement> DD_LogOutList = driver.findElements(By.xpath("//ul[@class='_54nf']//li/a"));
		
		for (WebElement ele:DD_LogOutList) {
			String innerhtml = ele.getAttribute("innerHTML");
			
			If (innerhtml.contentEquals("Log Out")){
				ele.click();
				break;
			}
			System.out.println("Values from dropdown is ===== "+innerhtml);
		}
		
		
	} 

}
