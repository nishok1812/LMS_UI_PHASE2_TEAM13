@Program
Feature: The users ualidates the manage Program page

  @Program_TC_001
  Scenario: Validate landing in Program page
    Given AdminUser is on dashboard page after Login
    When AdminUser clicks "<Program>" on the navigation bar
    Then AdminUser should see URL 

  @Program_TC_002
  Scenario: Validating the Manage Program Header on manage Program
    Given AdminUser is on dashboard page after Login
    When AdminUser clicks "<Program>" on the navigation bar
    Then AdminUser should see a heading with text 

  @Program_TC_003
  Scenario: Validate the text and pagination icon below the data table
    Given AdminUser is on dashboard page after Login for manage Program
    When AdminUser clicks "Program" on the navigation bar
    Then User see the footer text as 

  @Program_TC_004
  Scenario: Validate the footer on manage Program
    Given AdminUser is on dashboard page after Login for manage Program
    When AdminUser clicks "Program" on the navigation bar
    Then User see Footer 

  @Program_TC_005
  Scenario: Validate the Default state of Delete button on manage Program
    Given AdminUser is on dashboard page after Login
    When AdminUser clicks "Program" on the navigation bar
    Then AdminUser should see a Delete button on the top left hand side as Disabled

  @Program_TC_006
  Scenario: Validate Add A New Program button on manage Program
    Given AdminUser is on dashboard page after Login
    When AdminUser clicks "Program" on the navigation bar
    Then AdminUser should see a "+A New Program" button on the program page above the data table

  @Program_TC_007
  Scenario: Validate that number of records (rows of data in the table) displayed
    Given AdminUser is on dashboard page after Login
    When AdminUser clicks "Program" on the navigation bar
    Then AdminUser should see the number of records displayed on the page are 5

  @Program_TC_008
  Scenario: Verify data table on the Program page
    Given AdminUser is on dashboard page after Login
    When AdminUser clicks "Program" on the navigation bar
    Then AdminUser should see data table on the Manage Program Page with following column headers

  @Program_TC_009
  Scenario: Verify Sort arrow icon on the data table
    Given AdminUser is on dashboard page after Login
    When AdminUser clicks "Program" on the navigation bar
    Then AdminUser should see the sort arrow icon beside to each column header except Edit and Delete

  @Program_TC_010
  Scenario: Verify Check box on the data table
    Given: AdminUser is on dashboard page after Login
    When: AdminUser clicks "Program" on the navigation bar
    Then: AdminUser should see check box on the left side in all rows of the data table


  @Program_TC_011
  Scenario: Verify Edit and Delete buttons
    Given AdminUser is on dashboard page after Login
    When AdminUser clicks "Program" on the navigation bar
    Then AdminUser should see the Edit and Delete buttons on each row of the data table

  @Program_TC_012
  Scenario: Verify Search bar on the Program page
    Given AdminUser is on dashboard page after Login
    When User is on Manage Program page
    Then User see the Search Text box has text as "Search"

   @Program_TC_013
  Scenario Outline: Validate Search by  Program Name,Program Description,Program Status
    Given AdminUser is on Manage Program Page
    When User enters "<SearchKeyWord>" to be searched from "<SheetName>" and "<RowNumber>"
    Then User see the entries for the searched "<SearchKeyWord>"

    Examples: 
	         |SheetName   |RowNumber  | 
	         |ValidSearchKeyword       |         0 | 

  @Program_TC_014
  Scenario Outline:  Validate search box function for various invalid searches using name
    Given AdminUser is on the manage program page
	When AdminUser enters invalid "<SearchField>" in the search box 
  Then Displays empty details in the data table
    
 Examples:
		       | SearchField| 
		       | 8989U8       |  
		       |  90        |
		       | Jira      | 
		       | t565       |
		       | 2/32/20   |

  @Program_TC_015
  Scenario: Validate Program Details Popup window
    Given AdminUser is on Manage Program Page
    When AdminUser clicks A New Program button
    Then AdminUser should see a popup open for Program details with empty form along with SAVE and CANCEL button and Close(X) Icon on the top right corner of the window

  @Program_TC_016
  Scenario: Validate input fields and their text boxes in Program details form
    Given AdminUser is on Manage Program Page
    When AdminUser clicks A New Program button
    Then AdminUser should see two input fields and their respective text boxes in the program details window

  @Program_TC_017
  Scenario: Validate radio button for Program Status
    Given AdminUser is on Manage Program Page
    When AdminUser clicks A New Program button
    Then AdminUser should see two radio button for Program Status

  @Program_TC_018
  Scenario: Empty form submission
    Given AdminUser is on Program Details Popup window
    When AdminUser clicks Save button without entering any data
    Then AdminUser gets a Error message alert "Name Required"

  @Program_TC_019
  Scenario: Enter only Program Name
    Given AdminUser is on Program Details Popup window
    When AdminUser enters only Program Name in text box and clicks Save button
    Then AdminUser gets a message alert "Name Required"

  @Program_TC_020
  Scenario: Enter only Program Description
    Given AdminUser is on Program Details Popup window
    When AdminUser enters only Program description in text box and clicks "Save button"
    Then AdminUser gets a message alert "Name Required"
    
@Program_TC_021
  Scenario: Select Status only
    Given AdminUser is on "Program Details" Popup window
    When AdminUser selects only Status and clicks "Save" button
    Then AdminUser gets a message alert 'Name and Description required'


 @Program_TC_022
  Scenario: Validate invalid values on the text column
    Given AdminUser is on "Program Details" Popup window
    When AdminUser enters only numbers or special char in name and desc column
    Then AdminUser gets a Error message alert


 @Program_TC_023
  Scenario: Validate Cancel/Close(X) icon on Program Details form
    Given AdminUser is on "Program Details" Popup window
    When AdminUser clicks "Cancel/Close(X) Icon" on Program Details form
    Then Program Details popup window should be closed without saving


  @Program_TC_024
Scenario Outline: Validate admin is able to add new program with valid data in mandatory fields
    Given AdminUser is in the Program detail pop up window
 When Admin enters all mandatory field values with valid data and clicks save button ( Name, Description) from "<SheetName>" and "<RowNumber>"
 Then Admin should see new class details is added in the data table
 	Examples: 
	         |SheetName   |RowNumber  | 
	         |Class       |         0 | 


  @Program_TC_025
  Scenario: Validate Cancel button on Program Details form
    Given AdminUser is on "Program Details" Popup window
    When AdminUser clicks "<Cancel>" button 
    Then AdminUser can see the Program details popup disappears without creating any program
     

 @Program_TC_026
  Scenario: Validate Edit Feature
    Given AdminUser is on Manage Program Page 
    When AdminUser clicks "<Edit>" button on the data table for any row
    Then AdminUser should see a popup open for Program details to edit


   @Program_TC_027
  Scenario: Edit Program Name
    
    Given AdminUser is on Program Details Popup window to Edit
    When AdminUser edits the Name column and clicks save button
    Then AdminUser gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program


 @Program_TC_028
  Scenario: Edit Program description
    Given AdminUser is on Program Details Popup window to Edit
    When AdminUser edits the Description column and clicks save button
    Then AdminUser gets a message "Successful Program Updated" alert and able to see the updated description in the table for the particular program


 @Program_TC_029
  Scenario: Change Program Status
    Given AdminUser is on Program Details Popup window to Edit
    When AdminUser changes the Status and clicks save button
    Then AdminUser gets a message "Successful Program Updated" alert and able to see the updated status in the table for the particular program


 @Program_TC_030
  Scenario: Validate invalid values on the text column
    Given AdminUser is on Program Details Popup window to Edit
    When AdminUser enters only numbers or special char in name and desc column
    Then AdminUser gets a Error message alert
    
    
    
    
    @Program_TC_031
  Scenario: Validate Cancel button on Edit popup
    Given AdminUser is on Program Details Popup window to Edit
    When AdminUser clicks "<Cancel>" button on edit popup
    Then AdminUser can see the Program details popup disappears and can see nothing changed for particular program


  @Program_TC_032
  Scenario: Validate Save button on Edit popup
    Given AdminUser is on Program Details Popup window to Edit
    When AdminUser clicks "<Save>" button on edit popup
    Then AdminUser gets a message "Successful Program Updated" alert and able to see the updated details in the table for the particular program


 @Program_TC_033
  Scenario: Delete Feature
    Given AdminUser is on Manage Program Page 
    When AdminUser clicks "<Delete>" button on the data table for any row
    Then AdminUser should see a alert open with heading "Confirm" along with  "<YES>" and "<NO>" button for deletion


 @Program_TC_034
  Scenario: Validate details for Confirm Deletion form
    Given AdminUser is on Manage Program Page 
    When AdminUser clicks "<Delete>" button on the data table for any row
    Then AdminUser should see a message "Are you sure you want to delete <Program name>?"

 @Program_TC_035
  Scenario: Click Yes on deletion window
    Given AdminUser is on Confirm Deletion alert
    When AdminUser clicks "<YES>" button on the alert
    Then AdminUser gets a message "Successful Program Deleted" alert and able to see that program deleted in the data table


  @Program_TC_036
  Scenario: Click No on deletion window
    Given AdminUser is on Confirm Deletion alert
    When AdminUser clicks "<NO>" button on the alert
    Then AdminUser can see the deletion alert disappears without deleting


  @Program_TC_037
  Scenario: Validate Cancel/Close(X) icon on Confirm Deletion alert
    Given AdminUser is on Confirm Deletion alert
    When AdminUser clicks Cancel/Close(X) Icon on Deletion alert
    Then AdminUser can see the deletion alert disappears without any changes


   @Program_TC_038
  Scenario: Validate Common Delete button enabled after clicking on any checkbox
    Given AdminUser is in Manage Program page
    When AdminUser clicks any checkbox in the data table
    Then AdminUser should see common delete option enabled under header Manage Program


  @Program_TC_039
  Scenario: Validate multiple program deletion by selecting Single checkbox
    
    Given AdminUser is on Confirm Deletion alert of manage Program
    When AdminUser clicks "<YES>" button on the manage Program alert
    Then AdminUser should land on Manage Program page and can see the selected program is deleted from the data table


   @Program_TC_040
  Scenario: Validate multiple program deletion by selecting Single checkbox
    
    Given AdminUser is on Confirm Deletion alert on manage Program
    When AdminUser clicks "<NO>" button on the alert on manage Program
    Then AdminUser should land on Manage Program page and can see the selected program is not deleted from the data table


  @Program_TC_041
  Scenario Outline: Validate multiple program deletion by selecting multiple check boxes
    Given AdminUser is on Confirm Deletion alert on manage Program
    When AdminUser clicks "<Button>" button on the alert on manage Program
    Then AdminUser should land on Manage Program page
    And AdminUser can see the selected programs are "<Deleted>" from the data table

    Examples: 
      | Button | Deleted     |
      | YES    | deleted     |
      | NO     | not deleted |

 @Program_TC_042
  Scenario Outline: Validates Sorting(data ordering) on the Program Data table
    Given AdminUser is on Manage Program Page after clicks Program on the navigation bar
    When AdminUser clicks the sort icon of "<Column name>" column
    Then The data get sorted on the table based on the "<Column name>" column values in "<Order>" order

    Examples: 
      | column name    | order      |
      | program name   | ascending  |
      | program name   | descending |
      | program Desc   | ascending  |
      | program Desc   | descending |
      | program Status | ascending  |
      | program Status | descending |

 @Program_TC_043
  Scenario: Verify Next page link
    Given AdminUser is on Manage Program page
    When AdminUser clicks Next page link on the program table 
    Then AdminUser should see the Pagination has "Next" link


 @Program_TC_044
  Scenario: Verify Next last link
    Given AdminUser is on Manage Program page 
    When AdminUser clicks Last page link
    Then AdminUser should see the last page record on the table with Next page link are disabled


 @Program_TC_045
  Scenario: Verify First page link
    Given AdminUser is on last page of Program table
    When AdminUser clicks First page link
    Then AdminUser should see the previous page record on the table with pagination has previous page link


  @Program_TC_046
  Scenario: Verify Start page link
    Given AdminUser is on Previous Program page 
    When AdminUser clicks Start page link
    Then AdminUser should see the very first page record on the table with Previous page link are disabled


  @Program_TC_047
  Scenario Outline: Navigate to Different Pages from the Navigation Bar
    Given AdminUser is on Manage Program page
    When AdminUser clicks on "<LinkName>" link on Manage Program page
    Then AdminUser is re-directed to "<DestinationPage>" page

    Examples: 
      | LinkName   | DestinationPage |
      | Student    | Student         |
      | Batch      | Batch           |
      | Class      | Class           |
      | User       | User            |
      | Assignment | Assignment      |
      | Attendance | Attendance      |
      | Logout     | Login           |