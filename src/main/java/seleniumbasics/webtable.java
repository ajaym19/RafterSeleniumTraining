package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {

	/*
	 * 
	 */
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		System.out.println(driver.findElements(By.tagName("table")).size());
		System.out.println(driver.findElements(By.tagName("tr")).size());
		System.out.println(driver.findElements(By.xpath("//tbody/tr[1]//td")).size());
		
		
		
		driver.quit();
	}
}
