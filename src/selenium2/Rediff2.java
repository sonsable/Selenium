package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rediff2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://is.rediff.com/signup//register");
		
		//*****************LINK TEXT LOCATOR******************//
		
		 WebElement link = driver.findElement(By.linkText("Investor Information"));
		 link.click();
		
		WebElement l1 = driver.findElement(By.linkText("Terms of Use"));
		l1.click();
		
		
		 
		 //*****************PARTIAL LINK TEXT LOCATOR********************//
		 
		 WebElement link2 = driver.findElement(By.partialLinkText("Privacy"));

		 link2.click();
		 
		 WebElement link3 = driver.findElement(By.partialLinkText("Information"));
		 link3.click();
		
		//*****************************OTHER LOCATORS******************************//
		
		
		WebElement name = driver.findElement(By.name("fullname")); //NAME LOCATOR
		name.sendKeys("sona");
		
		WebElement email = driver.findElement(By.id("emailid")); //ID LOCATOR
		email.sendKeys("sona123@reddit");
		
		WebElement tagname = driver.findElement(By.tagName("input")); //TAGNAME LOCATOR
		tagname.sendKeys("so");
		
//*************CLASS NAME LOCATOR IS VERY TRICKY, EVERYWHERE ITS DUPLICATE BUT BELOW IS WORKING********//
		
		WebElement name2 = driver.findElement(By.className("txtbox1"));
		
		name2.sendKeys("sona123");
		
	}

}
