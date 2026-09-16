package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_14 {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("C:\\Users\\91799\\Desktop\\Selenium Ket\\sample.html");

		// find second cell in web table and print second cell data
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);

		// find Total rows in webtable
		List<WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("rows:" + rowList.size());

		// find Total columns in webtable
		List<WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("columns:" + columnList.size());

		for (int r = 2; r <= rowList.size(); r++) //2,3
		{
			for (int c = 1; c <= columnList.size(); c++) //1,2
			{
				String data = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
				System.out.println(data);
			}
		}
	}

}


/* ALL OUTPUTS---

second cell
rows:3
columns:2
firs cell
second cell
third cell
fourth cell
*/

