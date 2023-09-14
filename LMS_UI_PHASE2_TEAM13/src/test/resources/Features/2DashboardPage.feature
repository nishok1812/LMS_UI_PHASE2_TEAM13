@DashBoard_Module
Feature: The User validate the DashBoard Page
#DashBoard Page verification	
	
	
	@DashBoard_TC_001

  Scenario: Verify after login  admin lands on manage program as dashboard page
    Given: Admin is in login page
    When: Admin enter valid credentials  and clicks login button 
    Then: Admin should see manage program as header


	@DashBoard_TC_002

  Scenario: Verify the response time
    Given: Admin is in login page
    When: Admin enter valid credentials  and clicks login button 
    Then:  Maximum navigation time in milliseconds, defaults to 30 seconds

	@DashBoard_TC_003
  Scenario: Verify broken link
    Given:  Admin is in login page
    When: Admin enter valid credentials  and clicks login button 
    Then: HTTP response >= 400. Then the link is broken

	@DashBoard_TC_004
  Scenario: Verify LMS title
    Given:  Admin is in login page
    When: Admin enter valid credentials  and clicks login button 
    Then: Admin should see LMS -Learning management system  as title

	@DashBoard_TC_005
  Scenario: Verify  LMS title alignment
    Given: Admin is in login page
    When: Admin enter valid credentials  and clicks login button 
    Then: LMS title should be on the top left corner of page

	@DashBoard_TC_006
  Scenario: Validate navigation bar text
    Given: Admin is in login page
    When:  Admin enter valid credentials  and clicks login button
    Then: Admin should see correct spelling in navigation bar text

	@DashBoard_TC_007
  Scenario: Validate LMS title has correct spelling ang space
    Given: Admin is in login page
    When: Admin enter valid credentials  and clicks login button
    Then: Admin should see correct spelling and space in LMS title

	@DashBoard_TC_008
  Scenario: Validate alignment for navigation bar
    Given: Admin is in login page
    When: Admin enter valid credentials  and clicks login button
    Then: Admin should see the navigation bar text on the top right side

	@DashBoard_TC_009
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
      
 
 @DashBoard_TC_0010
 Scenario: Verify Logout button function
    Given: Admin is in dashboard page
    When: Admin click Logout button on navigation bar
    Then: Admin should land on login in page

