import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynaminDDL {

	public static void main(String[] args) {
		System.setProperty("WebDriver.gecko.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement> radio = (List<WebElement>) driver.findElement(By.xpath("//input[@name='lang' and @type='radio']"));
		

		for (int i = 0; i<radio; i++) {
			
			WebElement local_radio = radio.get(i);
			String value = local_radio.getAttribute("value");
			
			System.out.println("Values from radio buttons are ========= "+value);
		}
	}

}
