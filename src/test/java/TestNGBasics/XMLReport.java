package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XMLReport {
	
	@BeforeClass
	public void xmlrConfig() {
		System.out.println("Making XMLR as true");
	}

	@Test
	public void tc1() {
		System.out.println("TC1");
	}

	@Test
	public void tc2() {
		System.out.println("TC2");
	}

	@Test
	public void tc3() {
		System.out.println("TC3");
	}
	
	@AfterClass
	public void closeXMLRconfig() {
		System.out.println("Making XMLR as false");
	}
}
