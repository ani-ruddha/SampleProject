package section2_morning;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Drop_down_handling {
	public static void main(String[] args) throws InterruptedException, AWTException {		
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin" , 
		Keys.TAB , "admin123" , Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).click();				
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='CAN - Personal']")).click();
/*		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.quit();
		*/
		
		
		
	}
}




