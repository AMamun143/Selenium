package com.amazon.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.homePage.LoginPage;
import com.amazon.homePage.MainPage;
import com.amazon.homePage.Oders;
import com.amazon.homePage.TodaysDeals;
import Utility.LaunchBrowser;
import Utility.Screenshots;

/**
 * @author Mamun
 *This is Test Runner
 */
public class AmazonTests {
	
	@Test
	public void Amazon() {
		WebDriver driver = LaunchBrowser.startBrowser("firefox", "http://www.amazon.com");	
	
		//Main page 
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.selectDept("search-alias=baby-products");
		Screenshots.TakeScreenshots(driver, "mainpage");
		mainpage.getDeptDDList();
		
		mainpage.searchForItem("diaper");
		mainpage.clickEnter();
		Screenshots.TakeScreenshots(driver, "diaperSearchResults");
		
		//Today's deal page
		TodaysDeals deals = PageFactory.initElements(driver, TodaysDeals.class);
		deals.clickTodaysDealLink();
		deals.clickSeeMoreLink();
		Screenshots.TakeScreenshots(driver, "deals");
		
		//User Login
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.clickAccountLink();
		login.enterUserEmail("mamun0320@gmail.com");
		login.enterPassword("6488143m");
		Screenshots.TakeScreenshots(driver, "loginPage");
		login.clickSubmitButton();
		
		//Order Page
		Oders orders = PageFactory.initElements(driver, Oders.class);
		orders.clickAccountLink();
		orders.clickOrderButton();
		Screenshots.TakeScreenshots(driver, "orders");
		orders.clickOpenOrderLink();
		Screenshots.TakeScreenshots(driver, "openOrders");
		
	}

}
