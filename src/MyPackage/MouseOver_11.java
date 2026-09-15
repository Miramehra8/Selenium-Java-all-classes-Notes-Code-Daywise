package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_11 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open web page 
		// this below side also not working means site open but pop come so our code not perform completely
		driver.get("http://www.ebay.in/");

		WebElement element = driver.findElement(By.linkText("Shipping & Payments"));

		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

}
