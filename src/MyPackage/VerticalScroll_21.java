package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalScroll_21 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.calculator.net/");
		
		//this site not working used for last script in video//Horizontal scroll on the web page
		//driver.get("http://www.album.alexflueras.ro/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript(Script,Arguments);
		// To scroll down the web page by pixel
		// js.executeScript("window.scrollBy(x-pixels,y-pixels)");
		// Scroll vertically down by 500 pixels
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// js.executeScript("window.scrollBy(0,500)");

		
		// To scroll down the web page by the visibility of the element
		// WebElement element = driver.findElement(By.linkText("BMI Calculator"));
		// js.executeScript("arguments[0].scrollIntoView();", element);

		// To scroll down the web page at the bottom of the page
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// Horizontal scroll on the web page
		//WebElement Element = driver.findElement(By.id("a7"));
		//js.executeScript("arguments[0].scrollIntoView();", Element);

	}

}
