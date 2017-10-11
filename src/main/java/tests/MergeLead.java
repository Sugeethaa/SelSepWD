package tests;

import org.testng.annotations.Test;

import wrapper.GenericWrappers;

public class MergeLead extends GenericWrappers{

	// packagename.classname.methodname
	@Test(groups="regression") //(dependsOnMethods= {"tests.Login.loginLogout"})
	public void mergeLead()   {
		
		// launch browser
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		
		//FileUtils.copyFile(new File(""), new File(""));
		
		//Enter the UserName
		enterById("username", "DemoSalesManager");
		
		//Enter the Password
		enterById("password", "crmsfa");

		//Click on Login Button
		clickByClassName("decorativeSubmit");
		
		closeBrowser();
		
	}
}