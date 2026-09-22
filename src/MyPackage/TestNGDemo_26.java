package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;

public class TestNGDemo_26 {

	@Test
	public void verifyPageTitle() 
	{
		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open web page
		driver.get("https://www.google.com/");

		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
	}
}
