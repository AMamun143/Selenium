package webDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookChromeDriver {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("mamun0320@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("march320");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		
		driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		driver.findElement(By.xpath(".//*[@id='js_iu']/div/div/ul/li[14]/a/span/span")).click();
		driver.quit();
	}

}
