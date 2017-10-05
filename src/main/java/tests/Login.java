package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import wrapper.GenericWrappers;

public class Login extends GenericWrappers{

	@Test
	public void loginLogout()   {
		
		// launch browser
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		
		//FileUtils.copyFile(new File(""), new File(""));
		
		//Enter the UserName
		enterById("username", "DemoSalesManager");
		
		//Enter the Password
		enterById("password", "crmsfa");

		//Click on Login Button
		clickByClassName("decorativeSubmit");
		
		//Click on LogOut Button
		clickByClassName("decorativeSubmit");
		
		// Close browser
		closeBrowser();
		
		
	
		
	}
}