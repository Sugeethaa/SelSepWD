package day1;


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



public class CreateLeads {



	public static void main(String[] args) throws IOException {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://www.leaftaps.com/opentaps");
		// maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		String txt = driver.findElementByXPath("//*[@id='login']/p[1]/label").getText();
		
		System.out.println(txt);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		//find WebElement and enter the value
		driver.findElementById("username").sendKeys("DemoSalesManager");
		System.out.println("The User Name Is Entered");		
		driver.findElementById("password").sendKeys("crmsfa");
		//find WebElement By ClassName and click
		driver.findElementByClassName("decorativeSubmit").click();
		//find WebElement ByLinkText and click
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		//find WebElement by id and enter the value
		driver.findElementById("createLeadForm_companyName").sendKeys("jai&Co");
		//driver.findElement(By.className(null));
		driver.findElementById("createLeadForm_firstName").sendKeys("jai");
		driver.findElementById("createLeadForm_lastName").sendKeys("kumar");		
		WebElement src = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown = new Select(src);		
	//	dropDown.selectByVisibleText("Public Relations");
		//dropDown.selectByValue("LEAD_WEBSITE");
		List<WebElement> allOptions = dropDown.getOptions();
		System.out.println(allOptions.size());		
		dropDown.selectByIndex(allOptions.size()-1);		
	
		for (WebElement eachOptions : allOptions) {
			
			System.out.println(eachOptions.getText());
			
			if (eachOptions.getText().contains("sarath")) {
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		File src1 = driver.getScreenshotAs(OutputType.FILE);		
		File desc = new File("./snaps/img1.png");		
		FileUtils.copyFile(src1, desc);
		
	
		
		
		
		
		
		
		
		//find WebElement by name and click
		//driver.findElementByName("submitButton").click();
		/*// verify webElement value by using equalsIgnoreCase method
		System.out.println(driver.findElementById("viewLead_firstName_sp").getText().trim().equalsIgnoreCase("jai"));
		//close browser
		driver.close();
*/
	}

}
