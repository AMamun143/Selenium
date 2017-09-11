package facebook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookRegister {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement beautyAmazonDD = driver.findElement(By.xpath(".//*[@id='searchDropdownBox']"));
		Select selectBeauty = new Select(beautyAmazonDD);
		
		WebElement defaultValue = selectBeauty.getFirstSelectedOption();
		System.out.println("Default selected value is: "+defaultValue.getText());
		
		selectBeauty.selectByVisibleText("Beauty & Personal Care");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement selectedValue = selectBeauty.getFirstSelectedOption();
		System.out.println("Selected value is: "+selectedValue.getText());
		//selectBeauty.selectByIndex(11);
		//Thread.sleep(5000);
		
		//selectBeauty.selectByValue("search-alias=fashion-womens");
		//Thread.sleep(5000);
		
		//selectBeauty.selectByVisibleText("Gift Cards");
		//Thread.sleep(10000);
		
		List<WebElement> listOfOptions = selectBeauty.getOptions();
		int numberOfItems = listOfOptions.size();
	
		//Assert.assertEquals(numberOfItems, 52);
		System.out.println(numberOfItems);
		
		for (WebElement ele:listOfOptions){
			String listItems = ele.getText();
			System.out.println("Options are: "+listItems);
		}
		
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("Lipsticks");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.quit();
		
	}

}
