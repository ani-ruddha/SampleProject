package xpath_evening;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Assignment4 {
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");		
		driver.findElement(By.xpath("//button[text()='✕']")).click();		
		WebElement element =		driver.findElement(By.xpath("//input[@name='q']"));				
		element.sendKeys("i phone 11");
		element.submit();		
		Thread.sleep(4000);
String productName =driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).getText();
			System.out.println(productName);
			
			driver.quit();
	}
}
