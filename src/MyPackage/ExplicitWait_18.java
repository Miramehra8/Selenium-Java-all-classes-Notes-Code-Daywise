package MyPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitWait_18 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("http://www.ebay.in/");

		// explicit wait of 10 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Stopwatch watch=null;
		try {
			watch = Stopwatch.createStarted();	
			// find webelement "START SELLING"			
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn--button btn--medium btn--color-4 btn btn--button header__button']")));
			element.click();		
			//driver.findElement(By.xpath("//a[@class='btn btn--button btn--medium btn--color-4 btn btn--button header__button']")).click();
		} catch (Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " Seconds");
		}
	}

}


/*
if we give wrong xpath --- After Run --- OUTPUT ---

org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element found by By.xpath: //a[@class='btn xyz btn--button btn--medium btn--color-4 btn btn--button header__button'], but... org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//a[@class='btn xyz btn--button btn--medium btn--color-4 btn btn--button header__button']"}.
(tried for 10 seconds with 500 milliseconds interval)

10 Seconds
*/