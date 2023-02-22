package section2_morning;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Drop_down_handling_Select_class {
	public static void main(String[] args) throws InterruptedException {		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
	WebElement element =	driver.findElement(By.xpath("//select[@name='country_id']"));
	element.click();
	Thread.sleep(3000);
		Select s = new Select(element);		
	//	s.selectByValue("8");		
	//	s.selectByVisibleText("Argentina");		
		
		s.selectByIndex(30);
		
		List<WebElement> elements =	driver.findElements(By.xpath("//select[@name='country_id']"));
		/*one way*/	
//		for(WebElement a : elements)
//		{
//			System.out.println(a.getText());
//		}
		/*2nd way*/
		
		Iterator<WebElement> itr = elements.iterator();		
		while(itr.hasNext())
		{
			WebElement elmnts = itr.next();
			System.out.println(elmnts.getText());
		}		
		driver.quit();
	}
}












