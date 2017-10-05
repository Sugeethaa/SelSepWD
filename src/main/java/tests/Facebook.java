package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import wrapper.GenericWrappers;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		GenericWrappers wr = new GenericWrappers();
		wr.invokeApp("chrome", "https://www.facebook.com/");
		
		//Enter the UserName
		wr.enterById("email", "babu");
		
		//Enter the Password
		wr.enterById("pass", "crmsfa");

		//Click on Login Button
		wr.clickByXpath("//input[@value='Log In']");
		
		// Close browser
		wr.closeBrowser();
		
		
	
		
	}
}