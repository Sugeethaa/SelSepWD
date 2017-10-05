package wrapper;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrappers implements Wrappers{
	
	RemoteWebDriver driver;
	int i = 1;
	
	public void invokeApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("The browser "+browser+" launched successfully");
		takeSnap();

	}

	// Possible Exception 
	// NoSuchElementException 
	public void enterById(String idValue, String data) {
		try {
			WebElement eleId = driver.findElementById(idValue);
			eleId.clear();
			eleId.sendKeys(data);
			System.out.println("The text field with id "+idValue+" entered with data "+data+" successfully.");
		} catch (NoSuchElementException e) {
			System.err.println("The text field with id "+idValue+" could not be found.");
			throw new RuntimeException();
		} catch(WebDriverException e) {
			System.err.println("The browser could not be reached");
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub

	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub

	}

	public boolean verifyTitle(String title) {
		boolean bReturn = false;
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				System.out.println("The title "+actualTitle+" matches");
				bReturn = true;
			}else {
				System.err.println("The title "+actualTitle+" did not match with "+title);
			}
		} catch(WebDriverException e) {
			System.err.println("The browser could not be reached");
			throw new RuntimeException();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return bReturn;
	}

	public boolean verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	public void clickById(String id) {
		// TODO Auto-generated method stub

	}

	public void clickByClassName(String classVal) {
		driver.findElementByClassName(classVal).click();
		System.out.println("The button with class "+classVal+" is clicked");
		takeSnap();
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub

	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub

	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub

	}

	public void clickByXpath(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The button with xpath "+xpathVal+" is clicked");
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("The button with xpath "+xpathVal+" could not be found.");
			takeSnap();
			throw new RuntimeException();
		} catch(WebDriverException e) {
			System.err.println("The browser could not be reached");
			throw new RuntimeException();
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub

	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub

	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub

	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub

	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("The alert is accepted");
			takeSnap();
		} catch (NoAlertPresentException e) {
			System.err.println("The alert did not appear");
			takeSnap();
		} 

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./snaps/snap"+i+".jpg");
		i++;
		try {
			FileUtils.copyFile(src, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void closeBrowser() {
		driver.close();
		System.out.println("The browser is closed");
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}
