package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_xpath_CSS_Locator {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// open web page
		driver.get("http://www.saucedemo.com");

		// locate username -- tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

		// locate password -- tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password")).sendKeys("secret_sauce");

		// locate login -- tag.value of className
		driver.findElement(By.cssSelector("input.submit-button")).click();

		// switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		//tag.valueClass[attribute=value]
		driver.findElement(By.cssSelector("Button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		//tag[attribute$=value] --endwith, tag[attribute^=value] --startwith, tag[attribute*=value] --contain anywhere
		driver.findElement(By.cssSelector("Button[name$=light]")).click();
	}

}
