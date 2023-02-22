package section2_evening;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_stroke_handling {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://demo.actitime.com/login.do");	
		
		//LOGIN WITH KEYS CLASS
		
/*		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin" ,
				Keys.TAB , "manager" , Keys.ENTER); */
		
		//LOGIN WITH ROBOT CLASS
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("trainee");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
