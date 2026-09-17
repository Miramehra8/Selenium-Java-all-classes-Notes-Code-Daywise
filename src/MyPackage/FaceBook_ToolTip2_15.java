package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_ToolTip2_15 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.facebook.com/");

		// find webeElement age input box
		String actualText = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/reg/']")).getText();
		String expectedText  = "Sign up";

		if (actualText.equals(expectedText )) 
		{
			System.out.println("test passed");
		} else 
		{
			System.out.println("test failed");
		}

	}

}
