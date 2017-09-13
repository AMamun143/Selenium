package com.amazon.homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Mamun
 *
 */
public class TodaysDeals {
	
	WebDriver driver;
	
	public TodaysDeals(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='nav-xshop']/a[2]")
	WebElement todaysDealLink;
	
	@FindBy(how = How.CSS, using = ".a-expander-prompt")
	WebElement seeMoreLink;
	
	@FindBy(how = How.CSS, using = ".a-checkbox.checkbox.a-spacing-micro>label>input")
	WebElement selectWine;
	
	public void clickTodaysDealLink (){
		todaysDealLink.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	} 
	
	public void clickSeeMoreLink (){
		seeMoreLink.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void FilterByWine (){
		selectWine.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
