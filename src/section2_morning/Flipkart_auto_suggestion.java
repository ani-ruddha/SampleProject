package section2_morning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_auto_suggestion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");			
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement element =driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("shoes");
		
	List<WebElement> lst =	driver.findElements(By.xpath("//li[@class='Y5N33s']"));
	
	for(WebElement elements : lst)
	{
		String s =elements.getText();
		System.out.println(s);
	}

	}
}









