package selenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//----MULTIPLE POPUPS----WE CAN  ALSO USE SENDKEYS WITH ALERT

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement btn1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		
		btn1.click();
		
		Alert alert = driver.switchTo().alert();
		
		String v1 = alert.getText();
		System.out.println(v1);
		alert.accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		WebElement btn2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		btn2.click();
		
		Thread.sleep(1000);
		
		String v2 = alert.getText();
		System.out.println(v2);
		alert.dismiss();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		WebElement btn3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btn3.click();
		
		String v3 = alert.getText();
		System.out.println(v3);
		alert.sendKeys("hello there, I am the automation tester");// WE CAN SEND DATA TO ALERT
		
	
		alert.accept();
		
		Thread.sleep(2000);
		
		WebElement alertText = driver.findElement(By.xpath("//P[@ID='demo1']"));
		
		System.out.println(alertText.getText());
		
		
	}

}
