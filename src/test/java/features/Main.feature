@dn25
Feature: This is the File for TradeMe Website tests

  Scenario: Verify you can navigate to TradeMe page and search for products
    Given I am on the TradeMe Homepage
    When I Search for Shoes
    And I verify the number of listings displayed
    And I select the appropriate first listing
    Then I verify the key details

