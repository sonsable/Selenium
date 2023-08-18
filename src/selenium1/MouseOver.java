package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromr.driver", "Chromedriver");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americangolf.com/");
		
		WebElement	aboutUsLink	=driver.findElement(By.xpath("//a[text()='About Us']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(aboutUsLink).build().perform();
		
		WebElement careerLink = driver.findElement(By.xpath("//li[@class='leaf']//a[text()='Careers']"));
		careerLink.click();
		
	//	WebElement bloglink = driver.findElement(By.xpath("//a[@title='American Golf Blog']"));
		
	//	bloglink.click();
	
		driver.close();
	}

}
