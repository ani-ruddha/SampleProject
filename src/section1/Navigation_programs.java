package section1;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation_programs {
	public static void main(String[] args) throws Exception {		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();				
	/*	normal way 
	 * Navigation nav = driver.navigate();				
		nav.to("https://demo.actitime.com/login.do");	
		Thread.sleep(4000);
		nav.to("https://www.flipkart.com/");		
		Thread.sleep(3000);		
		nav.back();		
		Thread.sleep(3000);		
		nav.forward();		
		Thread.sleep(3000);		
		nav.refresh();		
		*/
		//optimized part
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);		
		driver.close();
		
		
	}
}




