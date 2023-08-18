package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
	
	//-----IF WE TRY TO UPLOAD FILE THEN WE CANT CLICK ON UPLOAD BUTTON, WE HAVE TO USE SENDKEYS AND GIVE PATH OF
	//FILE THAT WE WANT TO UPLOAD
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver( option);
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //---IMPLICIT WAIT NEED TO WRITE ONLY ONCE IN 
		//PROGRAM, IT WILL WAIT UNTIL SPECIFIC TIME SET, IF IT GOT THE ELEMENT BEFORE THAT TIME THEN IT WILL MOVE FURTHER
		//IN PROGRAM THIS IS DIFF BETWEEN STATIC WAIT AND IMPLICIT WAIT.
		
		WebElement filebtn = driver.findElement(By.xpath("//input[@name='upfile']"));
		
		
		filebtn.sendKeys("C:\\Users\\Sonali Sable\\Desktop\\imp\\AUTOMATION NOTES\\JAVA");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("This is a Java program pdf file");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	

	}

}
