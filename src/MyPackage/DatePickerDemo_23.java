package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo_23 {

	public static void main(String[] args) {

		// 5-October-2027
		String expectedDay = "5";
		String expectedMonth = "October";
		String expectedYear = "2027";

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://jqueryui.com/datepicker/");

		// switch to iframe
		driver.switchTo().frame(0);

		// find date picker Webelement to perform click action
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		
		while(true)
		{
			String calendarMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calendarYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedYear)) 
			{
				List<WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for(WebElement e:daysList) 
				{
					String calendarDay = e.getText();
					if(calendarDay.equals(expectedDay)) 
					{
						e.click();
						break;
					}						
				}				
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
	}

}
