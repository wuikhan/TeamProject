Feature: Test Salesforce login functionality
  I want to use this feature file to test the login functionaility of our salesforce application.

  @SmokeTest
  Scenario: login using valid credentials
    Given I open chrome browser
    And I go to salesforce home page
    And I enter username as "test.user@gmail.com.test"
    And I enter password as "Welcome1"
    When I click the login button
    Then I see the dashboard

  Scenario: Invalid Login Attempt
    Given I open chrome browser
    And I go to salesforce home page
    And I enter username as "wrongemail@gmail.com.test"
    And I enter password as "Welcome1"
    When I click the login button
    Then I should see an error message
