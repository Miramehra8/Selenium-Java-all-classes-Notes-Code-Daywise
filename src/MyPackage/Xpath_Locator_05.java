package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator_05 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// open web page
		driver.get("http://www.saucedemo.com");

		
		// text method ---  *[text()='Text displayed on Webpage']
		driver.findElement(By.xpath("//*[text()='Accepted usernames are:']"));
		
		
		// locate username using single attribute
      //driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
     
		//locate username using contains , in username we used here user bcz partial we choose
		//conatins we used for dynamic when username change 
		//contains method help in locating the UI element using partial text
		//driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		
		// locate username using starts-with ,in username we used here user bcz partial we choose
		// starts-with we used for dynamic when username starting value are fixed but last value are changing
		driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("standard_user");
		
		// locate password using multiple attribute
		driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");

		// locate login using single attribute
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		// switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		//id="add-to-cart-sauce-labs-backpack"   name="add-to-cart-sauce-labs-backpack" //(using add means both conditions need to be true)
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
		
		//id="add-to-cart-sauce-labs-bike-light"   name="add-to-cart-sauce-labs-bike-light" //(using or means any one condition need to be true)
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light' or @name='add-to-cart-sauce-labs-bike-light']")).click();
		
		
	}

}
