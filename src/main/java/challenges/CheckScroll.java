package challenges;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckScroll {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// opening Firefox browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// load the browser with url
		driver.get("https://www.naukri.com/");
		
		int y =driver.findElementByLinkText("Browse All Jobs").getLocation().getY();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,"+y+")");

		//driver.findElementByLinkText("Browse All Jobs").click();

	}

}
