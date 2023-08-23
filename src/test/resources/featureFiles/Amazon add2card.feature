Feature: amazon page side test

  Scenario: amazon add to card scenario
    Given user should on the login pages
    And user giving username and password correctly
    When user clicks the login btn
    And user clicks the search btn and search the product
    And user place the order
  
    Then user cancel the product from the order
