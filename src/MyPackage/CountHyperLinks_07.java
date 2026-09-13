package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks_07 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// open web page
		driver.get("https://www.calculator.net");

		// Total Links on wepage
		List<WebElement> Linkelements = driver.findElements(By.tagName("a"));
		System.out.println("Toal Links on wepage:" + Linkelements.size());

		// Text of all Links
		for (WebElement el : Linkelements) {
			System.out.println(el.getText());
		}

		// close browser
		driver.close();
	}

}
