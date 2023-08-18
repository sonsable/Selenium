package selenium1;

//import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "Chrome driver");
		WebDriver driver=new ChromeDriver();//up casting
		
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(1000);
		driver.get("https://youtube.com/");
		driver.navigate().to("https://www.edureka.co/");
		driver.navigate().to("https://gaana.com/");
				
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
//		//******************xpath methods****************
//		//xpath by index
//		String a =driver.findElement(By.xpath("(//div[@class=\"col1\"])[4]")).getText();
//		System.out.println(a);
//		//xpath by contains
//		driver.findElement(By.xpath("//input[contains(@name,'fu')]")).sendKeys("this is full name by contains");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[contains(@name,'ci')]")).sendKeys("this is location by contains");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[contains(@name,'em')]")).sendKeys(" email by contains");
//		
		driver.close();
		
	}}
