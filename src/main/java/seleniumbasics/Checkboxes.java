package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
		/*
		 * isDisplayed
		 * isEnabled
		 * isSelected
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		System.out.println("First Checkbox");
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected());
		System.out.println("Second Checkbox");
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected());
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		System.out.println("CB 1 after selecting");
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected());
		
		
		
		driver.quit();
		
	}
}
