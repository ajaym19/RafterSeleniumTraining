package TestNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void dbConnection() {
		System.out.println("Connecting to Database");
	}

	@BeforeMethod
	public void browserConfig() {
		System.out.println("Browser Configuration");
		System.out.println("Launch the Browser");
		System.out.println("Open the application");
	}

	@Test
	public void validateLogin() {
		System.out.println("Validate Login Feature");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close the browser");
	}

	@Test
	public void validateTitle() {
		System.out.println("Validate Title of the Page");
	}
	
	@AfterSuite
	public void sendReport() {
		System.out.println("Sharing the summary reports");
		System.out.println("Closing Database Connection");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
}
