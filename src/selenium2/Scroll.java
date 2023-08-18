package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		
		driver.get("https://www.flipkart.com/");
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		// login popup is coming here (sometime it doesn't appear)
		//so we are first closing that and later scroll
		
		close.click();
		Thread.sleep(1000);
		
		JavascriptExecutor j= ((JavascriptExecutor)driver); 
		
		j.executeScript("window.scrollBy(0,2000)");  //scroll down by 2000 pixels
		
		

	}

}
