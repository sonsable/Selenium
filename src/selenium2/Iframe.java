package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver( option);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
		driver.switchTo().frame("iframeResult");
		
		WebElement btn = driver.findElement(By.xpath("//button[@type='button']"));
		btn.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		WebElement home = driver.findElement(By.xpath("//a[@id='tryhome']"));
		home.click();
		
		
		Thread.sleep(1000);
		
		
		
	//	driver.quit();

	}

}
