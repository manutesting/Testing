package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfter {

	public class verifiesTitles {
		@BeforeMethod
		public void verifyTitles() {
			System.out.println("Login Successful");
		}
		/*@BeforeTest
		public void verifyTitles() {
			System.out.println("Login Successful");
		}*/
		@Test
		public void verify(){
			System.out.println("I am loggedIN");
		}
		@Test
		public void title() {
			System.out.println("I want to logout");
		}
		/*@AfterTest
		public void titles() {
			System.out.println("Logout Successful");
		}*/
		@AfterMethod
		public void titles() {
			System.out.println("Logout Successful");
		}
	}
}
