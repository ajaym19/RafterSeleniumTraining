package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(3000);
		//there is an alert now
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(3000);
		driver.findElement(By.id("confirmexample")).click();
		//there is an alert
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Ajay Trainer");
		driver.switchTo().alert().accept();
		
		//at this point? there is no alert
		//driver.switchTo().alert().accept();
		//TC1: to comare the text displayed on the alert
		driver.findElement(By.id("alertexamples")).click();
		String actMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String expMsg = "I am an alert box!";
		if (actMsg.equals(expMsg)) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC Failed");
		}
		
		driver.close();
		
		// == and we use .equals
	}
}
