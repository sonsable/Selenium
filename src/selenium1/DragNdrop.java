package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNdrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
				driver.switchTo().frame(frame);
	WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
	
	//Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.moveToElement(image1).clickAndHold().moveToElement(trash).release().build().perform();
	a.moveToElement(image2).clickAndHold().moveToElement(trash).release().build().perform();
	a.moveToElement(image3).clickAndHold().moveToElement(trash).release().build().perform();
	
//	a.dragAndDrop(image1,	trash).build().perform();
//	a.dragAndDrop(image2,	trash).build().perform();
//	a.dragAndDrop(image3, trash).build().perform();
	driver.close();
	}

}
