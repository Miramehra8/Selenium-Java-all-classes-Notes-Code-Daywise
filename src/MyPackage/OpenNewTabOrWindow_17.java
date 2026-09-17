package MyPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow_17 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.google.com/");
		System.out.println("first page :" + driver.getTitle());

		// open new tab
	 // driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("second page :" + driver.getTitle());

		// get window handles of open window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);

		driver.close();
		driver.switchTo().window(handles.get(0)); // switch to google.com
		System.out.println("first page :" + driver.getTitle());
	}

}

/*
 * OUTPUT After Run --------
 * 
 * first page :Google second page :Facebook first page :Google
 */
