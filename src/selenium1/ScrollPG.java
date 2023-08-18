package selenium1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPG {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chromr.driver", "Chromedriver");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americangolf.com/");
		
		JavascriptExecutor a=((JavascriptExecutor)driver);
		a.executeScript("windows.scrollBy(0,1000)");
		Thread.sleep(1000);
				
	}

}
