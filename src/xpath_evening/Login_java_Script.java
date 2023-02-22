package xpath_evening;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_java_Script {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById('username').value='admin';");
		jse.executeScript("document.getElementsByName('pwd')[0].value='manager';");
		jse.executeScript("document.getElementById('loginButton').click();");
		
		
		
		
	}
}




