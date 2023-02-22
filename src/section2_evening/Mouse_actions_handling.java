package section2_evening;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mouse_actions_handling {
	public static void main(String[] args) throws InterruptedException, AWTException {		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	WebElement element =	driver.findElement(By.xpath("//a[text()='Gmail']"));
	Thread.sleep(3000);
	Actions act  = new Actions(driver);	
	act.moveToElement(element).contextClick().build().perform();
	Robot r = new Robot();	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	/*7 times key press and key release*/	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);	
	driver.close();		
	}
}






