#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Free CRM Login feature

  #Scenario: Free CRM Login Test Application
    #Given user is on Login Page
    #When title of login page is Free CRM
    #Then user enters username and password
    #Then user clicks on login button
#		Then user is on home page
		
		#Without Examples keyword
 #Scenario: Free CRM Login Test Application   //DataDriven Testing
    #Given user is on Login Page
    #When title of login page is Free CRM
    #Then user enters "pratik.naidu1@gmail.com" and "H@ck@3004"
    #Then user clicks on login button
#		Then user is on home page		
		
				#With Examples keyword
#
		
#		Scenario: User is able to create a new contact
#		
    #	When user opens contacts menu
    #	Then user clicks on Add button
    #	Then user enters firstname lastname and email
    #	Then user clicks on Save button
    #	Then verify new contact created
		
