package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		String tcName = "loginPage";
		String filePath = "./src/main/java/Screenshots/" + tcName + ".png";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(filePath));
		driver.close();

		//Screenshot scr = new Ashot().takescreenshot(driver);
		//Screenshot scr = new Ashot().shootingStrategy(?)
		
	}
}
