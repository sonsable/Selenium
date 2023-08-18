package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public	static	void main(String[]	args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		//Locator	=	tagname
		driver.findElement(By.tagName("input")).sendKeys("Ron");
		//Locator	=	ID
		driver.findElement(By.id("fullname")).sendKeys("Harry");
		//Locator	=	Class	name
		driver.findElement(By.className("txtbox1")).sendKeys("Velocity");
		//xpath	by	attribute
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Potter"	);
		//xpath	by	contains
		driver.findElement(By.xpath("//input[contains(@name,'em')]")).sendKeys("harry@gmail.com");
		Thread.sleep(3000);
		//xpath	by	index
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Pune");
		//xpath	by	text
		driver.findElement(By.xpath("//a[text()='Advertise	with	us']")).click();
		//Locator	=	linktext
		driver.findElement(By.linkText("CompleteLinkText"));
		//Locator	=	partiallinktext
		driver.findElement(By.partialLinkText("Complete"));
		driver.findElement(By.linkText("feedback"));
		}}
