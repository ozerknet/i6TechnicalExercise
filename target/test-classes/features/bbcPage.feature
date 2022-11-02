Feature: BBC New Home Page and Sign In Menu Web elements checks

  Scenario Outline:
    Given user go to bbc News home page
    When on the news home page check sign in icon
    And check sub sections of Home <subSection>

    Examples:
      | subSection   |
      | "England"    |
      | "N. Ireland" |
      | "Scotland"   |

  Scenario:
    And Click on the Sign In icon and assert the following on the page check webElements


  Scenario:
    When Enter a password of "@@££@@££" in the password field and click Sign In
    Then get respond this message "Something’s missing. Please check and try again." or "Sorry, that password is too short. It needs to be eight characters or more."