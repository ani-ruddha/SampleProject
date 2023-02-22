package locator_evening_batch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Productname_price_flipkart {
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
WebElement element =driver.findElement(By.xpath("//input[@name='q']"));
element.sendKeys("i phone 11");
element.submit();
Thread.sleep(4000);
String productname =driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).getText();
Thread.sleep(3000);
String productprice = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']/../following-sibling::div/div[1]/div[1]/div[1]")).getText();
System.out.println(productname + "-->" + productprice);
Thread.sleep(4000);	
driver.quit();
	}
}






