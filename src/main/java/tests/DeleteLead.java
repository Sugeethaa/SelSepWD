package tests;

import org.testng.annotations.Test;

import wrapper.GenericWrappers;

public class DeleteLead extends GenericWrappers{

	// packagename.classname.methodname
	@Test(groups="regression")
	public void deleteLead()   {
		
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