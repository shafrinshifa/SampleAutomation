Feature: 
  Amazon page test

  Scenario: 
    login scenario  possitive

    Given user should be on login page
    And user give an username
    And user give an password
    When user click on login button
    Then the home page is showed
