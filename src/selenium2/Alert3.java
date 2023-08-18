package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
		driver.findElement(By.id("Register")).click();
		
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
