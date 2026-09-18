package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo_20 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.rediff.com/");

		// switch to iframe name=moneyiframe
		driver.switchTo().frame("moneyiframe");

		// find web Element
		String text = driver.findElement(By.className("ltp")).getText();
		// String text =
		// driver.findElement(By.xpath("//div[@id='divbse_data']//div[@class='ltp']")).getText();

		System.out.println(text);
	}

}

// OUTPUT --- ₹ 74,294.96
