package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class F1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.edureka.co/");
	driver.navigate().forward();
	driver.get("https://chromedriver.storage.googleapis.com/index.html?path=108.0.5359.71/");
	driver.navigate().forward();
	driver.get("chrome://whats-new/");
	driver.navigate().back();
	driver.quit();
	
	}

}
