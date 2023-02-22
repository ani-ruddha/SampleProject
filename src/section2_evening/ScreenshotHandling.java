package section2_evening;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class ScreenshotHandling {
	public static void main(String[] args) throws Exception {		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.flipkart.com/");		
		TakesScreenshot ts = (TakesScreenshot)driver;		
	File src =	ts.getScreenshotAs(OutputType.FILE);	
	File dest = new File("D:\\Selenium folder\\Abc.png");	
	Files.copy(src, dest);	
	driver.findElement(By.xpath("sgcvavscgvascgvags")).click();
	}
}







