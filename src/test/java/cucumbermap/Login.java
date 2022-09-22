package cucumbermap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOpertions;

public class Login
{
	
   @Given ("^user provide browser name as \"(.*)\" and exe location as \"(.*)\"$")
   
	   public void bLaunch(String name,String location)
	   {
	   Object[] input=new Object[2];
       input[0]=name;
       input[1]=location;
       SeleniumOpertions.browserLaunch(input);
   }
   
  /* @Given ("^user enter url as  \"(.*)\"$")
   
	   public void openApp(String url)
	   {
	   Object[] input1=new Object[1];
       input1[0]=url;
       SeleniumOpertions.openApplication(input1);
       
   }*/
   @Given ("^user cancel initial login window$")
   
	 public void clickElement(String login)
	   {
	   Object[] input2=new Object[1];
       input2[0]="//*[@class='_2KpZ6l _2doB4z']";
       SeleniumOpertions.clickOnElement(input2);
		
   }
   @When ("^user navigate on Login tab$")
   
	  public void mouseOver()
	   {
	   Object[] input3=new Object[1];
       input3[0]="//*[@class='_1_3w1N']";
       SeleniumOpertions.mouseOverAction(input3);
		
   }
   @When ("^user click on my profile$")
	   public void clickElements( )
		   {
	   Object[] input4=new Object[1];
       input4[0]="(//*[@class='_2kxeIr _1pY_1Z'])[1]";
       SeleniumOpertions.clickOnElement(input4);
   }
   @When ("^user enter \"(.*)\" as username$")
   
   public void sendTexth(String username)
   {
   Object[] input5=new Object[2];
   input5[0]="(//*[@type='text'])[2]";
   input5[1]="8983329928";
   SeleniumOpertions.sendText(input5);
	
   }
 @When ("^user enter \"(.*)\" as password$")
   
	  public void sendTextl(String password)
	   {
	   Object[] input6=new Object[2];
       input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
       input6[1]="8983329928";
       SeleniumOpertions.sendText(input6);
       
		
		
   }
   @When ("^user click on login button$")
   
	  public void clickOnElement()
	   {
	   Object[] input7=new Object[1];
       input7[0]="(//*[@type='submit'])[2]";
       SeleniumOpertions.clickOnElement(input7);
		
       }

/*  @Then("^applicatin shows user profile to user$") 
   
       public void valid()throws Throwable
       
      
	   {
	   Object[] input8=new Object[2];
       input8[0]="//*[text()='Namrata More']";
       input8[1]="Namrata More";
       SeleniumOpertions.validation(input8);
   }*/
   
   
  @Given("^user enter url as \"([^\"]*)\"$")
  public void user_enter_url_as(String arg1) throws Throwable
{
	  Object[] input1=new Object[1];
      input1[0]=arg1;
      SeleniumOpertions.openApplication(input1); 
     
  }
   
   
  @Then("^application shows user profile to user$")
  public void application_shows_user_profile_to_user() throws Throwable
  {
	  Object[] input8=new Object[2];
      input8[0]="//*[text()='Namrata More']";
      input8[1]="Namrata More";
      SeleniumOpertions.validation(input8);
  }

   
   
}

