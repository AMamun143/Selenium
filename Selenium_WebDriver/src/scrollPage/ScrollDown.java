package scrollPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollDown {
	
	@Test
	public void ScrollPageDown () {
		
		System.setProperty("WebDriver.ChromeDriver.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.jquaryui.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	}

}
