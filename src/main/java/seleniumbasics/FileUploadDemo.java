package seleniumbasics;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://filebin.net/");
//		driver.findElement(By.id("fileField")).sendKeys("C:\\Users\\Lenovo\\eclipse-workspace\\RaftaarSeleniumTraining\\src\\main\\java\\seleniumbasics\\TSL - Course Content .pdf");

		driver.get("https://demo.automationtesting.in/FileUpload.html");
		WebElement target = driver.findElement(By.id("input-4"));
		Actions act = new Actions(driver);
		act.moveToElement(target).click().perform();
		//script to be executed
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\eclipse-workspace\\RaftaarSeleniumTraining\\src\\main\\java\\seleniumbasics\\FileHandling.exe");
		
		
	}
}
