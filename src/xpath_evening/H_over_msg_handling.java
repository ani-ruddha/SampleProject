package xpath_evening;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_over_msg_handling {

	public static void main(String[] args) {		
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://demo.actitime.com/login.do");		
WebElement element =driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']"));
	
	String msg =	element.getAttribute("title");
	System.out.println("h-over msg is : " + msg);	
	
	String s = element.getTagName();
	System.out.println("tagName is : " + s);
	//to check element is visible or not	
	if(element.isDisplayed())
	{
		System.out.println("element is displayed");
	}
	else
	{
		System.out.println("element is hidden");
	}
	
	// to check element is enable or disable	
	if(element.isEnabled())
	{
		System.out.println("element is enabled");
	}
	else
	{
		System.out.println("element is disabled!!");
	}	
	//element is selected or not
	if(element.isSelected())
	{
		System.out.println("element is selected");
	}
	else
	{
		System.out.println("element is not selected");
	}
	}
}









