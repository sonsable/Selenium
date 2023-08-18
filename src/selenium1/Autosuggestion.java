package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@type='text']"));
		searchbar.sendKeys("ear");
		
		Thread.sleep(2000);
		
	List<WebElement> autosuggest = driver.findElements(By.xpath("//div[@class='OBMEnb']//li"));
	
	for(int i=0;i<=autosuggest.size();i++)
	{
		System.out.println(autosuggest.get(i).getText());
		String expected="earrings";
		String actual=autosuggest.get(i).getText();
		
		if(expected.equals(actual))
		{
			autosuggest.get(i).click();
			break;
		}
		
	}
		
		driver.close();

	}

}
