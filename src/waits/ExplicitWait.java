package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	//---------------ITS DYNAMIC WAIT----------
	
//--IN EXPLICIT WAIT WE NEED TO CREATE OBJECT OF WEBDRIVERWAIT CLASS	
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver( option);
		
		driver.get("https://chercher.tech/practice/explicit-wait");
		
		driver.manage().window().maximize();
		
//----------------------------------------------------------------------------------------------------//
		
	    WebElement btn1 = driver.findElement(By.xpath("//button[@id='alert']"));
		
	    btn1.click();
	    
	    WebDriverWait wait=new WebDriverWait(driver, 50); //50 is a max time limit given, but if element is found early 
	    //then it moves to next line
	    
	    wait.until(ExpectedConditions.alertIsPresent());  //ExpectedConditions is a class , same name interface 
	  //  also present in files, but always choose the class
		
		 driver.switchTo().alert().accept();
		 		
//-----------------------------------------------------------------------------------------------------//
		 
		WebElement btn2 = driver.findElement(By.xpath("//button[@id='populate-text']"));
		 
		btn2.click();
		
		WebElement textChange = driver.findElement(By.xpath("//h2[@id='h2']"));
		
		wait.until(ExpectedConditions.textToBePresentInElement(textChange, "Selenium Webdriver"));
		
		
//------------------------------------------------------------------------------------------------------//
		
		WebElement btn3 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		
		btn3.click();
		
		WebElement hiddenBtn1 = driver.findElement(By.xpath("//button[@id='hidden']")); //this is hidden button
		
		wait.until(ExpectedConditions.visibilityOf(hiddenBtn1)); //--THIS IS FOR SINGLE ELEMENT
		wait.until(ExpectedConditions.visibilityOfAllElements(hiddenBtn1)); //-THIS IS FOR MULTIPLE ELEMENTS
		
//------------------------------------------------------------------------------------------------------//
		
		WebElement btn4 = driver.findElement(By.xpath("//button[@id='enable-button']"));
		
		btn4.click();
		
		WebElement hiddenBtn2 = driver.findElement(By.xpath("//button[@id='disable']"));
		
		wait.until(ExpectedConditions.visibilityOf(hiddenBtn2));
		
//-------------------------------------------------------------------------------------------------------//
		
		WebElement btn5 = driver.findElement(By.xpath("//button[@id='checkbox']"));
		btn5.click();
		
		WebElement chkbox = driver.findElement(By.xpath("//input[@id='ch']"));
		
		wait.until(ExpectedConditions.visibilityOf(chkbox));
		
		driver.close();
		
	}
	
	
	

}
