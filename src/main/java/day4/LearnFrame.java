package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Go inside the frame
		// driver.switchTo().frame(0);	--- using index 
		// -> use only if you have one or 2 frames 
		WebElement frameElement = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameElement);
		// This is always second best option as it will work always correct
		// If the iframe has id or name -> this is most preferred option
		
		System.out.println(driver.findElementById("draggable").getText());
		
		// syntax to come out of frame
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Download").click();
		
		
		
		
		
		
	}
}