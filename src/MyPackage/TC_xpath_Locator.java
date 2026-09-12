package MyPackage;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		//switch to product page
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);
		
		//locate Sauce Labs Bolt T-Shirt and click operation by using LinkText
	   //driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		
		//locate Sauce Labs Bolt T-Shirt and click operation by using partialLinkText
		//driver.findElement(By.partialLinkText("Bolt")).click();
		
		//locate Total Elements of Sauce  by using partialLinkText
		List<WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element size:" + elementList.size());
	}

}
