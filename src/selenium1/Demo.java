package selenium1;

//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		//driver.manage().window().maximize();
//		Thread.sleep(1000);
//		Dimension d=new Dimension(300,2000);
//		
//		driver.manage().window().setSize(d);
//		Thread.sleep(1000);
//		
//		Point p=new Point(200,200);
//		driver.manage().window().setPosition(p);
//		Point posi = driver.manage().window().getPosition();
//		System.out.println("Position of webpage is :"+posi);
//		System.out.println(driver.manage().window().getPosition());//***other way of printing getposition,
//		//same can work with getsize
//		Dimension size = driver.manage().window().getSize();
//		System.out.println("size of the webpage is :" +size);
//		Thread.sleep(1000);
		
		driver.close();	}}
