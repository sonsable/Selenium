package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class List2 {

	public static void main(String[] args) throws InterruptedException {
		
//-------------------------LIST BOX SINGLE SELECTABLE OR MULTI SELECTABLE----//REDIFF SITE//---------------------------//
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver( option);
		
//		driver.get("https://is.rediff.com/signup//register");
//		 WebElement yr = driver.findElement(By.xpath("//select[@name='Date_Year']"));
//		Select s= new Select(yr);
//		System.out.println(s.isMultiple()); 
//		driver.quit();
//---------------------------------------------------------------------------------------------------//
		//-------------------ANOTHER SITE FOR ISMULTIPLE LIST BOX-----------------------------//
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		//there is iframe so need to identify and change selenium focus to it first//
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(frame);
		
		WebElement cars = driver.findElement(By.xpath("//select[@name='cars']"));
		
		Select s= new Select(cars);
		System.out.println(s.isMultiple());
		s.selectByVisibleText("Saab");
		Thread.sleep(1000);
		s.selectByVisibleText("Audi");
		
		Thread.sleep(1000);

//---------------------------------------------------------------------------------------------------------//
//---------------below deselect methods only applicable for multi select list box----------//
		
//		s.deselectAll();  /                  
//		s.deselectByVisibleText("Audi");     this is single select list box
		
//		s.deselectByIndex(0);
//		s.deselectByValue("Saab");
		
//-----------------------------------------------------------------------------------------------------------//
		//------------GETTING ALL SELECTED OPTIONS if multiple options are selected below code------------//
		
	    List<WebElement> value = s.getAllSelectedOptions();	

		for(WebElement a:value)
		{
			
			System.out.println(a.getText());
		}
		
//------------------------------------------------------------------------------------------------------------//
		//---------------------GET FIRST SELECTED OPTION-------------------------//
		
		WebElement f = s.getFirstSelectedOption();
		
		System.out.println(f.getText());
		
	}

}
