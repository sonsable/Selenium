package selenium1;

import java.io.FileInputStream; 
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff_with_Excel {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException    {
		
		System.setProperty("webDriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(1000);
	WebElement fullname = driver.findElement(By.xpath("//input[@id='fullname']"));
	WebElement emailId = driver.findElement(By.xpath("//input[@name='emailid']"));	
	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	WebElement retypePass = driver.findElement(By.xpath("//input[@name='repass']"));
	//driver.findElement(By.xpath("//input[@value='m']")).click();
//  WebElement listbox = driver.findElement(By.xpath("//select[@name='date_day']"));
//	WebElement birthMonth = driver.findElement(By.xpath("//select[@name='date_mon']"));
//	WebElement birthYear = driver.findElement(By.xpath("//select[@name='Date_Year']"));
	WebElement location = driver.findElement(By.xpath("//input[@id='signup_city']"));
	WebElement school = driver.findElement(By.xpath("//input[@onfocus='validateSignupForm(4)']"));
	WebElement college = driver.findElement(By.xpath("//input[@onfocus='validateSignupForm(5)']"));
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		FileInputStream file=new FileInputStream("C:\\Users\\Sonali Sable\\eclipse-workspace\\selenium\\testData\\test3.xlsx");
		Sheet a=WorkbookFactory.create(file).getSheet("Sheet1");


		Thread.sleep(1000);
		fullname.sendKeys(a.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		emailId.sendKeys(a.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
        password.sendKeys(a.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
        retypePass.sendKeys(a.getRow(0).getCell(3).getStringCellValue());
//		Thread.sleep(1000);
//		location.sendKeys(a.getRow(0).getCell(4).getStringCellValue());
//		Thread.sleep(1000);
//		school.sendKeys(a.getRow(0).getCell(5).getStringCellValue());
//		Thread.sleep(1000);
//		college.sendKeys(a.getRow(0).getCell(6).getStringCellValue());
		
//		Select b=new Select(listbox);
//		b.selectByVisibleText(a.getRow(0).getCell(7).getStringCellValue());
		
		
		
		driver.close();
	}}
