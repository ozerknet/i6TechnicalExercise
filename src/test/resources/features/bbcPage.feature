Feature:

  Scenario Outline:
    Given user go to bbc News home page
    When on the news home page check sign in icon
    And check sub sections of Home <text> England N.Ireland and Scotland
    And Click on the Sign In icon and assert the following on the page Email or Username Password Sign in Need help signing in?
    And Enter a password of "@@££@@££" in the password field and click Sign In
    Then get respond this message "Something’s missing. Please check and try again." and "Sorry, that password is too short. It needs to be eight characters or more."

    Examples:
      | description        | text      |
      | Check England menu | "England" |



