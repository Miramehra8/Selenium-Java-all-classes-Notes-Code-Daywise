package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframeDemo_20 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url // this site not working
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		// switch to iframe
		driver.switchTo().frame("frame1"); // parent frame or outer frame
		driver.switchTo().frame("frame3"); // child frame or inner frame

		// find webelement checkbox
		driver.findElement(By.id("a")).click();

		// switch to parent frame
		driver.switchTo().parentFrame();

		// find webelement input box
		driver.findElement(By.tagName("input")).sendKeys("this is text message");

		// switch to main content/main page
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");

		// find webelement animal dropdown
		WebElement element = driver.findElement(By.id("animals"));
		Select dropDown = new Select(element);
		dropDown.selectByVisibleText("Avatar");

	}

}
