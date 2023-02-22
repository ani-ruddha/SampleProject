package section2_morning;
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
		Actions act  = new Actions(driver);		
	WebElement dragElement =	driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
	WebElement dropElement =driver.findElement(By.xpath("//div[text()='Sweden']"));
	
	act.dragAndDrop(dragElement, dropElement);
	
	act.perform();
	
	

	WebElement dragWashington =	driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
	WebElement dropElementUnitedStates =driver.findElement(By.xpath("//div[text()='United States']"));
	
	act.dragAndDrop(dragWashington, dropElementUnitedStates);
	
	WebElement dragMadrid =	driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
	WebElement dropElementSpain =driver.findElement(By.xpath("//div[text()='Spain']"));
	
	act.dragAndDrop(dragMadrid, dropElementSpain);
	
	WebElement dragRome =	driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
	WebElement dropElementItaly =driver.findElement(By.xpath("//div[text()='Italy']"));
	
	act.dragAndDrop(dragRome, dropElementItaly);
	
	WebElement dragCopenhagen =	driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
	WebElement dropElementDenmark =driver.findElement(By.xpath("//div[text()='Denmark']"));
	
	act.dragAndDrop(dragCopenhagen, dropElementDenmark);
	
	act.perform();
	}
}








