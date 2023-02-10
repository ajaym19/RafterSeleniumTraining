package TestNGBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {

	@Test(dataProvider = "getExcelData")
	public void validateLogin(String uname, String pwd) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		driver.close();
	}
	
	@DataProvider
	public Object[][] getExcelData() {
		ExcelReaderDemo obj = new ExcelReaderDemo();
		return  obj.getData();
	
	}
	
	@DataProvider
	public Object[][] getData() {
		//first parameter is row: indicates how many times we want to execute the TC
		//second parameter is column: indicates how many values we want to use/send per iteration
		Object[][] data = new Object[3][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		data[1][0] = "hr";
		data[1][1] = "hr123";
		data[2][0] = "finance";
		data[2][1] = "finance123";
		return data;
	}
}
