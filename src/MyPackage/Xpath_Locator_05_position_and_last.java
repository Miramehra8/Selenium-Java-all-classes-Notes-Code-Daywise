package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator_05_position_and_last {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// open web page
		driver.get("http://www.only-testing-blog.blogspot.com");

		// XPath using position()
		// tag-name[@attribute-type='attribute-value'][position()=value]
		// input[@type='text'][position()=2]
		driver.findElement(By.xpath("//input[@name='sname']")).sendKeys("standard_user");

		// XPath using last()
		// tag-name[@attribute-type='attribute-value'][last()]
		// input[@type='text'][last()]

	}

}
