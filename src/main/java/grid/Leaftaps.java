package grid;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Leaftaps {

	@Test
	public void login() throws InterruptedException, IOException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.1.39:4444/wd/hub"), dc);
		
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		
		// Set wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		//Maximize
		driver.manage().window().maximize();
						
		//Enter the UserName
		WebElement user = driver.findElementById("username");
		user.clear();
		user.sendKeys("DemoSalesManager");

		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		// Find the title
		String title = driver.getTitle();
		if(title.equals("Opentaps Open Source ERP + CRM")) {
			System.out.println("Title correct");
		}else {
			System.out.println("Title not correct");
		}
		
		////Click on LogOut Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dec = new File("./snap/leaftaps_firefox.png");
		FileUtils.copyFile(src, dec);

	}
}