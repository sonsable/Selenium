package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);	
		
	driver.get("https://is.rediff.com/signup//register");
	
	//************************below code is for xpath by text but it can only identiify the element
	 //we cant put value in it , we can get text of it, we cant send values********************
	
	 String loc = driver.findElement(By.xpath("//div[text()='Location']")).getText();
	// so here output we get is a string that is location that is a field name
	
	//****************below is the XPATH BY TEXT EXAMPLE, WE WILL CLICK LINK BY IT***********************
	 //************* text is values in between < and > symbol
	 
	 WebElement link = driver.findElement(By.xpath("//a[text()='Advertise with us']"));//xpath by text
	 link.click();
	 Thread.sleep(3000);
	
	driver.quit();
	
	
	}

}
