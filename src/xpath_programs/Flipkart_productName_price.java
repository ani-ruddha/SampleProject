package xpath_programs;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_productName_price {
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(3000);
		element.sendKeys("shoes");
		element.submit();
		Thread.sleep(3000);
		List<WebElement> pname =driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		Thread.sleep(4000);
		List<WebElement> pprice =driver.findElements(By.xpath("//a[@class='IRpwTa']/following-sibling::a[1]/div[1]/div[1]"));
		
		for(int i = 0 ; i<=pname.size()-1 ; i++)
		{
		System.out.println(pname.get(i).getText() + "-------->" + pprice.get(i).getText());
		}
		
		Thread.sleep(3000);
	
		driver.quit();
		
		
		
		
		
		
	}
}
