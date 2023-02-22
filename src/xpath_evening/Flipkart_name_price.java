package xpath_evening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_name_price {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();	
		Thread.sleep(3000);
	WebElement element =	driver.findElement(By.xpath("//input[@name='q']"));	
	element.sendKeys("i phone 11");	
	element.submit();
	Thread.sleep(3000);	
String pname =	driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Red, 128 GB)']")).getText();
Thread.sleep(3000);
String price =	driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Red, 128 GB)']/../following-sibling::div/div[1]/div[1]/div[1]")).getText();
Thread.sleep(3000);
	System.out.println(pname + "---->" + price);
	Thread.sleep(3000);
	driver.quit();
	}
}







