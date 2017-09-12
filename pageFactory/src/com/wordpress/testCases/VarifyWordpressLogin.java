/**
 * 
 */
package com.wordpress.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.loginPage.LoginPage;

/**
 * @author Mamun
 *
 */
public class VarifyWordpressLogin {
	
	@Test
	public void verifyValidLogin() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LoginPage login = new LoginPage(driver);
		login.typeUserName("admin");
		login.typePassword("demo123");
		login.clickLoginButton();
		
		driver.quit();
		
	}

}
