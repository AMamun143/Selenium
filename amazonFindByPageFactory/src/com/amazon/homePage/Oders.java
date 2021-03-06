package com.amazon.homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Mamun
 *
 */
public class Oders {
	
	WebDriver driver;
	
	public Oders (WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='nav-link-accountList']/span[2]")
	WebElement accountLink;
	
	@FindBy(how = How.CSS, using = ".a-box-inner")
	WebElement orderButton;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='orderTypeMenuContainer']/ul/li[3]/span/a")
	WebElement openOrderLink;
	
	public void clickAccountLink (){
		accountLink.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void clickOrderButton (){
		orderButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void clickOpenOrderLink (){
		openOrderLink.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void ScrollPageDown () {
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
