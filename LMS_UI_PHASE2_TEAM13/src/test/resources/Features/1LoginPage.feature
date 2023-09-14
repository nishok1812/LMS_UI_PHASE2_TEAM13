Feature: Login page functionally

  @HomePageVerification @LoginPage_TC001
  Scenario: Verify admin is able to land on home page
    Given Admin launch the browser
    When Admin gives the correct <LMS portal URL>
    Then Admin should land on the home page

  @HomePageVerification @LoginPage_TC002
  Scenario: Verify admin is able to land on home page with invalid URL
    Given Admin launch the browser
    When Admin gives the invalid <LMS portal URL>
    Then Admin should recieve 404 page not found error

  @HomePageVerification @LoginPage_TC003
  Scenario: Verify for broken link
    Given Admin launch the browser
    When Admin gives the correct <LMS portal URL>
    Then HTTP response >= 400. Then the link is broken

  @HomePageVerification @LoginPage_TC004
  Scenario: Verify the text spelling in the page
    Given Admin launch the browser
    When Admin gives the correct <LMS portal URL>
    Then Admin should see correct spellings in all fields

  @HomePageVerification @LoginPage_TC005
  Scenario: Verify the logo of the LMS
    Given Admin launch the browser
    When Admin gives the correct <LMS portal URL>
    Then Admin should see correct logo of the LMS

  @HomePageVerification @LoginPage_TC006
  Scenario: Verify the logo properly aligned
    Given Admin launch the browser
    When Admin gives the correct <LMS portal URL>
    Then Admin should see logo is properly aligned

  @HomePageVerification @LoginPage_TC007
  Scenario: Verify login button is present
    Given Admin launch the browser
    When Admin gives the correct <LMS portal URL>
    Then Admin should see login button

  @HomePageVerification @LoginPage_TC008
  Scenario: Verify login button is clickable
    Given Admin launch the browser
    When Admin gives the correct <LMS portal URL>
    Then Admin should able to click the Login button

  @LoginPageVerification @LoginPage_TC009
  Scenario: Verify the login page
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should land on the login page

  @LoginPageVerification @LoginPage_TC010
  Scenario: Verify for broken link
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then HTTP response >= 400. Then the link is broken

  @LoginPageVerification @LoginPage_TC011
  Scenario: Verify the header of the login page
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should see "Please login to LMS application" in the header

  @LoginPageVerification @LoginPage_TC012
  Scenario: Verify the text spelling in login page
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should see correct spellings in all fields

  @LoginPageVerification @LoginPage_TC013
  Scenario: Verify text field is present
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should see two text field

  @LoginPageVerification @LoginPage_TC014
  Scenario: Verify text on the first text field
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should "User" in the first text field

  @LoginPageVerification @LoginPage_TC015
  Scenario: Verify asterik next to user text
    Given Admin is in home page after LMS portal URL
    When Admin enter value and clicks Login button
    Then Admin should see * symbol next to user text

  @LoginPageVerification @LoginPage_TC016
  Scenario:	 Verify text on the second text field
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should "password" in the second text field
    
  @LoginPageVerification @LoginPage_TC017
  Scenario: Verify asterik next to password text
    Given Admin is in home page after LMS portal URL
    When Admin enter password value and clicks Login button
    Then Admin should see * symbol next to password text

  @LoginPageVerification @LoginPage_TC018
  Scenario: Verify the alignment input field for the login
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should see input field on the centre of the page

  @LoginPageVerification @LoginPage_TC019
  Scenario: Verify Login is present
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should see login button

  @LoginPageVerification @LoginPage_TC020
  Scenario: Verify the alignment of the login button
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should see login button on the centre of the page

  @LoginPageVerification @LoginPage_TC021
  Scenario: Verify forgot username or password link
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should see forgot username or password link

  @LoginPageVerification @LoginPage_TC022
  Scenario: Verify for the Reset password link
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should see reset password link

  @LoginPageVerification @LoginPage_TC023
  Scenario: Verify input descriptive test in user field
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should see user in gray color

  @LoginPageVerification @LoginPage_TC024
  Scenario: Verify input descriptive test in password field
    Given Admin is in home page after LMS portal URL
    When Admin clicks Login button
    Then Admin should see password in gray color

  @LoginPageVerification @LoginPage_TC025
  Scenario Outline: Validate login with valid credentials
    Given Admin in login page after clicking login button in home page
    When Admin enter valid credentials from "<Sheet Name>" and "<Row Number>" and clicks login button
    Then Admin should land on dashboard page

    Examples: 
      | Sheet Name | Row Number |
      | Login Data |          2 |

  @LoginPageVerification @LoginPage_TC026
  Scenario Outline: Validate login with invalid credentials
    Given Admin in login page after clicking login button in home page
    When Admin enter invalid credentials  from "<Sheet Name>" and "<Row Number>" and clicks login button
    Then Error message please check username/password

    Examples: 
      | Sheet Name | Row Number |
      | Login Data |          3 |

  @LoginPageVerification @LoginPage_TC027
  Scenario Outline: Validate login with valid credentials in username
    Given Admin in login page after clicking login button in home page
    When Admin enter valid username from "<Sheet Name>" and "<Row Number>" and clicks login button
    Then Error message please check password

    Examples: 
      | Sheet Name | Row Number |
      | Login Data |          4 |

  @LoginPageVerification @LoginPage_TC028
  Scenario Outline: Validate login with valid credentials in password
    Given Admin in login page after clicking login button in home page
    When Admin enter valid  password from "<Sheet Name>" and "<Row Number>" and clicks login button
    Then Error message please check username

    Examples: 
      | Sheet Name | Row Number |
      | Login Data |          5 |

  @LoginPageVerification @LoginPage_TC029
  Scenario Outline: Validate login with blank username credentials
    Given Admin in login page after clicking login button in home page
    When Admin enter blank in username from "<Sheet Name>" and "<Row Number>" and clicks login button
    Then Error message please check username/password

    Examples: 
      | Sheet Name | Row Number |
      | Login Data |          6 |

  @LoginPageVerification @LoginPage_TC030
  Scenario Outline: Validate login with blank password credentials
    Given Admin in login page after clicking login button in home page
    When Admin enter blank in password from "<Sheet Name>" and "<Row Number>" and clicks login button
    Then Error message please check username/password

    Examples: 
      | Sheet Name | Row Number |
      | Login Data |          7 |

  @LoginPageVerification @LoginPage_TC031
  Scenario Outline: Validate login with empty values in both field
    Given Admin in login page after clicking login button in home page
    When Admin clicks Login button with empty values in both columns from "<Sheet Name>" and "<Row Number>"
    Then Error message please check username/password

    Examples: 
      | Sheet Name | Row Number |
      | Login Data |          8 |

  @LoginPageVerification @LoginPage_TC032
  Scenario Outline: Verify login button action through keyboard
    Given Admin in login page after clicking login button in home page
    When Admin enter valid credentials from <Name> and <Password> and clicks login button through keyboard
    Then Admin should land on dashboard page

     Examples: 
      | Name | Password |
      | kavi | Pass134 |

  @LoginPageVerification @LoginPage_TC033
  Scenario Outline: Verify login button action through mouse
    Given Admin in login page after clicking login button in home page
    When Admin enter valid credentials from <Name> and <Password> and clicks login button through mouse
    Then Admin should land on dashboard page

    Examples: 
      | Name | Password |
      | Anu  | Pass1234 |

  @ForgotUsername/Password @LoginPage_TC034
  Scenario: Verify forgot username or password link
    Given Admin in login page after clicking login button in home page
    When Admin clicks forgot username or password link
    Then Admin should land on forgot username or password page

  @ForgotUsername/Password @LoginPage_TC035
  Scenario: Verify broken link
    Given Admin in login page after clicking login button in home page
    When Admin clicks forgot username or password link
    Then HTTP response >= 400. Then the link is broken

  @ForgotUsername/Password @LoginPage_TC036
  Scenario: Verify input descriptive text for Email
    Given Admin in login page after clicking login button in home page
    When Admin clicks forgot username or password link
    Then Admin should see "Email" text in gray color

  @ForgotUsername/Password @LoginPage_TC037
  Scenario: Verify email text in text field
    Given Admin in login page after clicking login button in home page
    When Admin clicks forgot username or password link
    Then Admin should see "Email" in text field

  @ForgotUsername/Password @LoginPage_TC038
  Scenario: Verify send link button is present
    Given Admin in login page after clicking login button in home page
    When Admin clicks forgot username or password link
    Then Admin should see "send Link"  button

  @ForgotUsername/Password @LoginPage_TC039
  Scenario: Verify asterik near Email text
    Given Admin in login page after clicking login button in home page
    When Admin clicks forgot username or password link
    Then Admin should see asterik "*" symbol need Email

  @ForgotUsername/Password @LoginPage_TC040
  Scenario: Verify text spelling
    Given Admin in login page after clicking login button in home page
    When Admin clicks forgot username or password link
    Then Admin should see correct spellings in all fields

  @ForgotUsername/Password @LoginPage_TC041
  Scenario: Verify the alignment of the send link button
    Given Admin in login page after clicking login button in home page
    When Admin clicks forgot username or password link
    Then Admin should see send link button in center of the page

  @ForgotUsername/Password @LoginPage_TC042
  Scenario Outline: Validate email sent for forgot password
    Given Admin is in forgot username and password page after reaching login page
    When Admin enters valid <email> and clicks send link button
    Then Admin should receive link in mail for reset username / password

    Examples: 
      | email             |
      | gauri24@gmail.com |

  @ForgotUsername/Password @LoginPage_TC043
  Scenario Outline: Validate email sent for forgot password with invalid email if
    Given Admin is in forgot username and password page after reaching login page
    When Admin enters invalid <email> and clicks send link button
    Then Admin should not receive link in mail for reset username / password

    Examples: 
      | email              |
      | gauri24@.gmail.com |

  @ResetPassword @LoginPage_TC044
  Scenario: Verify reset password link
    Given Admin in login page after clicking login button in home page
    When Admin clicks reset password link
    Then Admin should land on reset password page

  @ResetPassword @LoginPage_TC045
  Scenario: Verify text in the page
    Given Admin in login page after clicking login button in home page
    When Admin clicks reset password link
    Then Admin should see correct spellings in all fields

  @ResetPassword @LoginPage_TC046
  Scenario: Verify submit button is present
    Given Admin in login page after clicking login button in home page
    When Admin clicks reset password link
    Then Admin should see "submit"  button

  @ResetPassword @LoginPage_TC047
  Scenario: Verify the alignment of the  submit button
    Given Admin in login page after clicking login button in home page
    When Admin clicks reset password link
    Then Admin should see "submit" button in center of the page

  @ResetPassword @LoginPage_TC048
  Scenario: Verify text box is present is the page
    Given Admin in login page after clicking login button in home page
    When Admin clicks reset password link
    Then Admin should see two text box

  @ResetPassword @LoginPage_TC049
  Scenario: Verify first label text
    Given Admin in login page after clicking login button in home page
    When Admin clicks reset password link
    Then Admin should see "Type in new password" in the first label text

  @ResetPassword @LoginPage_TC050
  Scenario: Verify second label text
    Given Admin in login page after clicking login button in home page
    When Admin clicks reset password link
    Then Admin should see "Retype password" in the second label text

  @ResetPassword @LoginPage_TC051
  Scenario: Verify text box is in disabled
    Given Admin in login page after clicking login button in home page
    When Admin clicks reset password link
    Then Admin should see text box in disabled state

  @ResetPassword @LoginPage_TC052
  Scenario: Verify text box is in enabled in new password field
    Given Admin in reset password page after click reset password link after reaching in login page
    When Admin clicks on type in new password field
    Then Admin should see text box is enabled state

  @ResetPassword @LoginPage_TC053
  Scenario: Verify text box is in enabled in retype password field
    Given Admin in reset password page after click reset password link after reaching in login page
    When Admin clicks on retype password field
    Then Admin should see text box is enabled state

  @ResetPassword @LoginPage_TC054
  Scenario Outline: Validate reset password with valid details
    Given Admin in reset password page after click reset password link after reaching in login page
    When Admin enters same <newpassword> and <retypepassword> on both field and clicks submit button
    Then Admin should recieve  : "Your password has been reset". Please click here to login

    Examples: 
      | newpassword  | retypepassword |
      | Password@123 | Password@123   |

  @ResetPassword @LoginPage_TC055
  Scenario Outline: Validate reset password with invalid details
    Given Admin in reset password page after click reset password link after reaching in login page
    When Admin enters same <newpassword>> and <retypepassword> on both field with invalid details and clicks submit button
    Then Error message " Please try agin"

    Examples: 
      | newpassword | retypepassword |
      | Pass@123    | Pass@123       |

  @ResetPassword @LoginPage_TC056
  Scenario Outline: Validate reset password with empty details
    Given Admin in reset password page after click reset password link after reaching in login page
    When Admin enters empty details <newpassword> and <retypepassword> on both field and clicks submit button
    Then Error message " Please try agin"

    Examples: 
      | newpassword | retypepassword |
      |             |                |

  @ResetPassword @LoginPage_TC057
  Scenario Outline: Validate reset password mismatch values
    Given Admin in reset password page after click reset password link after reaching in login page
    When Admin enters mismatch values of <newpassword> and <retypepassword> and clicks submit button
    Then Error message " Please try agin"

    Examples: 
      | newpassword | retypepassword |
      | Pass@123    | Pass@1234      |
