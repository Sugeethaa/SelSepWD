package challenges;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.Synchronizer;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		// chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// load the browser with url
		driver.get("https://www.naukri.com/");
		System.out.println(driver.findElement(By.linkText("Browse All Jobs")).getLocation().getY());
		
		int y  = driver.findElement(By.linkText("Browse All Jobs")).getLocation().getY();
		
		// Way 1
		((JavascriptExecutor) driver).executeScript("scroll(0,"+y+");");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//synchronized (driver) {
			
		}
		
		/*// Way 2
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.PAGE_DOWN).build().perform();*/
		
		

		
		
		
		
		
		
		
		
		
		
		
		
//	}

}
