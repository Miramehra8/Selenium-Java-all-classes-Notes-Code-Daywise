package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImageLink_10 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open web page
		driver.get("https://www.opencart.com/index.php?route=cms/demo");

		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//verify title of the current page with expected home page title
		// title="OpenCart - Open Source Shopping Cart Solution"
		if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) 
		{
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}

		// browser close
		driver.close();
	}

}
