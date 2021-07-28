Feature: Login Flow
Description: Here we are going to check the login flow

Scenario: Check Login Functionality
    Given User navigate to login page
    Then User validate LoginLogo
    And User validate EmailHeader
    And User validate PassHeader
    And User validate EmailTextBox
    And User validate PasswordTextBox
    And User validate LoginButton
    And User Validate ForgotPasswordLink
   	And User Close the login page


