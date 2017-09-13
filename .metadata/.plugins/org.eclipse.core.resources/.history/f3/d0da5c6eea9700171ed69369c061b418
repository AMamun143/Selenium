/**
 * 
 */
package com.wordpress.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Mamun
 *
 */
public class LoginPage {
	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.xpath(".//*[@id='user_pass']");
	By loginButon = By.name("wp-submit");
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	public void typeUserName(String userID) {
		driver.findElement(username).sendKeys(userID);
	}
	public void typePassword(String userPass) {
		driver.findElement(password).sendKeys(userPass);
	}
	public void clickLoginButton() {
		driver.findElement(loginButon).click();
	}
}
