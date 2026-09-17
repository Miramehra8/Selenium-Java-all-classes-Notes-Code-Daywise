package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip3_15 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url //this site not working
		driver.get("https://demoqa.com/tool-tips");

		// find webeElement age input box
		String actualText = driver.findElement(By.xpath("//button[@id='toolTipButton']")).getText();
		String expectedText = "Hover me to see";

		if (actualText.equals(expectedText)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}
