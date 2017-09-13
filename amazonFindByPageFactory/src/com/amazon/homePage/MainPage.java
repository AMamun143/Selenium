package com.amazon.homePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Mamun
 *
 */
public class MainPage {
	WebDriver driver;
	
	public MainPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='searchDropdownBox']")
	WebElement dropDownList;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='twotabsearchtextbox']")
	WebElement itemSearchBox;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='nav-search']/form/div[2]/div/input")
	WebElement enterButton;
	
		public void selectDept(String deptNameByValue) {
			WebElement selectFromList = dropDownList;
			Select options = new Select(selectFromList);
			options.selectByValue(deptNameByValue);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	
		public void getDeptDDList() {
			WebElement selectFromList = dropDownList;
			Select options = new Select(selectFromList);
		
			List<WebElement> listOptions = options.getOptions();
			int numberOfOptions = listOptions.size();
			System.out.println("Total number of items: "+numberOfOptions);
		
			for (WebElement ele:listOptions) {
				String itemList = ele.getText();
				System.out.println("Options are: "+itemList);
			}	
		}
		
		public void searchForItem(String itemSearchingFor) {
			itemSearchBox.sendKeys(itemSearchingFor);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		
		public void clickEnter() {
			enterButton.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
			
	}

