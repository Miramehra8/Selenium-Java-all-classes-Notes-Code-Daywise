package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo3_23 {

	public static void main(String[] args) {

		// 27-October-2026
		String expectedDay = "27";
		String expectedMonthYear = "October 2026";
		
		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.goibibo.com/flights/");

		// find date picker Webelement to perform click action
		WebElement datepicker = driver.findElement(By.xpath("//p[contains(@data-cy,'departureDate')]"));
		datepicker.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true)
		{		
			String calendarMonthYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
					
			if(calendarMonthYear.equals(expectedMonthYear))
			{
				//may be below line xpath, will not work for me, check once xpath,bcz date is not click
				List<WebElement> daysList = driver.findElements(By.xpath("//div[@class='dateInnerCell']"));
				
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
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}
	}

}
