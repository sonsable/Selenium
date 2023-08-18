package selenium2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Open Popup']")).click();
		
		
    	Set<String> a = driver.getWindowHandles();
    	
        Iterator<String> b = a.iterator();
        
        String count[]=new String[5];
        
        System.out.println(a.size());
        
		
		driver.quit();
		
		
	}

}
