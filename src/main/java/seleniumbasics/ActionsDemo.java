package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

	// Action class , used to perform keyboard and mouse related events
	// with actions, always use perform

	public static void main(String[] args) {
		// hover();
		//keyboard();
		//scroll();
		dragDrop();
	}

	public static void hover() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement kidsmenu = driver.findElement(By.xpath("//a[text()='Kids']"));
		Actions act = new Actions(driver);
		act.moveToElement(kidsmenu).perform();
	}

	public static void keyboard() {
		String username = "admin";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement uname = driver.findElement(By.name("email"));
		Actions act = new Actions(driver);
		act.moveToElement(uname).click().keyDown(Keys.SHIFT).sendKeys(username).keyUp(Keys.SHIFT).perform();

	}
	
	public static void scroll() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		/*
		 * First parameter, scrolls left or right
		 * 	-ve: scroll left
		 * 	+ve: scroll right
		 * 
		 * Second parameter, scroll top or bottom
		 * 	-ve: scroll up
		 * 	+ve: scroll down
		 */
		//act.scrollByAmount(0, 600).perform();
		
		//scrolliing to a specific webelement
		WebElement target = driver.findElement(By.xpath("//span[text()='Up to 40% off | Great offers on Popular Smartphones']"));
		act.scrollToElement(target).perform();
		
		//act.contextClick().perform();
		act.contextClick(target).perform();
		
		
	}
	
	public static void dragDrop() {
		//https://jqueryui.com/droppable/
		//act.dragAndDrop(target, target)
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
	}
	
	

}
