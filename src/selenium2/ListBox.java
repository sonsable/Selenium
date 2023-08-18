package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdiver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement box1 = driver.findElement(By.xpath("//select[@id='first']"));
		//WebElement box2 = driver.findElement(By.xpath("//select[@id='animals']"));
		
		Select s= new Select(box1);
	//	s.selectByVisibleText("Google");
	//	s.selectByIndex(2);
	//	s.selectByValue("Yahoo");
	//	s.getAllSelectedOptions();
		
		
		List<WebElement> allOption = s.getOptions(); //HERE WE NEED TO STORE THESE ALL OPTIONS SOMEWHERE
		//SO STORED IN ALLOPTION VARIABLE NOW to print it we need to use loop
		
	//####################### BELOW IS FOR EACH LOOP######################//
		for(WebElement value:allOption) 
		{
			System.out.println(value.getText());
		}
		
		//####################### BELOW IS NORMAL FOR LOOP##################//
		//BOTH WAYS WE CAN GET LIST OF ALL OPTIONS PRESENT IN LIST BOX
		
		for(int i=0;i<=3;i++)
		{
			System.out.println("---------------------------------------");//this is just to separate lines
			System.out.println(allOption.get(i).getText());
		}
		
		driver.quit();
		
		
		
		
	}

}
