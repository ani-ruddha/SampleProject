package section2_evening;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_scenario {

	public static void main(String[] args) {		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();		
	String date = 	driver.findElement(By.xpath("//a[@data-date='31']")).getText();	
		System.out.println(date);		
		driver.quit();
	}
}

