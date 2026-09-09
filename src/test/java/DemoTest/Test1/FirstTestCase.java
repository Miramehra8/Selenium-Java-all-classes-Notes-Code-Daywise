package DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {

		// Launch Chrome web browser
				// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				// Launch google web page
				driver.navigate().to("http:\\www.google.com");

				// capture title of web page and print
				String title = driver.getTitle();
				System.out.println("Page Title : " + title);

				// capture url of the webpage
				System.out.println("URL :" + driver.getCurrentUrl());

				driver.close();
	}

}
