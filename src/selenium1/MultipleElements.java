package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class MultipleElements{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("all links count =" +links.size());
//		
//		for(int i=0;i<=links.size();i++) 
//		{
//	    System.out.println(links.get(i).getText());
//	    
//	    }
		
		for(int j=0;j<=links.size();j++)
		{
			String expected="Advertising";
			String actual=links.get(j).getText();
			
			if(expected.equals(actual))
					{
				links.get(j).click();
				Thread.sleep(2000);
				break;
					}
				}
		System.out.println("Title = " + driver.getTitle());
		Thread.sleep(3000);
		driver.close();

}
}