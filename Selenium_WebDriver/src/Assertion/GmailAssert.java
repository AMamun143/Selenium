package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailAssert {
	
	@Test
	public void AssertGmail() {
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		System.out.println("Test started");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String pageTitle = driver.getTitle();
		String expectedTitle = "Gmail";
		
		//Assert Type 1
		Assert.assertEquals(expectedTitle, pageTitle);
		System.out.println("Page title is: "+pageTitle);
		
		String actualError = driver.findElement(By.cssSelector(".dEOOab.RxsGPe")).getText();
		System.out.println("Get Text result is: "+actualError);
		String actualError1 = driver.findElement(By.cssSelector(".dEOOab.RxsGPe")).getAttribute("innerHTML");
		System.out.println("Get Attribute result is: "+actualError1);
		
		//String expectedError = "Enter an email or phone";
		
		//Type Type 2
		Assert.assertTrue(actualError.contains("Enter an email"));
		System.out.println("Assert checking succesfull");
		
		System.out.println("Test completed");
		
		driver.quit();
		
		
	
	}

}
