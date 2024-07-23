Feature: User Registration on Flipkart

  Scenario: Successful User Registration
    Given I am on the Flipkart registration page
    When I fill in the registration form with valid details
    And I submit the registration form
    Then I should be registered successfully
    And I should be redirected to the dashboard or homepage