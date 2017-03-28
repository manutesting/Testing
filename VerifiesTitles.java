package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifiesTitles {

	public class verifiesTitles {
		@Test(dependsOnMethods= {"titles"})
		public void verifyTitles() {
			Assert.assertEquals("Gmail", "Gmail");
		}
		@Test(dependsOnMethods= {"verifyTitles"})
		public void verify(){
			Assert.assertEquals("Yahoo", "Yahoo");
		}
		@Test(dependsOnMethods= {"verify"})
		public void title() {
			Assert.assertEquals("Orkut", "Orkut");
		}
		@Test
		public void titles() {
			Assert.assertEquals("Twitter", "Twitter");
		}
	}

}
