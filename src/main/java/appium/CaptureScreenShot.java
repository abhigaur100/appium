package appium;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CaptureScreenShot {
	
public static AndroidDriver driver;
	
	public static void main(String[] args) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Moto g5 s+");
		capabilities.setCapability("udid", "ZY3229JL4T");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", ".HomeScreenActivity");
		
		
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("abhilash.gaur@gmail.com");
			
	 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	// C:\neonEclipse\appium\src\main\resources
	 
	 try {
		FileUtils.copyFile(srcFile, new File("C:\\neonEclipse\\appium\\src\\main\\resources\\test.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	 

			
			
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
