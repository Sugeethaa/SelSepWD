package tests;


import org.testng.annotations.Test;
import wrapper.GenericWrappers;

public class Login extends GenericWrappers{

	//@Test(invocationCount=2)
	//@Test(timeOut=5000)
	@Test(groups="sanity",dependsOnGroups="smoke")
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