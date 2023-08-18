package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//------------------------------------------------------------------------------------------------------------------
// GET ALL OPTIONS FROM LIST 

public class List1 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver( option);
		
		driver.get("https://is.rediff.com/signup//register");
		
		WebElement yr = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		
		Select s= new Select(yr);
		
		
		for(int i=0;i<=100;i++)
		{
			System.out.println(s.getOptions().get(i).getText());
		}
		
		System.out.println("########################");
		
		
		
		Thread.sleep(2000);
	
	
		List<WebElement> value = s.getOptions();
		
		for(WebElement v:value)
		{
			System.out.println(v.getText());
			
		}
	
		
		driver.quit();
		
	}

}
