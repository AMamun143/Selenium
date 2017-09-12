/**
 * 
 */
package com.wordpress.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.loginPage.LoginPage;
import com.wordpress.loginPage.LoginPageNew;

import utility.BrowserFactory;

/**
 * @author Mamun
 *
 */
public class VarifyValidLoginNew {
	
	@Test
	public void checkValidUser() {
		
		WebDriver driver = BrowserFactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
		
		LoginPageNew login = PageFactory.initElements(driver, LoginPageNew.class);
		//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		login.login("admin", "demo123");
		login.clickSubmit();
		
		driver.quit();
		
	}

}
