package MyPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait_18 {

	public static void main(String[] args) {

		//launch chrome browser
		WebDriver driver = new ChromeDriver();

		//maximize browser
		driver.manage().window().maximize();

		//open url
		driver.get("http://www.ebay.in/");

		// implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Stopwatch watch=null;
		try {
			watch = Stopwatch.createStarted();
			// find webelement "START SELLING"
			driver.findElement(By.xpath("//a[@class='btn btn--button btn--medium btn--color-4 btn btn--button header__button']")).click();
		} catch (Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " Seconds");
		}
		
	}

}

/*
if we give wrong xpath --- After Run --- OUTPUT ---

org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//a[@class='btn btn btn--button btn--medium btn--color-4 btn btn--button header__button']"}
(Session info: chrome=153.0.8010.48)

10 Seconds
*/
