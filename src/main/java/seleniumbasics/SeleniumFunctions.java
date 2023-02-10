package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFunctions {

	public static void main(String[] args) {
		//read the browser value from the user
		//based on that launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String expTitle = "Facebook – India";
		String actTitle = driver.getTitle();
		if (expTitle.equals(actTitle)) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC Failed");
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.quit();
	}
}
