package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick__11 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open web page
		driver.get("https://demoqa.com/buttons");

		// Button dhoondhne se PEHLE yeh code daalhein taaki ads gayab ho jayein
		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;

		// Footer aur Side Ads ko remove karne ke liye
		js.executeScript(
				"const ads = document.querySelectorAll('[id^=google_ads], [class^=ad], footer, #adplus-anchor'); ads.forEach(ad => ad.remove());");

		// Thoda 1 second ka wait karein taaki page stable ho jaye
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

		Actions act = new Actions(driver);
		act.contextClick(button).perform(); // right click action
		// act.moveToElement(button).contextClick().perform();
	}
}
