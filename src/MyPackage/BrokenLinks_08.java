package MyPackage;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_08 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// wait 10 second for selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// open web page
		driver.get("http://www.deadlinkcity.com");

		// find hyperlink
		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		int resCode = 200; // 2xx response code is valid link
		int BrokenLinkCnt = 0;

		System.out.println("Total Links on page:" + linkList.size());
		
		for (WebElement el : linkList) {
			String url = el.getAttribute("href");

			try {
				URL urlLink = new URL(url);
				HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();

				resCode = huc.getResponseCode();
				if (resCode >= 400) {
					System.out.println(url + "brokenLink");
					BrokenLinkCnt++;
				}

			} catch (MalformedURLException e) {

			} catch (Exception e) {

			}
		}

		System.out.println("Total Broken Links:" + BrokenLinkCnt);
		
		// close browser
		driver.close();
	}

}


//after run we got this OUTPUT---

/*
 * Total Links on page:48
 * http://www.deadlinkcity.com/error-page.asp?e=400brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=401brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=402brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=403brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=404brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=405brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=406brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=407brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=408brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=409brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=410brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=411brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=412brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=413brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=414brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=415brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=416brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=417brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=420brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=422brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=423brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=424brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=429brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=431brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=450brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=500brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=501brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=502brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=503brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=504brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=505brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=506brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=507brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=509brokenLink
 * http://www.deadlinkcity.com/error-page.asp?e=510brokenLink
 * http://www.deadlinkcity.com/page-not-found.aspbrokenLink
 * http://www.deadlinkcity.com/default.asp?r=4brokenLink
 * http://www.deadlinkcity.com/default.asp?r=5brokenLink
 * http://www.deadlinkcity.com/default.asp?r=6brokenLink
 * http://www.deadlinkcity.com/default.asp?r=7brokenLink
 * http://www.deadlinkcity.com/disallowed/disallowed.htmlbrokenLink
 * http://www.deadlinkcity.com/disallowed/nonexistent.htmlbrokenLink Total
 * Broken Links:42
 */