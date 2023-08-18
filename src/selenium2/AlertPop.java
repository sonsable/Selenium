package selenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement custID = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		
		custID.sendKeys("7956465");
		submit.click();
		
		Thread.sleep(1000);
		
	    Alert apop = driver.switchTo().alert();
        apop.accept();
//	    apop.dismiss();
	    
	    String text = apop.getText();
	    System.out.println(text);
		
	}

}
