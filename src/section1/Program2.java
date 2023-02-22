package section1;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
				
				ChromeDriver driver  = new ChromeDriver();
				
				driver.get("https://www.flipkart.com/");
				
				Thread.sleep(4000);
				
				driver.get("https://demo.actitime.com/login.do");				
				driver.close();			
				
	}
				
}
