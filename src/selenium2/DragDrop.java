package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeOptions o=new ChromeOptions();
	o.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(o);
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(frame);
	Thread.sleep(1000);
	
	WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	
	WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	
	WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
	
	WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
	
		
	Actions a=new Actions(driver);
	
	a.moveToElement(img1).clickAndHold().moveToElement(trash).release().build().perform();
	Thread.sleep(1000);
	a.moveToElement(img2).clickAndHold().moveToElement(trash).release().build().perform();
	
	//-----------------------------------------------------------------------------------------//
	//	------ANOTHER METHOD TO DRAG DROP-----------------------------------
	
	a.dragAndDrop(img3, trash).build().perform();
	a.dragAndDrop(img4, trash).build().perform();
	
	
	
	
	
	}

}
