package locator_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_actitime_ {

	public static void main(String[] args) throws Exception {		
System.setProperty("webdriver.chrome.driver","D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.className("initial")).click();
	}
}
