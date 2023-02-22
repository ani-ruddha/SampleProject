package xpath_evening;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Assignment {
	WebDriver driver;

	
		public void launchBrowser()
		{
		 driver  = new ChromeDriver();				 
		driver.get("https://demo.actitime.com/login.do");	
		}
		
		
		public void login() throws Exception
		{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		}
		
		public void clickOnTask()
		{
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		}
		
		public void Execution() throws Exception
		{
			Random r  = new Random();
		int i = r.nextInt(10);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'createNewCustomer')]")).click();
		Thread.sleep(4000);
driver.findElement(By.xpath("//input[contains(@class,'inputNameField')]")).sendKeys("Shaitan" + i);
		Thread.sleep(4000);
driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("villain");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(4000);
		String actualName =	driver.findElement(By.xpath("(//div[@class='title'])[23]")).getText();
		String expectedName = "Shaitan" + i;
		if(actualName.equals(expectedName))
		{
			System.out.println("customer created successfully!!!");
		}
		else
		{
			System.out.println("not created successfully!!!");
		}
	}
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	public void closeBrowser()
	{	
		driver.quit();
	}
	public static void main(String[] args) throws Exception {		
		Actitime_Assignment asign = new Actitime_Assignment();		
		asign.launchBrowser();
		Thread.sleep(3000);
		asign.login();
		Thread.sleep(3000);
		asign.clickOnTask();
		Thread.sleep(3000);
		asign.Execution();
		Thread.sleep(3000);
		asign.logout();
		Thread.sleep(3000);
		asign.closeBrowser();
	}
	
}






