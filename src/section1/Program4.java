package section1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
public class Program4 {
	public static void main(String[] args) throws InterruptedException {		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver  = new ChromeDriver();		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Dimension d = new Dimension(300, 400);		
		driver.manage().window().setSize(d);		
		driver.manage().window().setPosition(new Point(300 , 400));
		Thread.sleep(3000);		
		driver.close();
	}
}
