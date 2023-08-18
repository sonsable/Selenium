package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Auto1 {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "chromedriver");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
//		driver.findElement(By.xpath("//button[@value='1']")).click();
		
//		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
//		driver.get("https://www.google.co.in/");
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("best places to visit in india");
////		driver.findElement(By.xpath("//input[@data-ved='0ahUKEwjb5eKXmrL3AhUPfnAKHWjGCngQ4dUDCAs']")).click();
//		driver.findElement(By.xpath("input[@jsaction='trigger.kWlxhc']")).click();
		
		//****************Locators name, id, class_name, tagname, linktext, partiallink text
		driver.get("https://is.rediff.com/signup/register");
		driver.findElement(By.tagName("input")).sendKeys("john snow"); //by tagname, full name field
	//	driver.findElement(By.name("fullname")).sendKeys("John snow");// by name, full name field
		driver.findElement(By.id("emailid")).sendKeys("john@gmail.com");//by id, email filed
		driver.findElement(By.id("pass")).sendKeys("abc@123"); //by id, password field
	
	driver.close();
	}}
