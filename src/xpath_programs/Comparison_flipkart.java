package xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comparison_flipkart {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");			
		driver.findElement(By.xpath("//button[text()='✕']")).click();		
		WebElement element =		driver.findElement(By.xpath("//input[@name='q']"));
			element.sendKeys("mobile");
			element.submit();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class='_24_Dny'])[22]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class='_24_Dny'])[23]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class='_24_Dny'])[33]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@class='_24_Dny'])[36]")).click();
	}
}







