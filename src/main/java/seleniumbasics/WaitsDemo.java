package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {
	
	/*
	 * Waits
	 * also called as Synchronization
	 * 1. Implicit Wait: applicable to all the elements, no need to write again
	 * 2. Explicit Wait: is applicable to a specific element
	 */

	public static void main(String[] args) throws InterruptedException {
		//gmailLogin();
		explicitDemo();
		
	}
	
	public static void implicitWait() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//At this point there is only one window opened
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(10000);
		driver.findElement(By.id("ABCXYZ"));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public static void gmailLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1560552493%3A1673598274507699&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh76SaS2ectz8ZpyLcBm7JYciDvRJIdkhMF-HMY7Vjg0HKYc7-LD1YXe5ig8lz0JxXSKephwxA");
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("Passwd")).sendKeys("testPassword");
	}
	
	public static void explicitDemo() {
		//open URL http://www.seleniumframework.com/Practiceform/
		//Click on Timing Alert
		//Handle the alert box
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("timingAlert")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();	
	}
}
