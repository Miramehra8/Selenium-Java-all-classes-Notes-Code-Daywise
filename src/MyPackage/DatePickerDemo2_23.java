package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2_23 {

	public static void main(String[] args) {
		
		// 5-October 2027
		String expectedDay = "5";
		String expectedMonthYear = "October 2027";
	

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.redbus.in/");

		

		// find date picker Webelement to perform click action
		WebElement datepicker = driver.findElement(By.xpath("//div[@class='dateInputWrapper___dfa43b dateHighlight___b79802']"));
		datepicker.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true)
		{
			String calendarMonthYear = driver.findElement(By.xpath("//div[contains(@class,'monthYearHolidayWrap___69b3f0')]")).getText();
			
			
			if(calendarMonthYear.equals(expectedMonthYear)) 
			{
				List<WebElement> daysList = driver.findElements(By.xpath("//div[@class='date___b0d8ac available___7114e3  calendarDate']"));
				
				//ONE WAY 
			/*  for(WebElement e:daysList) 
				{
					String calendarDay = e.getText();
					if(calendarDay.equals(expectedDay)) 
					{
						e.click();
						break;
					}						
				} */	
				 	
				//OTHER WAY
				//hardcoded date given = 8 
				//driver.findElement(By.xpath("//span[text()='8']")).click();
				//dynamic date given 
				driver.findElement(By.xpath("//span[text()='" + expectedDay + "']")).click();
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//i[@class='icon icon-arrow arrow___2dd861 right___841620 ']")).click();
			}
		}
	}

}
