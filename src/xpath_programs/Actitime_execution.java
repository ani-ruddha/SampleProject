package xpath_programs;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_execution {

		WebDriver driver;		
		public void launchBrowser()
		{		
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		driver  = new ChromeDriver();	
		driver.get("https://demo.actitime.com/login.do");	
		}		
		public void login()
		{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");	
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		}	
		
		public void execution() throws Exception
		{
			Random r = new Random();
			
			int goals = r.nextInt(100);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		Thread.sleep(3000);
driver.findElement(By.xpath("//input[contains(@class,'inputFieldWithPlaceholder newName')]"))
		.sendKeys("Messi" + goals);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']"))
		.sendKeys("World champion");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();		
		Thread.sleep(3000);	
		String actualName =	driver.findElement(By.xpath("(//div[@class='title'])[23]")).getText();
		Thread.sleep(4000);
		System.out.println(actualName);
	
		}
		
		public void logOut()
		{
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		}
	
		public void closeBrowser()
		{
		driver.close();
		}		
		
		
	}





