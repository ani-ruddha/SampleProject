package section1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Program1 {
	public static void main(String[] args) {		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\"
		+ "chromedriver.exe");		
ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");		
	String url =	driver.getCurrentUrl();
	
	System.out.println("url is : " + url);
	
		String srcCode =	driver.getPageSource();
		
		System.out.println(srcCode);
	}
}
