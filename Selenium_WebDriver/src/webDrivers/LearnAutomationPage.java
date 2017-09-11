package webDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnAutomationPage {

	public static void main(String[] args) {
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://learn-automation.com");
		System.out.println(driver.getTitle());

	}

}
