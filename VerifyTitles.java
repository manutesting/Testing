package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitles {
	@Test(priority = 3)
	public void verifyTitles() {
		Assert.assertEquals("Gmail", "Gmail");
	}
	@Test(priority = 1)
	public void verify(){
		Assert.assertEquals("Yahoo", "Yahoo");
	}
	@Test(priority = 4)
	public void title() {
		Assert.assertEquals("Orkut", "Orkut");
	}
	@Test(priority = 2)
	public void titles() {
		Assert.assertEquals("Twitter", "Twitter");
	}
}
