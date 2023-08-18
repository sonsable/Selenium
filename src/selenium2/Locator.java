package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement id = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"]"));
		
		WebElement id1 = driver.findElement(By.xpath("//input[contains(@name,'em')]"));//xpath by contains
		
		WebElement id2= driver.findElement(By.xpath("//*[@id=\"email\"]")); //automatic copied xpath directly, never do this
		
		id2.sendKeys("9881253053");
		
		WebElement pass = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _9npi inputtext _9npi\"]"));
		WebElement pass2 = driver.findElement(By.xpath("(//input[@id='pass'][1])"));//contains xpath
		pass.sendKeys("bodyguard");
		
		WebElement login = driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy\"]"));
	   
	  
	    WebElement login2 = driver.findElement(By.xpath("//button[contains(@id,'lo')]"));//contains xpath
	    
	    login.click();
	    driver.quit();
	  
		WebElement frgtAcc = driver.findElement(By.xpath("//a[@class=\"_97w4\"]"));
		
		frgtAcc.click();
		Thread.sleep(3000);
		
		WebElement MoNo = driver.findElement(By.xpath("//input[@class=\"inputtext _9o1w\"]"));
		MoNo.sendKeys("9881253053");
		
		WebElement srch = driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _9nq0 textPadding20px _4jy3 _4jy1 selected _51sy\"]"));
		srch.click();
		
	}

}
