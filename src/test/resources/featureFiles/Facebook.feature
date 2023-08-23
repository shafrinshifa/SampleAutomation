Feature: facebook app testing

  Scenario Outline: login to facebook pass
    Given user is now on the page
    And user enter the "<username>" and "<password>"
    When user click the btn
    Then home page is displayed
    

  #Scenario Outline: login to facebook fail
    #Given user is now on page
    #And user enter below  the "<username>"and "<password>"
    #When user click the btn
    #But scenario is fail
#
  #Scenario Outline: login to facebook fail
    #Given user is now on the page
    #And user enter below the "<username>" and "<password>"
    #When user click the btn
    #But scenario is fail

    Examples: 
      | username   | password  |
      | 9600282648 | selvarani |
      | 9600282648 | selva     |
      |     956846 | selvsar   |
      |            |           |
      |            | selvarani |
