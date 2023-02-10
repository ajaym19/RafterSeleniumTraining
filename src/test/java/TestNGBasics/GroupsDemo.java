package TestNGBasics;

import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(groups = {"smoke", "web"})
	public void webLogin() {
		System.out.println("WebLogin");
	}

	@Test(groups = {"smoke", "mobile"})
	public void mobileLogin() {
		System.out.println("MobileLogin");
	}

	@Test(groups = "smoke")
	public void m1() {
		System.out.println("M1");
	}

	@Test(groups = "regression")
	public void m2() {
		System.out.println("M2");
	}

	@Test(groups = "regression")
	public void reports() {
		System.out.println("Reports");
	}
}
