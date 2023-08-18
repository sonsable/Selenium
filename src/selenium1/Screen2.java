package selenium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screen2 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://wynk.in/music/artist/b-praak/wa_29319519?q=praak");
		
		File from = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File to=new File("C:\\Users\\Sonali Sable\\eclipse-workspace\\selenium\\Screenshot/new.jpg");
		FileHandler.copy(from, to);
		
		driver.close();
		
	}

}
