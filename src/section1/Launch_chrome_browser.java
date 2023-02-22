package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chrome_browser {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");		
	String title = 	driver.getTitle();
	
		System.out.println("webpage title is : " + title);
	}
}





