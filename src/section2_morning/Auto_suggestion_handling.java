package section2_morning;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion_handling {
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://www.google.com/");	
		
WebElement element =driver.findElement(By.xpath("//input[@class='gLFyf']"));
	
		element.sendKeys("Virat kohli");
		Thread.sleep(3000);
		
List<WebElement> suggestions =	driver.findElements(By.xpath("//div[@class='mkHrUc']"));
	Thread.sleep(3000);
		for(WebElement store : suggestions)
		{
			String s = store.getText();
			
			System.out.println(s);
		}
		Thread.sleep(3000);
		driver.quit();		
	}
}
