package section2_evening;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Drop_down_handling_Select_class {
	public static void main(String[] args) {		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
	List<WebElement> elements = 	driver.findElements(By.xpath("//select[@name='country_id']"));
	

	//element.click();
	//	Select s = new Select(element);
	//	s.selectByVisibleText("Argentina");		
	//	s.selectByValue("13");
	//	s.selectByIndex(73);
	/*First way
	for(WebElement a : elements)
	{
		String countryNames = a.getText();
		System.out.println(countryNames);
	}
	*/	
	/*this is the 2nd way*/
	Iterator<WebElement> itr = elements.iterator();	
	while(itr.hasNext())
	{
		String values = itr.next().getText();
		System.out.println(values);
	}
	
	
	driver.quit();
	}
}







