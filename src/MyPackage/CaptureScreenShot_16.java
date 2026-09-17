package MyPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot_16 {

	public static void main(String[] args) throws IOException {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url //this site not working
		driver.get("http://www.uitestingplayground.com/");

	/*	
	    // capture full page screenshot
		// step1: convert web driver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot) driver);

		// step2: call getScreenshotAs method to create image file
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\91799\\Desktop\\seleniumprojectown\\DemoTest\\Screenshots\\fullPage.png");

		// step3: copy image file to destination
		FileUtils.copyFile(src, dest);  
	*/	
	
		
	// capture section of a web page screenshot
	// step1: find xpath for that section
    //WebElement section = driver.findElement(By.xpath("//div[@class='alert alert-warning']"));
		
	// step1: find xpath for image to take screenshot
	 WebElement section = driver.findElement(By.xpath("//img[@class='img-fluid']"));
		
	// step2: call getScreenshotAs method to create image file
	File src = section.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\91799\\Desktop\\seleniumprojectown\\DemoTest\\Screenshots\\imagescreenshot.png");

	// step3: copy image file to destination
	FileUtils.copyFile(src, dest);
	}

}
