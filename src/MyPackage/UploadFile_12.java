package MyPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile_12 {

	public static void main(String[] args) throws AWTException {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://demoqa.com/upload-download");
				
		// if (type=file) given than only .sendKeys works, otherwise below step follow
		// find webElement choose file
		// driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\91799\\Desktop\\STS, HeidiSQL available Path.txt");

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
				
		// if (type=file) given than only .sendKeys works, otherwise below step follow
		// find webElement choose file		
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));

		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//copy file to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\91799\\Desktop\\STS, HeidiSQL available Path.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//perform control + V action to paste file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
