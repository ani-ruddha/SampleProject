package xpath_programs;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart_all_productName {
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");			
		driver.findElement(By.xpath("//button[text()='✕']")).click();		
		WebElement element =driver.findElement(By.xpath("//input[@name='q']"));
			element.sendKeys("i phone 11");
			element.submit();
			Thread.sleep(4000);
			List<WebElement> pnames =driver.findElements(By.xpath("//div[@class='_4rR01T']"));			
			for(WebElement elements : pnames)
			{
				System.out.println(elements.getText());
			}
			
	}
}







