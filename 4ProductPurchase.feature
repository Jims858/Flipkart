Feature: Product Purchase on Flipkart

  Scenario: Successful Product Purchase
    Given I have searched for a "Laptop"
    When I select a product from the search results
    And I add the product to the cart
    And I navigate to the cart and proceed to checkout
    And I fill in the checkout details with valid information
    Then the product should be purchased successfully