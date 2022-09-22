package utility;

public class Calling

{

	public static void main(String[]args) throws InterruptedException
	
	{
		 //launch browser
		
		Object[] input=new Object[2];
		         input[0]="Chrome";
		         input[1]="E:\\Automation support\\chromedriver.exe";
		         SeleniumOpertions.browserLaunch(input);
		         
		
		 //open application
		         
		Object[] input1=new Object[1];
        input1[0]="https://www.flipkart.com/";
        SeleniumOpertions.openApplication(input1);
        
		
		 //click on cancel icon
        
		Object[] input2=new Object[1];
        input2[0]="//*[@class='_2KpZ6l _2doB4z']";
        SeleniumOpertions.clickOnElement(input2);
		
		
		 //action class
		
		Object[] input3=new Object[1];
        input3[0]="//*[@class='_1_3w1N']";
        SeleniumOpertions.mouseOverAction(input3);
		
		
		 //click on my profile
		Object[] input4=new Object[1];
        input4[0]="(//*[@class='_2kxeIr _1pY_1Z'])[1]";
        SeleniumOpertions.clickOnElement(input4);
		
		
		Thread.sleep(5000);
		
		 //enter phone number
		Object[] input5=new Object[2];
        input5[0]="(//*[@type='text'])[2]";
        input5[1]="8983329928";
        SeleniumOpertions.sendText(input5);
		
		
		Thread.sleep(5000);
		
		//enter password
		Object[] input6=new Object[2];
        input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
        input6[1]="8983329928";
        SeleniumOpertions.sendText(input6);
		
		
		
			Thread.sleep(5000);
		
			 //click on login
			Object[] input7=new Object[1];
	        input7[0]="(//*[@type='submit'])[2]";
	        SeleniumOpertions.clickOnElement(input7);
			
			
			
	}
	
	

}
