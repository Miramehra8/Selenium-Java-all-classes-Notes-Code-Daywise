package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop_11 {

	public static void main(String[] args) {
		
		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open web page
		// driver.get("https://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		// not working above site alternate this below site //below site also not working
		driver.get("https://codepen.io/EpsilonDeltaCriterion/pen/jLoPgE");

		// find source and target web element
		WebElement source = driver.findElement(By.id("box6")); // rome
		WebElement target = driver.findElement(By.id("box106")); // Italy

		Actions act = new Actions(driver);

		// dragAndDrop(sourceElement, targetElement)
		act.dragAndDrop(source, target).perform();
	}

}
