package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication {

	/*
	 * FB Login
	 * 1. Open the browser
	 * 2. Enter the URL
	 * 3. Enter username
	 * 4. Enter password
	 * 5. Click on Login button
	 * 6. Close
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		//Step0: configuring the browser driver
		WebDriverManager.chromedriver().setup();
		
		//Step1:
		WebDriver driver = new ChromeDriver();
		
		//Step2:
		driver.get("https://www.facebook.com/");
		
		//Step3:
		//whatever we see on the webpage is called as a webelement
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("TEstUsername");
		
		//Step 4:
		driver.findElement(By.id("pass")).sendKeys("TestPassword");
		
		//Step 5
		//driver.findElement(By.name("login")).click();
		
		//Step6:
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//driver.close();
		
	}
	
	
}
