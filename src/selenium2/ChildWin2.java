package selenium2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildWin2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
	    Set<String> win = driver.getWindowHandles();
		
		Iterator<String> itr = win.iterator();
		String a[]=new String[5];
		
		for(int i=0;i<win.size();i++)
		{
			a[i]=itr.next();
			System.out.println(a[i]);
		}
		System.out.println("total windows are "+win.size());
		
//------------------------------------SWITCHED SELENIUM FOCUS TO WINDOWS---------------------------------
		
		driver.switchTo().window(a[1]);//here we switched to 2nd window, AT[0] IS OUR MAIN WINDOW
		//below operations are performed on 2nd win
		
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.manage().window().maximize();  //2ND WINDOW GETS MAXIMIZE
	
		WebElement home = driver.findElement(By.xpath("//span[text()='Home']"));
		home.click();
		Thread.sleep(1000);
		
		WebElement freeCourses = driver.findElement(By.xpath("//span[text()='Watch free courses']"));
		freeCourses.click();
		
		System.out.println(driver.getTitle());
		
//		driver.close();	//2nd window gets close
		driver.quit();
	}

}
