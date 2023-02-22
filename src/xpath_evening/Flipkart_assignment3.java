package xpath_evening;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");		
		driver.findElement(By.xpath("//button[text()='✕']")).click();		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone 11");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 Pro Max (Space Grey, 64 GB)']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
