package TestNGBasics;

import org.testng.annotations.Test;

public class InvocationCountDemo {

	@Test(invocationCount = 3)
	public void tc1() {
		System.out.println("TC1");
	}
	
	@Test
	public void tc2() {
		System.out.println("TC2");
	}
	
	@Test(enabled = false)
	public void tc3() {
		System.out.println("TC3");
	}
}
