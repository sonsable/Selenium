package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadTimeout2 {
	
//THIS IS ALSO CALLED AS PERFORMANCE TESTING OR LOAD TESTING	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver( option);
		
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS); //HERE TIME 15 IS IN SECONDS
		driver.get("https://www.amazon.in/");
		driver.close();
		
		//---------amazon site gets load within 15 sec easily, but cnn site require 60+ sec to fully load

	}

}
