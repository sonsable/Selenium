package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("John Snow");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("KingInTheNorth@GOT.com");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("newpass");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='repass']")).sendKeys("newpass");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='m']")).click();
		//********************************//
		
		WebElement daylistbox = driver.findElement(By.xpath("//select[@name='date_day']"));// webelement is a interface
		Select a=new Select(daylistbox);
		a.selectByValue("15");
		Thread.sleep(500);
		WebElement monthlistbox = driver.findElement(By.xpath("//select[@name='date_mon']"));
		Select b=new Select(monthlistbox); //select is a class
		b.selectByVisibleText("FEB");
		Thread.sleep(500);
		WebElement yearlistbox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select c=new Select(yearlistbox);
		c.selectByVisibleText("1990");
		Thread.sleep(1000);
		//********************************//
		driver.findElement(By.xpath("//input[@id='signup_city']")).sendKeys("Winterfell");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@onfocus='validateSignupForm(4)']")).sendKeys("House of Starks Education");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@onfocus='validateSignupForm(5)']")).sendKeys("North Kingdom University");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1500);
		driver.close();
		
		
		
	}

}
