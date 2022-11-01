Feature:
  Click on https://www.bbc.co.uk/news
  On the Home Page add assertion for the following:
        Sign In Icon at the top of the screen
        England, N.Ireland and Scotland (sub sections of Home)
  Click on the Sign In icon and assert the following on the page:
        Email or Username
        Password
        Sign in
        Need help signing in? (Enter a password of @@££@@££ in the password field and click Sign In)
  Add assertions for the following:
        Something’s missing. Please check and try again.
        Sorry, that password is too short. It needs to be eight characters or more.

  Scenario:
    Given user go to bbc News home page
    When on the news home page check sign in icon and check sub sections of Home text England N.Ireland and Scotland
    And Click on the Sign In icon and assert the following on the page Email or Username Password Sign in Need help signing in?
    And Enter a password of "@@££@@££" in the password field and click Sign In
    Then get respond this message "Something’s missing. Please check and try again." and "Sorry, that password is too short. It needs to be eight characters or more."



