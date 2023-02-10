package TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsDemo {

	@Test
	public void validateTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expTitle = "Facebook – log in or sign up India";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		boolean flag = driver.findElement(By.xpath("xpath")).isDisplayed();
		Assert.assertTrue(flag);
		Assert.assertFalse(flag);
		driver.quit();
	}
}
