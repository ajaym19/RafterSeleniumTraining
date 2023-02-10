package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0, 700)");

		// scrolling to specific element
		WebElement menu = driver.findElement(By.xpath("//span[text()='Up to 40% off | Daily essentials']"));
		// js.executeScript("arguments[0].scrollIntoView()", menu);

		// to the bottom
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

	}

}
