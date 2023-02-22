package xpath_evening;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone 11");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).click();
		
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 6 (Space Grey, 32 GB)']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
