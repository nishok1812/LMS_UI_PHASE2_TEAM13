@Program
Feature: Program

  Background: User Logged on to LMS Website
    Given User Logged on to LMS Website

  @ProgramPageValidation
  Scenario: Validate landing in Program page
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see URL with "Manage Program"

  @HeaderValidation
  Scenario: Validating the Manage Program Header
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see a heading with text "Manage Program" on the page

  @PaginatorValidation
  Scenario: Validate the text and pagination icon below the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then User see the text as "Showing 1 to 5 of 4557 entries"

  @FooterValidation
  Scenario: Validate the footer
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then User see Footer text as "In total there are 4557 programs."

  @ValidateStateOfDeleteBtn
  Scenario: Validate the Default state of Delete button
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see a Delete button on the top left hand side as Disabled

  @ValidateAddNewProgramTab
  Scenario: Validate Add A New Program button
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see a "+A New Program" button on the program page above the data table

  @NumberOfRows
  Scenario: Validate that number of records (rows of data in the table) displayed
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the number of records (rows of data in the table) displayed on the page are 5

  @VarifyTableInProgram
  Scenario: Verify data table on the Program page
    Given: Admin is on dashboard page after Login
    When: Admin clicks "Program" on the navigation bar
    Then: Admin should see data table on the Manage Program Page with following column headers (Program Name, Program Description, Program Status, Edit,Delete)


  @SortArrowIcon
  Scenario: Verify Sort arrow icon on the data table
    Given: Admin is on dashboard page after Login
    When: Admin clicks "Program" on the navigation bar
    Then: Admin should see the sort arrow icon beside to each column header except Edit and Delete


  @VerifyCheckboxonthedatatable1
  Scenario: Verify Check box on the data table
    Given: Admin is on dashboard page after Login
    When: Admin clicks "Program" on the navigation bar
    Then: Admin should see check box on the left side in all rows of the data table


  @VerifyEditDeletebuttons
  Scenario: Verify Edit and Delete buttons
    Given: Admin is on dashboard page after Login
    When: Admin clicks "Program" on the navigation bar
    Then: Admin should see the Edit and Delete buttons on each row of the data table


  @VerifySearchbar
  Scenario: Verify Search bar on the Program page
    Given Admin is on dashboard page after Login
    When User is on Manage Program page
    Then User see the Search Text box has text as "Search"

  @SearchFunctionality
  Scenario Outline: Validate Search by  Program Name,Program Description,Program Status
    Given Admin is on Manage Program Page
    When User enters "<SearchKeyWord>" to be searched
    Then User see the entries for the searched "<SearchKeyWord>" are shown

    Examples: 
      | SearchKeyWord       |
      | Program Name        |
      | Program Description |
      | Program Status      |

  @ValidatingtheSearchwithunrelatedkeyword16
  Scenario: Validating the Search with unrelated keyword
    Given:  Admin is on Manage Program Page
    When: Admin enters the keywords not present in the data table on the Search box 
    Then: Admin should see zero entries on the data table


  @ValidateProgramDetailsPopupwindow17
  Scenario: Validate Program Details Popup window
    Given: Admin is on Manage Program Page
    When: Admin clicks <A New Program>button
    Then: Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close(X) Icon on the top right corner of the window


  @18
  Scenario: Validate input fields and their text boxes in Program details form
    Given: Admin is on Manage Program Page
    When: Admin clicks <A New Program>button
    Then: Admin should see two input fields and their respective text boxes in the program details window


  @19
  Scenario: Validate radio button for Program Status
    Given: Admin is on Manage Program Page
    When: Admin clicks <A New Program>button
    Then: Admin should see two radio button for Program Status


  @20
  Scenario: Empty form submission
    Given: Admin is on "Program Details" Popup window
    When: Admin clicks <Save>button without entering any data
    Then: Admin gets a Error message alert


  @21
  Scenario: Enter only Program Name
    Given: Admin is on "Program Details" Popup window
    When: Admin enters only<Program Name> in text box and clicks Save button
    Then: Admin gets a message alert 'Description is required'


  @22
  Scenario: Enter only Program Description
    Given: Admin is on "Program Details" Popup window
    When: Admin enters only<Program description> in text box and clicks Save button
    Then: Admin gets a message alert 'Name is required'


  @23
  Scenario: Select Status only
    Given:  Admin is on "Program Details" Popup window
    When: Admin selects only Status and clicks Save button
    Then: Admin gets a message alert 'Name and Description required'


  @24
  Scenario: Validate invalid values on the text column
    Given: Admin is on "Program Details" Popup window
    When: Admin enters only numbers or special char in name and desc column
    Then: Admin gets a Error message alert


  @25
  Scenario: Validate Cancel/Close(X) icon on Program Details form
    Given: Admin is on "Program Details" Popup window
    When: Admin clicks Cancel/Close(X) Icon on Program Details form
    Then: Program Details popup window should be closed without saving


  @26
  Scenario: Validate Save button on Program Details form
    Given:   Admin is on "Program Details" Popup window
    When: Enter all the required fields with valid values and click Save button
    Then: Admin gets a message "Successful Program Created" alert and able to see the new program added in the data table


  @27
  Scenario: Validate Cancel button on Program Details form
    Given: Admin is on "Program Details" Popup window
    When: Admin clicks <Cancel>button 
    Then: Admin can see the Program details popup disappears without creating any program


  @28
  Scenario: Validate Edit Feature
    Given: Admin is on Manage Program Page 
    When: Admin clicks <Edit> button on the data table for any row
    Then: Admin should see a popup open for Program details to edit


  @29
  Scenario: Edit Program Name
    
    Given: Admin is on Program Details Popup window to Edit
    When: Admin edits the Name column and clicks save button
    Then: Admin gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program


  @30
  Scenario: Edit Program description
    
    Given:  Admin is on Program Details Popup window to Edit
    When: Admin edits the Description column and clicks save button
    Then: Admin gets a message "Successful Program Updated" alert and able to see the updated description in the table for the particular program


  @31
  Scenario: Change Program Status
    Given: Admin is on Program Details Popup window to Edit
    When: Admin changes the Status and clicks save button
    Then: Admin gets a message "Successful Program Updated" alert and able to see the updated status in the table for the particular program


  @32
  Scenario: Validate invalid values on the text column
    Given: Admin is on Program Details Popup window to Edit
    When: Admin enters only numbers or special char in name and desc column
    Then: Admin gets a Error message alert


  @33
  Scenario: Validate Cancel button on Edit popup
    Given: Admin is on Program Details Popup window to Edit
    When: Admin clicks <Cancel>button on edit popup
    Then: Admin can see the Program details popup disappears and can see nothing changed for particular program


  @34
  Scenario: Validate Save button on Edit popup
    Given: Admin is on Program Details Popup window to Edit
    When: Admin clicks <Save>button on edit popup
    Then: Admin gets a message "Successful Program Updated" alert and able to see the updated details in the table for the particular program


  @35
  Scenario: Delete Feature
    Given: Admin is on Manage Program Page 
    When: Admin clicks <Delete> button on the data table for any row
    Then: Admin should see a alert open with heading "Confirm" along with  <YES> and <NO> button for deletion


  @36
  Scenario: Validate details for Confirm Deletion form
    Given: Admin is on Manage Program Page 
    When: Admin clicks <Delete> button on the data table for any row
    Then: Admin should see a message "Are you sure you want to delete <Program name>?"


  @37
  Scenario: Click Yes on deletion window
    Given: Admin is on Confirm Deletion alert
    When: Admin clicks <YES> button on the alert
    Then: Admin gets a message "Successful Program Deleted" alert and able to see that program deleted in the data table


  @38
  Scenario: Click No on deletion window
    Given: Admin is on Confirm Deletion alert
    When: Admin clicks <NO> button on the alert
    Then: Admin can see the deletion alert disappears without deleting


  @39
  Scenario: Validate Cancel/Close(X) icon on Confirm Deletion alert
    Given: Admin is on Confirm Deletion alert
    When: Admin clicks Cancel/Close(X) Icon on Deletion alert
    Then: Admin can see the deletion alert disappears without any changes


  @40
  Scenario: Validate Common Delete button enabled after clicking on any checkbox
    Given: Admin is in Manage Program page
    When: Admin clicks any checkbox in the data table
    Then: Admin should see common delete option enabled under header Manage Program


  @41
  Scenario: Validate multiple program deletion by selecting Single checkbox
    
    Given: Admin is on Confirm Deletion alert
    When: Admin clicks <YES> button on the alert
    Then: Admin should land on Manage Program page and can see the selected program is deleted from the data table


  @41
  Scenario: Validate multiple program deletion by selecting Single checkbox
    
    Given: Admin is on Confirm Deletion alert
    When: Admin clicks <NO> button on the alert
    Then: Admin should land on Manage Program page and can see the selected program is not deleted from the data table


  @42
  Scenario Outline: Validate multiple program deletion by selecting multiple check boxes
    Given Admin is on Confirm Deletion alert
    When Admin clicks <Button> button on the alert
    Then Admin should land on Manage Program page
    And Admin can see the selected programs are <Deleted> from the data table

    Examples: 
      | Button | Deleted     |
      | YES    | deleted     |
      | NO     | not deleted |

  @43
  Scenario Outline: Validates Sorting(data ordering) on the Program Data table
    Given Admin is on Manage Program Page after clicks Program on the navigation bar
    When Admin clicks the sort icon of <Column name> column
    Then The data get sorted on the table based on the <Column name> column values in <Order> order

    Examples: 
      | column name    | order      |
      | program name   | ascending  |
      | program name   | descending |
      | program Desc   | ascending  |
      | program Desc   | descending |
      | program Status | ascending  |
      | program Status | descending |

  @44
  Scenario: Verify Next page link
    Given: Admin is on Manage Program page
    When: Admin clicks Next page link on the program table 
    Then: Admin should see the Pagination has "Next" link


  @45
  Scenario: Verify Next last link
    Given: Admin is on Manage Program page 
    When: Admin clicks Last page link
    Then: Admin should see the last page record on the table with Next page link are disabled


  @46
  Scenario: Verify First page link
    Given: Admin is on last page of Program table
    When: Admin clicks First page link
    Then: Admin should see the previous page record on the table with pagination has previous page link


  @47
  Scenario: Verify Start page link
    Given: Admin is on Previous Program page 
    When: Admin clicks Start page link
    Then: Admin should see the very first page record on the table with Previous page link are disabled


  @48
  Scenario Outline: Navigate to Different Pages from the Navigation Bar
    Given Admin is on Manage Program page
    When Admin clicks on <LinkName> link on Manage Program page
    Then Admin is re-directed to <DestinationPage> page

    Examples: 
      | LinkName   | DestinationPage |
      | Student    | Student         |
      | Batch      | Batch           |
      | Class      | Class           |
      | User       | User            |
      | Assignment | Assignment      |
      | Attendance | Attendance      |
      | Logout     | Login           |
