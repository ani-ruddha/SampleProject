package xpath_evening;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class All_productnames {
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(3000);
		element.sendKeys("mobiles");
		Thread.sleep(3000);
		element.submit();
		Thread.sleep(3000);
	List<WebElement> productPrice =	driver.findElements(By.xpath("//div[@class='_4rR01T']/../following-sibling::div[1]/div[1]/div[1]/div[1]"));	
			for(WebElement elements : productPrice)
			{
				System.out.println(elements.getText());
			}		
		driver.quit();
	}
}







