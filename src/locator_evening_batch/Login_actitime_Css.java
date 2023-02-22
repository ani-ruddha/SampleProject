package locator_evening_batch;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login_actitime_Css {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.drive", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	}
}



