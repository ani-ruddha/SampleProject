package xpath_evening;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_compare {
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");		
		driver.findElement(By.xpath("//button[text()='✕']")).click();		
	WebElement element =	driver.findElement(By.xpath("//input[@name='q']"));
	element.sendKeys("mobiles");
	element.submit();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//div[text()='Popularity']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[22]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[25]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[28]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[31]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[33]")).click();
		Thread.sleep(3000);	
		driver.quit();
		
		
		
	}
}










