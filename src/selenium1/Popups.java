package selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.driver", "Chromdriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
//		WebElement button=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
//		button.click();
//		Thread.sleep(2000);
//		Alert a=driver.switchTo().alert();
//		Thread.sleep(2000);
//		String b=a.getText();
//		System.out.println(b);
//		a.accept();
		WebElement button=	driver.findElement(By.xpath("//a[@aria-expanded='true']"));
		button.click();
		Thread.sleep(1000);
		WebElement button2=driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		button2.click();
		Thread.sleep(1000);
		Alert a=driver.switchTo().alert();
		String b=a.getText();
		System.out.println(b);
		a.accept();
		driver.close();
	}

}
