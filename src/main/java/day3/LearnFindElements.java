package day3;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class LearnFindElements {



	public static void main(String[] args) throws IOException {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");
		// maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> allElement = driver.findElementsByLinkText("Get-a-Quote");
		
		System.out.println(allElement.size());
		
		allElement.get(2).click();
		
		
		
		
		
		
		
		
	
	}

}
