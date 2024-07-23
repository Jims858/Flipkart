Feature: Product Search on Flipkart

  Scenario: Search for a specific product
    Given I am on the Flipkart homepage
    When I use the search functionality to find a "Laptop"
    Then I should see search results containing "Laptop"