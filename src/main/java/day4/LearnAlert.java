package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		//WebDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("loginbutton").click();
		
		//System.out.println(driver.getTitle());
		
		driver.getScreenshotAs(OutputType.FILE);
			
		// Move control to the alert
		Alert alt = driver.switchTo().alert();
		
		// Read the text
		String text = alt.getText();
		System.out.println(text);
		
		// action - accept
		alt.accept();
		
		
		
		
		
		
		
		
	}
}