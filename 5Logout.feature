Feature: User Logout on Flipkart

  Scenario: Successful User Logout
    Given I am logged into Flipkart
    When I log out from the application
    Then I should be logged out successfully
    And I should be redirected to the login page