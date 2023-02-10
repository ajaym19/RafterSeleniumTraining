package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {

	@Test
	public void validatLogin() {
		System.out.println("Validating Login");
	}
	
	@Test(dependsOnMethods = "validatLogin")
	public void homePage() {
		System.out.println("Validating HomePage");
	}
	
	@Test(dependsOnMethods = "validatLogin")
	public void sendFriendRequest() {
		System.out.println("Sending Friend Request");
		Assert.fail("Unable to send Friend Request");
	}
	
	@Test(dependsOnMethods = {"validatLogin","sendFriendRequest" })
	public void acceptFriendRequest() {
		System.out.println("Accepting Friend Request");
	}
}
