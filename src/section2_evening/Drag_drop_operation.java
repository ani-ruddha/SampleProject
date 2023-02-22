package section2_evening;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_operation {

	public static void main(String[] args) {		
		WebDriver driver  = new ChromeDriver();		
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	

	WebElement dragMadrid =	driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
	WebElement dropSpain  =	driver.findElement(By.xpath("//div[text()='Spain']"));	
	Actions act  = new Actions(driver);	
	act.dragAndDrop(dragMadrid, dropSpain);
	
	WebElement dragRome =	driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
	WebElement dropItaly  =	driver.findElement(By.xpath("//div[text()='Italy']"));	
	act.dragAndDrop(dragRome, dropItaly);
	
	WebElement dragSeoul =	driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
	WebElement dropSouthKorea  =	driver.findElement(By.xpath("//div[text()='South Korea']"));
	
	act.dragAndDrop(dragSeoul, dropSouthKorea);
	
	act.perform();
	}
}






