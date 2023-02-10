package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		//Parent: Selenium Framework |   Practiceform
		//CHild: Selenium Framework | Selenium, Cucumber, Ruby, Java et al.
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//At this point there is only one window opened
		driver.get("http://www.seleniumframework.com/Practiceform/");
		String parentWindow = driver.getWindowHandle();
		String parentPageTitle = driver.getTitle();
		System.out.println("Parent Window ID "+parentWindow);
		System.out.println("Parent Page Title "+parentPageTitle);
		driver.findElement(By.id("button1")).click();
		
		//AT this point, there are 2 windows present
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		//hasNext(): informs wether there are more elements
		//next(): return the next element
		
		it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		String childPageTitle = driver.getTitle();
		System.out.println("Child Page Title "+childPageTitle);
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Page Title "+parentPageTitle);
		//driver.close(); //this will close the window pointed by the driver
		driver.quit();
		
		//closing and cehcking auto switch
		
	}
}
