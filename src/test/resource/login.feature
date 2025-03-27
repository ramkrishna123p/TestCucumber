Feature: amazon Login and Logout
 
  @Smoke
  Scenario Outline: Login into amazon and LogOut 
    Given Launch amazon URL
    When Click on Sign In
    When Enter the "<UserName>" username
    And Click on continue
    And  Enter the "<Password>" password
    And Click on Signin
    Then Validate Username "<User>"
    When Mouse Over on Logged in User
    When Click on SignOut
    Then Validate Amazon Landing Page is displayed
    When Close Brower
    
    Examples:
    | UserName | Password | User |
    | shivamca123@gmail.com | jhgert@13579 | Venkat |
    | ramkrishnareddymvs@gmail.com|Kanna@13579|ram|
 