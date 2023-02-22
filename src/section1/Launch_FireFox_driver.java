package section1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FireFox_driver {

	public static void main(String[] args) {
		
//System.setProperty("webdriver.gecko.driver", "D:\\Selenium folder\\geckodriver.exe");
		
		FirefoxDriver driver  = new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
	}
}
