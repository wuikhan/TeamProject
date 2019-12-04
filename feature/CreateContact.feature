Feature: Test Salesforce Contact Creation
  I want to use this feature file to test the Contact Creation functionality
  
  Scenario: Create Contact using Valid credentials
    Given I open chrome browser
    And I go to salesforce home page
    And I enter username as "test.user@gmail.com.test"
    And I enter password as "Welcome1"
    When I click the login button
    