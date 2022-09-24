 Feature: ManageAddress functionality

Background: user successfully logged in

Given user provide browser name as "Chrome" and exe location as "E:\\Automation support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"
Given user cancel initial login window
When user navigate on Login tab
When user click on my profile 
When user enter "8983329928" as username
When user enter "8983329928" as password
When user click on login button


@smokeTest
Scenario: Manage address withvalid data
When user navigate on Login tab
When user click on my profile 
When user enter "8983329928" as username
When user enter "8983329928" as password
When user click on login button

