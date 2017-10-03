package week2Day1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		driver.findElementByXPath("//*[@id='selectable']/li[3]").click();
		driver.switchTo().defaultContent();		
		driver.findElementByLinkText("Download").click();
	}
}
