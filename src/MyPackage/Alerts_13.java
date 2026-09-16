package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_13 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		// driver.get("http://uitestpractice.com/Students/Switchto");
		driver.get("https://demoqa.com/alerts");

		// Click Button to see alert
		// find simple alert button and perform click action
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		// switch to alert window and accept the alert
		driver.switchTo().alert().accept(); // OK button is clicked

		// On button click, confirm box will appear You selected Ok and perform click action
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		// switch to alert window and accept the alert
		// driver.switchTo().alert().accept(); // OK button is clicked
		driver.switchTo().alert().dismiss(); // to cancel alert

		// On button click, prompt box will appear and perform click action
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		// switch to alert window and enter name
		driver.switchTo().alert().sendKeys("ria");
		// switch to alert window and accept the alert
		driver.switchTo().alert().accept(); // OK button is clicked
		// driver.switchTo().alert().dismiss(); // to cancel alert
	}

}
