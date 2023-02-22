package xpath_evening;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static void main(String[] args) throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");		
		driver.findElement(By.xpath("//button[text()='✕']")).click();		
		WebElement element =		driver.findElement(By.xpath("//input[@name='q']"));				
		element.sendKeys("i phone 11");
		element.submit();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Newest First']")).click();
		Thread.sleep(3000);
String result =	driver.findElement(By.xpath("//span[@class='_10Ermr']")).getText();
System.out.println(result);
driver.quit();
	}
}






