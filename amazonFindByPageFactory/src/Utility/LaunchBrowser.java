package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Mamun
 *This will launch user's preferred webdriver and navigate to url
 */
public class LaunchBrowser {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("WebDriver.ChromeDriver.driver", "/Users/Mamun/Desktop/driver");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("WebDriver.InternetExplorerDriver.driver", "/Users/Mamun/Desktop/driver");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}

}
