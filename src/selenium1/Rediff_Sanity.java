package selenium1;
//**********************************SANITY TESTING BY AUTOMATION***********************************************
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rediff_Sanity {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webDriver.chrome.driver", "chromedriver");
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		System.out.println("SANITY TETSING ON REDIFF WEBPAGE");
		
//**************************TITLE AND URL OF WEBPAGE************************************************************
		
		driver.get("https://is.rediff.com/signup/register");
		
		Thread.sleep(00);
		
		System.out.println("********Webpage title & its verification**************");
		
		System.out.println("This is the title of web page :" +driver.getTitle()); 
		
		String correct_title="Rediff.com";
		
		String web_title=driver.getTitle();
		
		if(correct_title.equalsIgnoreCase(web_title))
			
		 {
			System.out.println("Title test case passed");
			
		 }
		
		else 
			
		 {
			System.out.println("Title test case failed");
		 }
		
			System.out.println("URL of webpage is :"+driver.getCurrentUrl());
		 
		 
//******************************ELEMENT IDENTIFICATION************************************************************
		 
		 
	System.out.println("*****Identifying Elements of Webpage*****");
	WebElement rediff_Link=driver.findElement(By.xpath("//a[@class='ft11']"));
	WebElement rediff_Logo=driver.findElement(By.xpath("//img[@class=\"halflogo\"]"));
	WebElement rediff_newUser=driver.findElement(By.xpath("//b[text()='New User? Register here']"));
	WebElement rediff_Tellus=driver.findElement(By.xpath("//p[@class='grey1']"));	
    WebElement rediff_FullName=driver.findElement(By.xpath("//div[text()='Your Full name']"));
    WebElement rediff_EmailId=driver.findElement(By.xpath("//div[text()='Your current email ID']"));		
    WebElement rediff_NewPass=driver.findElement(By.xpath("//div[text()='New password']"));
    WebElement rediff_RetypePass=driver.findElement(By.xpath("//div[text()='Retype password']"));
   	WebElement rediff_PassEg=driver.findElement(By.xpath("//p[text()='eg: myname@gmail.com,  myname@yahoo.com']"));
	WebElement rediff_Gender=driver.findElement(By.xpath("//div[text()='Gender:']"));
    WebElement rediff_GenderMale=driver.findElement(By.xpath("//input[@value='m']"));
    WebElement rediff_GenderFemale=driver.findElement(By.xpath("//input[@value='f']"));
    WebElement rediff_DOB=driver.findElement(By.xpath("//div[text()='Date of Birth']"));
    WebElement rediff_Date=driver.findElement(By.xpath("//select[@id='date_day']"));
    WebElement rediff_month=driver.findElement(By.xpath("//select[@id='date_mon']"));
    WebElement rediff_Year=driver.findElement(By.xpath("//select[@name='Date_Year']"));	
    WebElement rediff_Location=driver.findElement(By.xpath("//div[text()='Location']"));
   	WebElement rediff_School=driver.findElement(By.xpath("//div[text()='School']"));
   	WebElement rediff_College=driver.findElement(By.xpath("//div[text()='College']"));
   	WebElement rediff_Captcha=driver.findElement(By.xpath("//img[@id='img_captcha']"));
   	WebElement rediff_EnterCaptcha=driver.findElement(By.xpath("//div[text()='Enter the code given in the above image']"));		
    WebElement rediff_SignupButton=driver.findElement(By.xpath("//input[@id='btn_register']"));
    WebElement rediff_BottomImage=driver.findElement(By.xpath("//img[@alt='rediff on the net']"));
    WebElement rediff_InvestorLink=driver.findElement(By.xpath("//a[text()='Investor Information']"));
    WebElement rediff_AdLink=driver.findElement(By.xpath("//a[text()='Advertise with us']"));
    WebElement rediff_DisclaimerLink=driver.findElement(By.xpath("//a[text()='Disclaimer']"));
    WebElement rediff_PrivacyPolicyLink=driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
    WebElement rediff_FeedbackLink=driver.findElement(By.xpath("//a[text()='Feedback']"));
    WebElement rediff_TermsLink=driver.findElement(By.xpath("//a[text()='Terms of Use']"));
   			
//*******************To check whether identified elements are available or not************************************
			
    
    		int a=0; //******************a is the count of webpage elements
			
			if(rediff_Link.isDisplayed()) {System.out.println("Rediff link element is available");a++;}
			else {System.out.println("Rediff link element is not available");}
			
			if(rediff_Logo.isDisplayed()) {System.out.println("rediff Logo element is available");a++;}
			else {System.out.println("rediff Logo is not available");}
			
			if(rediff_newUser.isDisplayed()) {System.out.println("rediff new User element is available");a++;}
			else {System.out.println("rediff new User element is notavailable");}
			
			if(rediff_Tellus.isDisplayed()) {System.out.println("rediff Tellus sentence is available");a++;}
			else {System.out.println("rediff Tellus sentence is not available");}
			
			if(rediff_FullName.isDisplayed()) {System.out.println("rediff Full Name element is available");a++;}
			else {System.out.println("rediff Full Name element is available");}
			
			if(rediff_EmailId.isDisplayed()) {System.out.println("rediff Email Id element is available");a++;}
			else {System.out.println("rediff Email Id element is not available");}
			
			if(rediff_NewPass.isDisplayed()) {System.out.println("rediff New Password element is available");a++;}
			else {System.out.println("rediff New Password element is not available");}
			
			if(rediff_RetypePass.isDisplayed()){System.out.println("rediff Retype Password  is available");a++;}
			else {System.out.println("rediff Retype Password element is not available");}
			
			if(rediff_PassEg.isDisplayed()) {System.out.println("rediff_PassEg is present");a++;}
			else {System.out.println("rediff_PassEg is not present");}
			
			if(rediff_Gender.isDisplayed()) {System.out.println("rediff_Gender is present");a++;}
			else {System.out.println("rediff_Gender is not present");}
			
			if(rediff_GenderMale.isDisplayed()) {System.out.println("rediff_GenderMale is present");a++;}
			else {System.out.println("rediff_GenderMale is not present");}
			
			if(rediff_GenderFemale.isDisplayed()) {System.out.println("rediff_GenderFemale is present");a++;}
			else {System.out.println("rediff_GenderFemale is not present");}
			
			if(rediff_DOB.isDisplayed()) {System.out.println("rediff_DOB is present");a++;}
			else {System.out.println("rediff_DOB is missing");}
			
			if(rediff_Date.isDisplayed()) {System.out.println("rediff_Date is present");a++;}
			else {System.out.println("rediff_Date is missing");}
			
			if(rediff_month.isDisplayed()) {System.out.println("rediff_month is present");a++;}
			else {System.out.println("rediff_month is missing");}
			
			if(rediff_Year.isDisplayed()) {System.out.println("rediff_Year is present");a++;}
			else {System.out.println("rediff_Year is missing");}
			
			if(rediff_Location.isDisplayed()) {System.out.println("rediff_Location is present");a++;}
			else {System.out.println("rediff_Location is missing");}
			
			if(rediff_School.isDisplayed()) {System.out.println("rediff_School is present");a++;}
			else {System.out.println("rediff_School is missing");}
			
			if(rediff_College.isDisplayed()) {System.out.println("rediff_College is present");a++;}
			else {System.out.println("rediff_College is missing");}
			
			if(rediff_Captcha.isDisplayed()) {System.out.println("rediff_Captcha is present");a++;}
			else {System.out.println("rediff_Captcha is missing");}
			
			if(rediff_EnterCaptcha.isDisplayed()) {System.out.println("rediff_EnterCaptcha is present");a++;}
			else {System.out.println("rediff_EnterCaptcha is missing");}
			
			if(rediff_SignupButton.isDisplayed()) {System.out.println("rediff_SignupButton is present");a++;}
			else {System.out.println("rediff_SignupButton is missing");}
			
			if(rediff_BottomImage.isDisplayed()) {System.out.println("rediff_BottomImage is present");a++;}
			else {System.out.println("rediff_BottomImage is missing");}
			
			if(rediff_BottomImage.isDisplayed()) {System.out.println("rediff_BottomImage is present");a++;}
			else {System.out.println("rediff_BottomImage is missing");}
			
			if(rediff_InvestorLink.isDisplayed()) {System.out.println("rediff_InvestorLink is present");a++;}
			else {System.out.println("rediff_InvestorLink is missing");}
			
			if(rediff_AdLink.isDisplayed()) {System.out.println("rediff_AdLink is present");a++;}
			else {System.out.println("rediff_AdLink is missing");}
			
			if(rediff_AdLink.isDisplayed()) {System.out.println("rediff_AdLink is present");a++;}
			else {System.out.println("rediff_AdLink is missing");}
			
			if(rediff_DisclaimerLink.isDisplayed()) {System.out.println("rediff_DisclaimerLink is present");a++;}
			else {System.out.println("rediff_DisclaimerLink is missing");}
			
			if(rediff_PrivacyPolicyLink.isDisplayed()) {System.out.println("rediff_PrivacyPolicyLink is present");a++;}
			else {System.out.println("rediff_PrivacyPolicyLink is missing");}
			
			if(rediff_FeedbackLink.isDisplayed()) {System.out.println("rediff_FeedbackLink is present");a++;}
			else {System.out.println("rediff_FeedbackLink is missing");} 
			
			if(rediff_TermsLink.isDisplayed()) {System.out.println("rediff_TermsLink is preseny");a++;}
			else {System.out.println("rediff_TermsLink is missing");}
			
			System.out.println("Total count of webpage elements is :"+a);
			
			driver.close();
	}}
