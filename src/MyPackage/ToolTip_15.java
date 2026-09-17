package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_15 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url //this site not working
		driver.get("https://testautomationpractice.blogspot.com/");

		// find webeElement age input box
		String actualTooltip = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
		String expectedTooltip = "We ask for your age only for statistical purposes.";

		if (actualTooltip.equals(expectedTooltip)) 
		{
			System.out.println("test passed");
		} else 
		{
			System.out.println("test failed");
		}
	}

}
