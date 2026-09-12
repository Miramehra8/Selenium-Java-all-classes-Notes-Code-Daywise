package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_xpath_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//open web page
		driver.get("http://www.saucedemo.com");
		
		// locate username by id
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		// locate username by name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		// locate login button
		driver.findElement(By.className("submit-button")).click();
	}

}
