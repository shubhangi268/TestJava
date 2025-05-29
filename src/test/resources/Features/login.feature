Feature: To test the login functionality
	@smoketest
  Scenario: Check user is logged in with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
