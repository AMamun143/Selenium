/**
 * 
 */
package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Mamun
 *
 */
public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url) {
		
		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("WebDriver.ChromeDriver.driver", "/Users/Mamun/Desktop/driver");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("WebDriver.InternetExplorerDriver.driver", "/Users/Mamun/Desktop/driver");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}

}
