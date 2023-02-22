package locator_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_actitime_Css {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();		
		driver.get("https://demo.actitime.com/login.do");
		
driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
Thread.sleep(3000);
driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
Thread.sleep(3000);
driver.findElement(By.cssSelector("a[id='loginButton']")).click();

	}
}




