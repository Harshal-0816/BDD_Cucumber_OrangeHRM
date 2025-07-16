Feature: Login Feature
	@harshal
  Scenario: Successful login with valid credentials
    Given User is on Login page
    When User enters the username "Admin" and password "admin123"
    And User clicks on Login button
    Then User should be redirected to OrangeHRM Dashboard Page
    
