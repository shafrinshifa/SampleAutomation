@tag1
Feature: Flipkart page test

  Scenario: login scenario posstive
    Given user should be home page
    And user should search product
    When user search mobile
    And user  click add to cart
    Then cancel the add to cart
