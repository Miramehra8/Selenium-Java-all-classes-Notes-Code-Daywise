package MyPackage;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Stopwatch;

public class FluentWait_18 {

	public static void main(String[] args) {
	
		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("http://www.ebay.in/");

		// fluent wait of 10 seconds
        Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
        		.withTimeout(Duration.ofSeconds(10))
        		.pollingEvery(Duration.ofSeconds(2))
        		.withMessage("This is Custom Message")
        		.ignoring(NoSuchElementException.class);
		
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn--button btn--medium btn--color-4 btn btn--button header__button']")));
		element.click();

	}

}


/*
if we give wrong xpath --- After Run --- OUTPUT ---

Exception in thread "main" org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element found by By.xpath: //a[@class='btn xyz btn--button btn--medium btn--color-4 btn btn--button header__button'], but... org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//a[@class='btn xyz btn--button btn--medium btn--color-4 btn btn--button header__button']"}.
(tried for 10 seconds with 2000 milliseconds interval)

or

// After this code---  .withMessage("This is Custom Message")
Exception in thread "main" org.openqa.selenium.TimeoutException: Expected condition failed: This is Custom Message
(tried for 10 seconds with 2000 milliseconds interval)
*/

