package selenium1;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ScreenShot{
	
	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gaana.com/");
		
		File from=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(from);
		File to=new File("C:\\Users\\Sonali Sable\\eclipse-workspace\\selenium\\Screenshot/picture.jpg");
		org.openqa.selenium.io.FileHandler.copy(from, to);
		FileUtils.copyFile(from, to);
		driver.close();
		

	
	
	}
	
}
