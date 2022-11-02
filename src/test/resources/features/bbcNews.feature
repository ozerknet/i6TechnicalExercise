@wip
Feature: BBC News Home Page visit and check Sign In Icon, sub Menu Text
  Sing In menu webElement text control and wrong pass value entered and check message

  Scenario Outline: BBC News home page sign in icon and sub menu check

    Given  user go to bbc News home page
    When on the news home page check sign in icon
    And check sub sections of Home <subSection>


    Examples:
      | subSection   |
      | "England"    |
      | "N. Ireland" |
      | "Scotland"   |


  Scenario Outline: Sign in menu web elements text check and check messages after wrong password value entered
    Given  user go to bbc News home page
    And Click on the Sign In icon and assert the following on the page check webElements
    And Enter a password of <password> in the password field and click Sign In
    Then get respond this message <message>

    Examples:
      | password   | message                                                                       |
      | "@@££@@££" | "Something’s missing. Please check and try again."                            |
      | "@@££@@££" | "Sorry, that password is too short. It needs to be eight characters or more." |
      | "@@££@@££" | "Sorry, that password isn't valid. Please include a letter."                  |



    # msg1 = Something’s missing. Please check and try again.
    # msg2 = Sorry, that password is too short. It needs to be eight characters or more.
    # msg3 = Sorry, that password isn't valid. Please include a letter.