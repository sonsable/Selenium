package selenium2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FbExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/login/");
		
		WebElement id = driver.findElement(By.xpath("//input[@type='text']"));
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
	FileInputStream f=new FileInputStream("C:\\Users\\Sonali Sable\\eclipse-workspace\\selenium\\testData\\data1.xlsx");
		
	Sheet x = WorkbookFactory.create(f).getSheet("Sheet3");
	
	id.sendKeys(x.getRow(0).getCell(0).getStringCellValue());
	pass.sendKeys(x.getRow(0).getCell(1).getStringCellValue());
	login.click();
		
	}

}
