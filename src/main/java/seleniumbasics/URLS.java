package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URLS {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000); // this is not recommended
		// System.out.println(driver.getCurrentUrl());
		List<WebElement> urls = driver.findElements(By.tagName("input"));
		System.out.println(urls.size());
		for (WebElement url : urls) {
			System.out.println(url.getAttribute("name"));
		}

		driver.quit();
	}
}
