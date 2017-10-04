package day4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String window1 = driver.getWindowHandle(); // first
		System.out.println(window1);

		driver.findElementByLinkText("GUEST CHECK-IN").click();

		// title
		System.out.println(driver.getTitle());

		// URL
		System.out.println(driver.getCurrentUrl());

		// find out how many windows are available?
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());

		System.out.println("***************");
		for (String eachWindow : allWindows) {
			System.out.println(eachWindow);
			// lets move to window
			driver.switchTo().window(eachWindow);
		}


		// title
		System.out.println(driver.getTitle());

		// URL
		System.out.println(driver.getCurrentUrl());

		/*// close 
		driver.close();

		driver.switchTo().window(window1);

		// title
		System.out.println(driver.getTitle());

		// close 
		driver.close();*/
		
		// close both
		driver.quit();
		
	}
}