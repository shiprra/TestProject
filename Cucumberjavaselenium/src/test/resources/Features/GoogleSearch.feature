Feature: feature to test google serach functioanlity

  Scenario: Validate google serach is working
    
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
