package TestNGBasics;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	//default order of execution is alphabetically

	@Test(priority = -1, groups = "smoke")
	public void z1() {
		System.out.println("Z1");
	}
	
	@Test(priority = -1)
	public void ac() {
		System.out.println("AC");
	}
	

	@Test(priority = -4)
	public void ab() {
		System.out.println("AB");
	}
	
	@Test(priority = -3)
	public void Apple() {
		System.out.println("Apple");
	}
	
	@Test
	public void tesla() {
		System.out.println("Tesla");
	}
	
	
}
