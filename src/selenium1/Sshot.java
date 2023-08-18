package selenium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sshot {

	public static void main(String[] args) throws IOException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Sonali%20Sable/Desktop/imp/MANUAL%20NOTES/User-Stories-ATM.pdf");
			
			File from = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File to=new File("C:\\Users\\Sonali Sable\\eclipse-workspace\\selenium\\Screenshot.jpg");
			FileHandler.copy(from, to);
			
			
			
	}

}
