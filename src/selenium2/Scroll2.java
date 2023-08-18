package selenium2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll2 {

	//----------------------------ANOTHER EXAMPLE FOR SCROLL DOWN AND UP-----------------------//
	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		
		driver.get("https://reqres.in/");
		
		JavascriptExecutor j=((JavascriptExecutor)driver);
		
		j.executeScript("window.scrollBy(0,3000)");//scroll down
		
		Thread.sleep(1000);
		
		j.executeScript("window.scrollBy(0,-1000)"); //scroll up

	}

}
