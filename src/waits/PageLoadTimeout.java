package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadTimeout {

	//THIS IS ALSO CALLED AS PERFORMANCE TESTING OR LOAD TESTING
	
	public static void main(String[] args) {
		
		//-----------HERE IT GIVES TIMEOUT EXCEPTION BCZ THIS SITE FAILS TO LOAD WITHIN 10 SEC.

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver( option);
		
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS); //HERE TIME  IS IN SECONDS
		
		//this cnn site require 60+ sec to load
		
		driver.get("https://edition.cnn.com/");
		
		driver.close();
	}

}
