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

public class RediffXL {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

	//##################REDIFF EXCEL##########################
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://is.rediff.com/signup//register");
		
		WebElement name = driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement repass = driver.findElement(By.xpath("//input[@name='repass']"));
		WebElement gender = driver.findElement(By.xpath("//input[@value='f']"));
		WebElement loc = driver.findElement(By.xpath("//input[@id='signup_city']"));
		WebElement school = driver.findElement(By.xpath("//input[@id='school']"));
		WebElement clg = driver.findElement(By.xpath("//input[@id='college']"));
		
		FileInputStream file=new FileInputStream("C:\\Users\\Sonali Sable\\eclipse-workspace\\selenium\\testData\\data1.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet4");
		
		name.sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		email.sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
		pass.sendKeys(sheet.getRow(2).getCell(0).getStringCellValue());
		repass.sendKeys(sheet.getRow(3).getCell(0).getStringCellValue());
		gender.click();
		loc.sendKeys(sheet.getRow(4).getCell(0).getStringCellValue());
		school.sendKeys(sheet.getRow(5).getCell(0).getStringCellValue());
		clg.sendKeys(sheet.getRow(6).getCell(0).getStringCellValue());
		
	}

}
