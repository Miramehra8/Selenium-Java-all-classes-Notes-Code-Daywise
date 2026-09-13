package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// open web page
		driver.get("https://www.opencart.com/index.php?route=account/register");

		// locate country dropdown
		WebElement element = driver.findElement(By.id("input-country"));

		// create Select object
		Select dropdown = new Select(element);

		// select country
		// dropdown.selectByVisibleText("Iceland");
		// dropdown.selectByValue("98");
		dropdown.selectByIndex(1);

		// check Dropdown is multiple or not
		if (dropdown.isMultiple()) 
		{
			System.out.println("Dropdown is multiple");
		} else {
			System.out.println("Dropdown is not multiple");
		}

		// print all dropdown options
		List<WebElement> alldropdownoptions = dropdown.getOptions();
		System.out.println("Total options:" + alldropdownoptions.size());
		for (WebElement el : alldropdownoptions) 
		{
			System.out.println(el.getText());
		}
	}
}