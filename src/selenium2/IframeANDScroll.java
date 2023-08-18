package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeANDScroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		WebElement srch1 = driver.findElement(By.name("s"));
		srch1.sendKeys("shop");
	
		Thread.sleep(1000);
		
		driver.switchTo().frame("globalSqa");
		WebElement srch2 = driver.findElement(By.xpath("//input[@id='s']"));
		srch2.sendKeys("keeper");
		
		driver.switchTo().parentFrame();
		srch1.clear();
		srch1.sendKeys("waste");
//-------------------------------------------------------------------------------------------------------------//
		//here we are unable to click srch icon,
		//getting this error :Exception in thread "main" org.openqa.selenium.ElementClickInterceptedException: 
		//element click intercepted: Element is not clickable at point (964, -20)
		// so in this we need to use javascript executor, 
		//also we can scroll up using js executor, lets see how below.
		
		
		WebElement btn = driver.findElement(By.xpath("//button[@class=\"button_search\"]"));
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", btn);
		
//		btn.click();             this is not allowing to click
		
		
	}

}
