@LoginFeature 
Feature: Background color change to sky blue Functionality

Background: 
	Given Set SkyBlue Background button exists
	
@Scenario
Scenario: 1 User should be able to click on Set SkyBlue Background button and the background color should change to sky blue
	When I click on the SkyBlue Background button 
	Then the background color will change to sky blue 
	
Scenario: 2 White Background Change	
	Then Set SkyWhite Background button exists
	Then I click on the set White Background button
	Then the background color will change to white 	

	
	
#Scenario 1: Sky Blue Background; 
#Given: "Set SkyBlue Background" button exists; 
#When: I click on the SkyBlue Background button; 
#Then: the background color will change to sky blue	

#Scenario 2: White Background Change; 
	#Given: "Set SkyWhite Background" button exists; 
	#When: I click on the button; 
	#Then: the background color will change to white


