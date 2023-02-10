package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	/*
	 * Select Class
	 * 1. Index
	 * 2. Value
	 * 3. VisibleText
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		Thread.sleep(5000);
		WebElement country = driver.findElement(By.name("Country"));
		
		Select obj = new Select(country);
	//	obj.selectByIndex(2);
	//	obj.selectByValue("Argentina");
		obj.selectByVisibleText("Australia");
		
		List<WebElement> options =  country.findElements(By.tagName("option"));
		System.out.println(options.size());
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		
		
		
		driver.close();
		
	}
}
