package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDiv {
	//---------------HIDDEN DIVISION POPUP ARE COLORFUL, WE CAN INSPECT THEM---------------------//

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		driver.get("https://www.edureka.co/");
		
		Thread.sleep(3000);
		
		WebElement moNo = driver.findElement(By.xpath("//input[@class='form-control popusrphn new-duq-mobile-in']"));
		
		WebElement email = driver.findElement(By.xpath("//input[@class='form-control popusreml new-duq-email-in']"));
		
		WebElement query = driver.findElement(By.xpath("//textarea[@class='form-control new-duq-query-in']"));
		
		moNo.sendKeys("8878934577");
		Thread.sleep(1000);
		email.sendKeys("ryan123@gmail.com");
		Thread.sleep(1000);
		query.sendKeys("i want to know about cucumber framework and api testing courses");
		
	}

}
