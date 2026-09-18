package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo2_20 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.rediff.com/");

		// switch to iframe name=moneyiframe, index=1
		driver.switchTo().frame(1);

		// find web Element
		// driver.findElement(By.className("ltp")).click();
		driver.findElement(By.id("divbse_data")).click();

		/*
		 * this is not working // switch to 2nd iframe name= index=0
		 * //driver.switchTo().frame(0); // find web Element
		 * driver.findElement(By.linkText("BusinessEmail")).click();
		 */

		driver.switchTo().defaultContent();

		// find and print total iframes on web page
		int noOfiframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("no Of iframes: " + noOfiframes);

	}

}
