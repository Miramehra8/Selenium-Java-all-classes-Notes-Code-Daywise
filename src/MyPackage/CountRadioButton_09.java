package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton_09 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open web page
		//driver.get("https://www.udyamregistration.gov.in/Udyam_Login.aspx");
		driver.get("https://www.calculator.net");
		
		// find radio button web element on web page
		List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));

		System.out.println("Total no of radio button on web page :" + radioButtonList.size());

		// close current browser
		driver.close();
	}

}



// After run program get OUTPUT -----

// Total no of radio button on web page :2

