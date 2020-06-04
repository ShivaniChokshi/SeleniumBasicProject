package keywordDriverFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
static WebDriver driver;

	public static void openBrowser() {
		driver = new ChromeDriver();
	}
	
	public static void maxBrowser() {
		driver.manage().window().maximize();
	}
	
	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void navigateToAUT(String url) {
		driver.get(url);
	}
	public static void enterUserID(String locValue, String userID) { // Here locator value and user id changes, so passed in parameters
		driver.findElement(By.id(locValue)).sendKeys(userID); //Here instead of static values, we pass the above parameters as they change
	}
	
	public static void enterPassword(String locValue, String password) {
		driver.findElement(By.id(locValue)).sendKeys(password);
	}
	
	public static void clickButton(String loc, String locValue) {
		if(loc.equals("id")) {
		driver.findElement(By.id(locValue)).click();
		}
		else if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).click();
		}
	
	}
	
	public static String getErrorMessage(String locValue) {
		String text = driver.findElement(By.cssSelector(locValue)).getText();
		return text;
	}
	
	public static void closeApplication() {
		driver.close();
	}
}
 