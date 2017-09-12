package com.wordpress.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Mamun
 *
 */
public class LoginPageNew {
	
	WebDriver driver;
	
	public LoginPageNew(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id ="user_login") 
	@CacheLookup
	WebElement username;
	
	@FindBy(how = How.ID, using = "user_pass") 
	@CacheLookup
	WebElement password;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='wp-submit']")
	@CacheLookup
	WebElement submit_button;
	
	@FindBy(how = How.LINK_TEXT, using = "Lost your password")
	@CacheLookup
	WebElement forgot_password;
	
	public void login(String userID, String userPass) {
		username.sendKeys(userID);
		password.sendKeys(userPass);
	}
	public void clickSubmit() {
		submit_button.click();
	}
	public void forgotPassword() {
		forgot_password.click();
	}

}
