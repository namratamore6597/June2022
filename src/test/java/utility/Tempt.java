package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 

{
	
	public static void main(String[]args) throws InterruptedException
	
	{

		System.setProperty("webdriver.chrome.driver","E:\\Automation support\\chromedriver.exe");
		
		//launch browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open application
		driver.get("https://www.flipkart.com/");
		
		//enter username
		driver.findElementByXPath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input").sendKeys("namratamore6597@gmail.com");
		
		
		
		
		//enter password
		driver.findElementByXPath("//input[@type='password']").sendKeys("8983329928");
		
		
		
		
		
		//click on login button
		driver.findElementByXPath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]").click();
		
		
		
		//enter mobile number
		//driver.findElementByXPath("//input[@class='_2IX_2- VJZDxU']").sendKeys("8983329928");
		
		//click on cancel icon
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
 		
		
		Actions act=new Actions(driver);

		WebElement mouseover= driver.findElementByXPath("//*[@class='_1_3w1N']");
        
		act.moveToElement(mouseover).build().perform();
		
		WebElement search=driver.findElementByXPath("(//*[@class='_3vhnxf'])[1]");
		
//click on my profile
		driver.findElementByXPath("(//*[@class='_2kxeIr _1pY_1Z'])[1]").click();
		Thread.sleep(5000);
		
		
//enter phone number
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("8983329928");
		Thread.sleep(2000);
		
		
//enter password
		driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("8983329928");
		Thread.sleep(5000);
		
//click on login
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		Thread.sleep(5000);

//click on manage address
		driver.findElementByXPath("(//*[@class='NS64GK'])[1]").click();
		Thread.sleep(5000);
		
//Add new address
		driver.findElementByXPath("//*[@class='_1QhEVk']").click();
				Thread.sleep(5000);
				
//enter name
				driver.findElementByXPath("//*[@class='_1w3ZZo _2mFmU7']").sendKeys("namrata");
				Thread.sleep(5000);		
		
		
//enter phone no
		driver.findElementByXPath("//*[@name='phone']").sendKeys("8983329928");
		Thread.sleep(5000);
		
//enter pincode
		driver.findElementByXPath("//*[@name='pincode']").sendKeys("414111");
		Thread.sleep(5000);
		
//enter locality
		driver.findElementByXPath("(//*[@type='text'])[5]").sendKeys("Ahmednagar");
		Thread.sleep(5000);
		
//enter address	
		driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Wadgaon Gupta");
		Thread.sleep(5000);
		
//enter district city
	//	driver.findElementByXPath("//*[@name='city']").sendKeys("Ahmednagar");
		//Thread.sleep(5000);
		
//enter landmark
		driver.findElementByXPath("//*[@name='landmark']").sendKeys("Nagar");


//enter alternate phone no
		driver.findElementByXPath("//*[@name='alternatePhone']").sendKeys("8329943968");
		
		Actions act1=new Actions(driver);
		WebElement abc=driver.findElementByXPath("(//*[@class='_1XFPmK'])[1]");
		abc.click();
		Thread.sleep(5000);


	//click on save
		driver.findElementByXPath("//*[@tabindex='10']").click();
		
		

		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
