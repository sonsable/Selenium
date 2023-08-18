package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locator1 {
	
	//*********************************************************************************************//
	// SO CLASSNAME LOCATOR SPECIFICALLY HERE BECAUSE NOT FOUND UNIQUE IN REDIFF SITE, SO USING FB SITE//
	//********************************************************************************************//
	
	//done everything but its giving error//

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/login/");
	
		WebElement pass = driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi"));
		//CLASSNAME LOCATOR 
		
		pass.sendKeys("sona123");

	
		//done everything but its giving error//
		
		//*************************TAGNAME************************//
		
	 driver.findElement(By.tagName("input")).sendKeys("sonali123");
	 
	
	
	}

}
