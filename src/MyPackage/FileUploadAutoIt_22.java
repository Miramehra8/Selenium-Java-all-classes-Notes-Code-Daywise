package MyPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAutoIt_22 {

	public static void main(String[] args) throws InterruptedException {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://the-internet.herokuapp.com/upload");

		// find choose file web element
		WebElement button = driver.findElement(By.id("file-upload"));

		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		try {
			Thread.sleep(3000); 
			Runtime.getRuntime().exec("C://Users//91799//Desktop//AutoId//FileUpload.exe" + " " + "C:\\Users\\91799\\Desktop\\STSprobem.txt");
			//Runtime.getRuntime().exec("C:\\Users\\91799\\Desktop\\AutoId\\FileUpload.exe" + " " + "C:\\Users\\91799\\Desktop\\STSprobem.txt");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
