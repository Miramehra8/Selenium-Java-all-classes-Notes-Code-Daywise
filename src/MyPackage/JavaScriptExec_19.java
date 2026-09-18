package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec_19 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url //this site is not working
		// driver.get("https://uitespractice.com/Students/Index");
		// open url //this site is working
		driver.get("https://demoqa.com/links");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		/*
	     // open url //this site is not working
		// driver.get("https://uitespractice.com/Students/Index"); 
		 * // enter text in search box
		 * js.executeScript("document.getElementById('Search_Data').value='Aliya';");
		 * 
		 * // click on search button WebElement element =
		 * driver.findElement(By.xpath("//input[@value='Find']"));
		 * js.executeScript("arguments[0].click();", element);
		 */

		// refresh browser
		js.executeScript("history.go(0)");

		// To get domain name
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain :" + domain);

		// To get Title of our web page
		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title :" + title);

		// To get URL of a web page
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL :" + url);

		// find web element
		WebElement element = driver.findElement(By.xpath("//a[@id='simpleLink']"));
		//use JavaScriptUtility_19 class, directly using method to perform javascript operations
		//JavaScriptUtility_19.drawBorder(element, driver);
		//System.out.println(JavaScriptUtility_19.getTitleByJS(driver));
		
		// To Draw border around element
		//js.executeScript("arguments[0].style.border='3px solid red';", element);

		// To Zoom page
		//js.executeScript("document.body.style.zoom='50%';");

		// To get the Height and Width of a web page
		System.out.println(js.executeScript("return window.innerHeight;").toString());
		System.out.println(js.executeScript("return window.innerWidth;").toString());

		//To perform Scroll on an application
		//scroll vertically till the end
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		//scroll vertically page up
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		 //To generate Alert Pop window in Selenium Webdriver
		// js.executeScript("alert('This is my Alert message.');");

		// To navigate to a different page using Javascript
		 //js.executeScript("window.location = 'http://google.com'");

		
		//To flash webelement
		//flash
		        String bgcolor = element.getCssValue("backgroundColor");
		        for (int i = 0; i < 50; i++)
		        {
		            js.executeScript("arguments[0].style.backgroundColor = '#000000'", element);
		            
		            try {
		                Thread.sleep(20);//20 ms
		            } catch (InterruptedException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            }

		           js.executeScript("arguments[0].style.backgroundColor = '" + bgcolor + "'", element);

		        try {
		            Thread.sleep(20);//20 ms
		        } catch (InterruptedException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }

		    }

		 

	}

}

/*
 * OUTPUT---
  
 Domain :demoqa.com
 Title :demosite
 URL :https://demoqa.com/links
 demosite
 674
 1536

 */
