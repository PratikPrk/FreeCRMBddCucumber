Feature: Free CRM create Contacts

  Scenario Outline: Free CRM Create a new contact scenario
    Given user is on Login Page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
		Then user is on home page
		Then user clicks on Add button
		Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
		
		
		
    Examples: 
      | username                  | password  | firstname | lastname      | position           |
      | pratik.naidu1@gmail.com   | H@ck@3004 | Prk       | Bholenath     | Director           |
      | pratik.naidu1@gmail.com   | H@ck@3004 | Pratik    | KaalBhairav   | Managing-Director  |