Feature: BBC New Home Page and Sign In Menu Web elements checks

  Scenario Outline: BBC News home paga sign in icon and sub sections element test
    Given user go to bbc News home page
    When on the news home page check sign in icon
    And check sub sections of Home <subSection>
    And Click on the Sign In icon and assert the following on the page check webElements
    And Enter a password of "@@££@@££" in the password field and click Sign In
    Then get respond this message "Sorry, that password isn't valid. Please include a letter." or "Sorry, that password is too short. It needs to be eight characters or more."

    # msg1 = Something’s missing. Please check and try again.
    # msg2 = Sorry, that password is too short. It needs to be eight characters or more.
    # msg3 = Sorry, that password isn't valid. Please include a letter.

    Examples:
      | subSection   |
      | "England"    |
      | "N. Ireland" |
      | "Scotland"   |

