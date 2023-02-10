package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tinymce");
       
        //how many iframes are present?
        List<WebElement> frames =  driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());
        
        /*
         * Switching to Frame
         * 1. Index
         * 2. IdorName
         * 3. WebElement
         */
        
        //driver.switchTo().frame(0);
        //driver.switchTo().frame("mce_0_ifr");
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(frame);
        
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Ajay");
        driver.switchTo().parentFrame();
        
	}
}
