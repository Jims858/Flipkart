Feature: User Login on Flipkart

  Scenario: Successful User Login
    Given I am on the Flipkart login page
    When I fill in the login form with valid credentials
    And I submit the login form
    Then I should be logged in successfully
    And I should be redirected to the dashboard or homepage