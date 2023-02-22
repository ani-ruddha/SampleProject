package xpath_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class H_over_handling {

	public static void main(String[] args) {		
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://demo.actitime.com/login.do");		
		WebElement element =driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']"));
		
		String s = element.getAttribute("title");
		
		System.out.println("h-over msg is : " + s);
		
		//to check the element is displayed or not		
		if(element.isDisplayed())
		{
			System.out.println("check box is displayed");
		}
		else
		{
			System.out.println("check box is not displayed");
		}
		
		//to check the element is disabled or enabled		
		if(element.isEnabled())
		{
			System.out.println("It is clickable");
		}
		else
		{
			System.out.println("It is not clickable");
		}
		
		//to check the element is selected or not selected
		
		if(element.isSelected())
		{
			System.out.println("It is selected");
		}
		else
		{
			System.out.println("It is not selected");
		}
	}
}






