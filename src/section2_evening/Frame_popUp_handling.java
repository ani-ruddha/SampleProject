package section2_evening;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_popUp_handling {
	public static void main(String[] args) throws InterruptedException {		
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();		
		driver.switchTo().frame(0);		
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
		driver.switchTo().defaultContent();		
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		driver.switchTo().defaultContent();			
		driver.switchTo().frame(2);
String textValue =driver.findElement(By.xpath("//h2[text()='Interface Alert']")).getText();
	System.out.println(textValue);		
	driver.close();		
	}
}




