package xpath_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootCase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.msn.com/en-in/?AR=1");
Thread.sleep(3000);
		WebElement element =driver.findElement
		(By.xpath("//entry-point[@instance-id='EntryPointHpWC']"));
	SearchContext el1 =	element.getShadowRoot();
	Thread.sleep(3000);
WebElement element2 = 	el1.findElement(By.cssSelector
	("div.default-feed-nav-container>feed-navigation-hp[instance-id='FeedNavigationHp']"));
	SearchContext el2 =	element2.getShadowRoot();
	Thread.sleep(3000);
WebElement element3 =el2.findElement(By.cssSelector("feed-navigation[role='navigation']"));
SearchContext el3 =element3.getShadowRoot();
Thread.sleep(3000);
WebElement element4 =el3.findElement(By.cssSelector("feed-navigation-item[id='entertainment']"));	
	element4.click();
	
	}
}








