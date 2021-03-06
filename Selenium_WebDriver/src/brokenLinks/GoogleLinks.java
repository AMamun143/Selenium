package brokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {
	
	public static void main (String[] args){
		System.setProperty("WebDriver.ChromeDriver.driver", "/Users/Mamun/Desktop/driver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: "+links.size());
		
		for (int i = 0; i < links.size(); i++) {
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			varifyLinkActive(url);
		}
	}

	private static void varifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
			httpURLConnection.setConnectTimeout(3000);
			httpURLConnection.connect();
			
			if (httpURLConnection.getResponseCode()==200){
				System.out.println(linkUrl+ " - "+httpURLConnection.getResponseMessage());
			}
			if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl+" - "+httpURLConnection.getResponseMessage() + " - " +HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
		}
	}

}

