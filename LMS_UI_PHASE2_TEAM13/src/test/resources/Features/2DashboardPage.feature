@DashBoard
Feature: DashBoard

  Background: Admin clicks Login after giving correct URL
    Given User Logged on to LMS Website

  Scenario: Verify after login  admin lands on manage program as dashboard page
    Given: Admin is in login page
    When: Admin enter valid credentials  and clicks login button 
    Then: Admin should see manage program as header


  Scenario: Verify the response time
    Given: Admin is in login page
    When: Admin enter valid credentials  and clicks login button 
    Then:  Maximum navigation time in milliseconds, defaults to 30 seconds


  Scenario: Verify broken link
    Given:  Admin is in login page
    When: Admin enter valid credentials  and clicks login button 
    Then: HTTP response >= 400. Then the link is broken


  Scenario: Verify LMS title
    Given:  Admin is in login page
    When: Admin enter valid credentials  and clicks login button 
    Then: Admin should see LMS -Learning management system  as title


  Scenario: Verify  LMS title alignment
    Given: Admin is in login page
    When: Admin enter valid credentials  and clicks login button 
    Then: LMS title should be on the top left corner of page


  Scenario: Validate navigation bar text
    Given: Admin is in login page
    When:  Admin enter valid credentials  and clicks login button
    Then: Admin should see correct spelling in navigation bar text


  Scenario: Validate LMS title has correct spelling ang space
    Given: Admin is in login page
    When: Admin enter valid credentials  and clicks login button
    Then: Admin should see correct spelling and space in LMS title


  Scenario: Validate alignment for navigation bar
    Given: Admin is in login page
    When: Admin enter valid credentials  and clicks login button
    Then: Admin should see the navigation bar text on the top right side


  Scenario Outline: Validate navigation bar order for <BarOrder> <TabName>
    Given Admin is in the login page
    When Admin enters valid credentials and clicks the login button
    Then Admin should see <TabName> in the <BarOrder> place

    Examples: 
      | BarOrder | TabName    |
      | 1st      | Student    |
      | 2nd      | Program    |
      | 3rd      | Batch      |
      | 4th      | Class      |
      | 5th      | User       |
      | 6th      | Assignment |
      | 7th      | Attendance |
      | 8th      | Logout     |

  Scenario: Verify Logout button function
    Given: Admin is in dashboard page
    When: Admin click Logout button on navigation bar
    Then: Admin should land on login in page

