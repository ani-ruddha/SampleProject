package section1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Program3 {
	public static void main(String[] args) throws Exception {		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");		
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(3000);		
		driver.manage().window().minimize();		
		Thread.sleep(3000);		
		driver.manage().window().maximize();		
		Thread.sleep(4000);		
		driver.close();		
	}
}
