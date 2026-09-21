package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp_25 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
