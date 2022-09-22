 Feature: Login functionality

Background: user cancelled initial Login window 

Given user provide browser name as "Chrome" and exe location as "E:\\Automation support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"
Given user cancel initial login window


@smokeTest
Scenario: Login fuctionality with valid credentials
When user navigate on Login tab
When user click on my profile 
When user enter "8983329928" as username
When user enter "8983329928" as password
When user click on login button
Then application shows user profile to user  
