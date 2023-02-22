package locator_evening_batch;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_actitime {

	public static void main(String[] args) {		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");	
		
		driver.findElement(By.id("username")).sendKeys("admin");		
		driver.findElement(By.name("pwd")).sendKeys("manager");		
		driver.findElement(By.className("initial")).click();
	}
}




