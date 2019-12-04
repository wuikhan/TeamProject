Feature: Test Salesforce login functionality
  I want to use this feature file to test the login functionaility of our salesforce application.

  Scenario: Create Account using Valid credentials
    Given I open chrome browser
    And I go to salesforce home page
    And I enter username as "test.user@gmail.com.test"
    And I enter password as "Welcome1"
    When I click the login button
    #Then I see the dashboard
    And I create Account
      | Account Name 	| Phone        				| Parent Account                      									| Fax          						| Type     			| Account Number |
      | BOA          						| 703-626-6053 	| Aethna Home Products                				| 703-090-0000 	| Prospect 	| 10001 										|
      | Wachovia     				| 703-626-6053 	| Burlington Textiles Corp of America 	| 703-090-0000 	| Other    		| 20001 										|
