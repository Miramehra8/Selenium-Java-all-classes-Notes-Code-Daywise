package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://testautomationpractice.blogspot.com/");

		// find Total rows in webtable
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("rows:" + rowList.size());

		// find Total columns in webtable
		List<WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("columns:" + columnList.size());
		
		for (int r = 2; r <= rowList.size(); r++) // row
		{
			for (int c = 1; c <= columnList.size(); c++) //column
			{
				String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
				System.out.println(data);
			}
		}
	}

}


/*ALL OUTPUTS----

rows:7
columns:4
Learn Selenium
Amit
Selenium
300
Learn Java
Mukesh
Java
500
Learn JS
Animesh
Javascript
300
Master In Selenium
Mukesh
Selenium
3000
Master In Java
Amod
JAVA
2000
Master In JS
Amit
Javascript
1000
*/
