package xpath_evening;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_handling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.findElement(By.xpath("//button[text()='✕']")).click();		
	WebElement element =	driver.findElement(By.xpath("//input[@class='_3704LK']"));	
	element.sendKeys("shoes");	
	element.submit();
	
WebElement slider1 =	driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
WebElement slider2 =	driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));

	Actions act  = new Actions(driver);
	
	act.dragAndDropBy(slider1, -50, 0).perform();
	Thread.sleep(3000);
	act.dragAndDropBy(slider2, 40, 0).perform();


	}
}





