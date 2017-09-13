package Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	
	public static void TakeScreenshots(WebDriver driver, String screenShootName){
		
		try {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./ScreenShots/"+screenShootName+".png"));
			System.out.println("Screenshoot taken");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshots "+e.getMessage());
		}
	}

}
