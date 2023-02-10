package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingVideo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://smashballoon.com/how-to-embed-a-youtube-channel-on-your-website/");
		WebElement frame= driver.findElement(By.xpath("//iframe[@title = 'YouTube video player']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@title = 'Pause (k)']")).click();
	}
}
