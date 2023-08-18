package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DragNdrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		//------------------------------------------------------------------//
		//COMPLETE THIS PROGRAM,ALSO WATCH LECTURE
		
	}

}
