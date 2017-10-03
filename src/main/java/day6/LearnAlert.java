package week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Syntax
		// ClassName obj= new ClassName();
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver d = new FirefoxDriver();
		
		// Load URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");

		// Implicit Wait

		/*
		 * Options opt = driver.manage();
		 * 
		 * Timeouts time = opt.timeouts();
		 * 
		 * time.implicitlyWait(30, TimeUnit.SECONDS);
		 */

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.findElements

		// driver.findElement

		// Maximize
		driver.manage().window().maximize();

		driver.findElementById("loginbuttoN1").click();
		Alert promptAlert = driver.switchTo().alert();
		String text = promptAlert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		promptAlert.accept();
		
		driver.findElementById("usernameId").sendKeys("Nesa");
		
		//promptAlert.setCredentials(credentials);
		
		
		
		
		
		
		
		
		
		
		

	}

}
