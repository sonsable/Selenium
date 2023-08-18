package selenium2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		driver.get("https://www.testquality.com/blog/tpost/ci5pvsurc1-different-types-of-selenium-webdriver-co");
		
		
		JavascriptExecutor j=((JavascriptExecutor)driver);
	//	j.executeScript("window.scrollBy(0,3000)");
		
	//BELOW CODE SCROLLS DOWN TILL BOTTOM OF PAGE	
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //SCROLL DOWN TILL BOTTOM
		
		
	}

}
