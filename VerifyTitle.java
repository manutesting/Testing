package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
@Test
public void verifyTitle(){
	System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.gmail.com");
	String pageTitle = driver.getTitle();
	Assert.assertEquals(pageTitle, "Gmail");
	driver.close();
}
}
