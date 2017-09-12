package scrollPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {

		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		List<WebElement> links= driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		int totalCount = links.size();
		
		for (int i = 0; i < totalCount; i++) {
			WebElement element = links.get(i);
			String text = element.getAttribute("innerHTML");
			System.out.println("Links name is "+text);
			
		}

	}

}
