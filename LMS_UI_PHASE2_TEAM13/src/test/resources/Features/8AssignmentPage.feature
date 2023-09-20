@Assignment
Feature: Validating Assignment Page

     #AssignmentPageValidation
     @Assignment_TC_001
  Scenario: Validate landing in Assignment Page
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see URL with "Manage Assignment Page"

     #AssignmentPageValidation
     @Assignment_TC_002
  Scenario: Capture the response time for navigating to Assignment Page
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see able to capture Response time from the URL with "Manage Assignment Page"

     #AssignmentPageValidation
     @Assignment_TC_003
  Scenario: Validating the Manage Assignment Page Header
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see a heading with text "Manage Assignment" on the page

     #AssignmentPageValidation
     @Assignment_TC_004
  Scenario: Validating text in Manage Assignment Page
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see correct spelling for all the fields on "Manage Assignment Page"

     #AssignmentPageValidation
     @Assignment_TC_005
  Scenario: Validate the Default state of Delete button
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see disabled delete icon below the header

     #AssignmentPageValidation
     @Assignment_TC_006
  Scenario: Verify Search bar on the Manage Assignment page
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see search bar on the "Manage Assignment Page"
 
     #AssignmentPageValidation
     @Assignment_TC_007
  Scenario: Validate Add A New Assignment button
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see a "+A New Assignment" button on the "Manage Assignment Page"

     #AssignmentPageValidation
     @Assignment_TC_008
  Scenario: Verify data table on the Assignment page
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see data table on the Manage Assignment Page with column headers (Check box symbol,Assignment Name, Assignment Description, Assignment Date, Assignment Grade, Edit Delete)
    
     #AssignmentPageValidation
     @Assignment_TC_009
  Scenario: Verify Edit icon when with data in the table
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see the Edit Icon in each row of data table only when entries are available

     #AssignmentPageValidation
     @Assignment_TC_010
  Scenario: Verify Edit icon when no data in the table
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see that Edit Icon will not be present in data table

     #AssignmentPageValidation
     @Assignment_TC_011
  Scenario: Verify Delete icon when with data in the table
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see the Delete Icon in each row of data table only when entries are available

     #AssignmentPageValidation
     @Assignment_TC_012
  Scenario: Verify Delete icon when no data in the table
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see that Delete Icon will not be present in data table
    
     #AssignmentPageValidation
     @Assignment_TC_013
  Scenario: Verify Sort icon in the data table
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see the sort icon near the column headers except for Edit and Delete

     #AssignmentPageValidation
     @Assignment_TC_014
  Scenario: Verify Check box in the data table
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see check box  in the all rows of data table when entries available

     #AssignmentPageValidation
     @Assignment_TC_015
  Scenario: Validate the number of entries displaying
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see the text as "Showing x to y of z entries" below the data table and above the footer.

     #AssignmentPageValidation
     @Assignment_TC_016
  Scenario: Verify Pagination control below the data table
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see the pagination controls under the data table

     #AssignmentPageValidation  
     @Assignment_TC_017
  Scenario: Validate the footer
    Given LMSAdminUser is on dashboard page after Login
    When LMSAdminUser clicks "Assignment" on the navigation bar
    Then LMSAdminUser should see the text with total number assignments in the data table ( " In total there are number of assignments")
    
     #AssignmentPageValidation
     @Assignment_TC_018
  Scenario Outline: Validate Search by  Assignment Name,Assignment Description,Assignment Due Date, Assignment Grade with Valid Data
    Given LMSAdminUser is on Manage Assignment Page
    When LMSAdminUser enters from the given "<SheetName>" and "<RowNumber>" to be searched
    Then LMSAdminUser should see the entries

    Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          1 |
      | Assignment Data |          2 |
      | Assignment Data    |          3 |
      | Assignment Data       |          4 |
      
     #AssignmentPageValidation
     @Assignment_TC_019
  Scenario Outline: Validate Search by  Assignment Name,Assignment Description,Assignment Due Date, Assignment Grade with Invalid Data
    Given LMSAdminUser is on Manage Assignment Page
    When LMSAdminUser enters from the given "<SheetName>" and "<RowNumber>" to be searched
    Then LMSAdminUser should be Displayed empty details in the data table

    Examples: 
     | Sheet Name             | Row Number |
      | Assignment Data        |          5 |
      | Assignment Data |          6 |
      | Assignment Data    |          7 |
      | Assignment Data       |          8 |

      #ValidateAssignmentDetailsPopupWindow
      @Assignment_TC_020
  Scenario: Validate Assignment details popup window
    Given LMSAdminUser is on Manage Assignment Page
    When LMSAdminUser clicks <Add New Assignment> button
    Then LMSAdminUser should see a popup  with  heading "Assignment details"
    
      #ValidateAssignmentDetailsPopupWindow
      @Assignment_TC_021
  Scenario: Validate input fields in Assignment details popup window 
    Given LMSAdminUser is on Manage Assignment Page
    When LMSAdminUser clicks <Add New Assignment> button
    Then LMSAdminUser should see input fields Text (Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)

      #ValidateAssignmentDetailsPopupWindow
      @Assignment_TC_022
	Scenario: Validate text box present in Assignment details popup window
		Given LMSAdminUser is on Manage Assignment Page
    When LMSAdminUser clicks <Add New Assignment> button
    Then LMSAdminUser should see 8 textbox should be  present in Assignment details popup window
    
      #ValidateAssignmentDetailsPopupWindow
      @Assignment_TC_023
  Scenario: Validate drop down in Batch Number  in Assignment details popup window
  	Given LMSAdminUser is on Manage Assignment Page
    When LMSAdminUser clicks <Add New Assignment> button
    Then LMSAdminUser should see dropdown option for Batch Number
  
      #ValidateAssignmentDetailsPopupWindow
      @Assignment_TC_024
  Scenario: Validate drop down in Program Name in Assignment details popup window
  	Given LMSAdminUser is on Manage Assignment Page
    When LMSAdminUser clicks <Add New Assignment> button
    Then LMSAdminUser should see dropdown option for Program Name
    
      #ValidateAssignmentDetailsPopupWindow
      @Assignment_TC_025
  Scenario: Validate calendar icon in Assignment due date in Assignment details popup window
  	Given LMSAdminUser is on Manage Assignment Page
    When LMSAdminUser clicks <Add New Assignment> button
    Then LMSAdminUser should see calendar icon for assignment due date
    
      #ValidateAssignmentDetailsPopupWindow
      @Assignment_TC_026
  Scenario: Validate save button is present in Assignment details popup window
  	Given LMSAdminUser is on Manage Assignment Page
    When LMSAdminUser clicks <Add New Assignment> button
    Then LMSAdminUser should see save button in the Assignment detail popup window
  
      #ValidateAssignmentDetailsPopupWindow
      @Assignment_TC_027
  Scenario: Validate cancel button is present in Assignment details popup window
  	Given LMSAdminUser is on Manage Assignment Page
    When LMSAdminUser clicks <Add New Assignment> button
    Then LMSAdminUser should see cancel button in the Assignment detail popup window
  
      #ValidateAssignmentDetailsPopupWindow
      @Assignment_TC_028
  Scenario: Validate Cancel/Close(X) button is present in Assignment details popup window
  	Given LMSAdminUser is on Manage Assignment Page
    When LMSAdminUser clicks <Add New Assignment> button
    Then LMSAdminUser should see Cancel/Close(X) button in the Assignment detail popup window  
    
  		#AddNewAssignmentValidation
  		@Assignment_TC_029
  Scenario Outline: Validate that LMSAdminUser able to add new assignment with valid data in mandatory fields
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser enters all mandatory field values with valid data from  "<Sheet Name>" and "<Row Number>" and clicks on save button
  	Then LMSAdminUser should see new assignment details is added in the data table
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          9 |

  		#AddNewAssignmentValidation
  		@Assignment_TC_030
  Scenario Outline: Validate that LMSAdminUser able to add new assignment with invalid data in mandatory fields
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser enters all mandatory field values with invalid data from  "<Sheet Name>" and "<Row Number>" and clicks on save button
  	Then LMSAdminUser should see Error message in alert "Mandatory Fields need to be filled."
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          10 |
      
  		#AddNewAssignmentValidation
  		@Assignment_TC_031
  Scenario Outline: Validate that LMSAdminUser able to add new assignment with valid data in all fields
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser enters all field values with valid data from  "<Sheet Name>" and "<Row Number>" and clicks on save button
  	Then LMSAdminUser should see new assignment details is added in the data table
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          11 |

  		#AddNewAssignmentValidation
  		@Assignment_TC_032
  Scenario Outline: Validate that LMSAdminUser able to add new assignment with invalid data in optional fields
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser enters optional fields with invalid data from  "<Sheet Name>" and "<Row Number>" and clicks on save button
  	Then LMSAdminUser should see Error message in alert
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          12 |
      
  		#AddNewAssignmentValidation
  		@Assignment_TC_033
  Scenario Outline: Validate that LMSAdminUser able to add new assignment with missing Program Name
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser enters valid data in all fields except Program Name with no data from  "<Sheet Name>" and "<Row Number>" and clicks on save button
  	Then LMSAdminUser should see "Program Name is Missing" alert
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          13 |    
      
      
  		#AddNewAssignmentValidation
  		@Assignment_TC_034
  Scenario Outline: Validate that LMSAdminUser able to add new assignment with missing Batch Number
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser enters valid data in all fields except Batch Number with no data from  "<Sheet Name>" and "<Row Number>" and clicks on save button
  	Then LMSAdminUser should see "Batch Number is Missing" alert
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          14 |      
      
  		#AddNewAssignmentValidation
  		@Assignment_TC_035
  Scenario Outline: Validate that LMSAdminUser able to add new assignment with missing Assignment name
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser enters valid data in all fields except Assignment name with no data from  "<Sheet Name>" and "<Row Number>" and clicks on save button
  	Then LMSAdminUser should see "Assignment name is Missing" alert
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          15 |    
      
  		#AddNewAssignmentValidation
  		@Assignment_TC_036
  Scenario Outline: Validate that LMSAdminUser able to add new assignment with missing Assignment due date
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser enters valid data in all fields except Assignment due date with no data from  "<Sheet Name>" and "<Row Number>" and clicks on save button
  	Then LMSAdminUser should see "Assignment due date is Missing" alert
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          16 |    
      
  		#AddNewAssignmentValidation
  		@Assignment_TC_037
  Scenario Outline: Validate that LMSAdminUser able to add new assignment with missing Grade by
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser enters valid data in all fields except Grade by with no data from  "<Sheet Name>" and "<Row Number>" and clicks on save button
  	Then LMSAdminUser should see "Grade by is Missing" alert
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          17 |  
      
  		#AddNewAssignmentValidation
  		@Assignment_TC_038
  Scenario Outline: Validate that LMSAdminUser able to add new assignment with passing past date
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser enters valid data in all fields except Assignment due date with passing past date from  "<Sheet Name>" and "<Row Number>" and clicks on save button
  	Then LMSAdminUser should see "Assignment cannot be created for the passed date" alert
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          18 |    
      
  		#AddNewAssignmentValidation
  		@Assignment_TC_039
  Scenario: Validate date picker
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser clicks date from date picker
  	Then LMSAdminUser should see selected date in class date text box
  	
  		#AddNewAssignmentValidation
  		@Assignment_TC_040
  Scenario: Validate date picker format
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser clicks date from date picker
  	Then LMSAdminUser should see selected date in mm/dd/yyyy format
  	
  		#AddNewAssignmentValidation
  		@Assignment_TC_041
  Scenario: Validate right arrow in data picker to navigate to next month
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser clicks right arrow in the date picker near month
  	Then LMSAdminUser should see Next month calendar
  	
  		#AddNewAssignmentValidation
  		@Assignment_TC_042
  Scenario: Validate left arrow in data picker to navigate to previous month
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser clicks left arrow in the date picker near month
  	Then LMSAdminUser should see previous month calendar
  
  		#AddNewAssignmentValidation
  		@Assignment_TC_043
  Scenario: Validate current date is highlighted in the date picker
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser clicks date picker button
  	Then LMSAdminUser should see that current date is highlighted in the date picker
  	
  		#AddNewAssignmentValidation
  		@Assignment_TC_044
  Scenario: Validate selected date is highlighted in the date picker
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
  	When LMSAdminUser clicks date picker button
  	Then LMSAdminUser should see that selected date is highlighted in the date picker
  	
  		#AddNewAssignmentValidation
  		@Assignment_TC_045
  Scenario: Validate Cancel/Close(X) icon on assignment details popup window
    Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
    When LMSAdminUser clicks Cancel/Close(X) Icon  without entering values in the fields
    Then LMSAdminUser should land on manage assignment page	
    
  		#AddNewAssignmentValidation
  		@Assignment_TC_046
  Scenario: Validate cancel button function in assignment details popup window with values in field
    Given LMSAdminUser is on Manage Assignment Page and clicks on Add New Assignment to open assignment details popup window
    When LMSAdminUser clicks Cancel button entering values in the fields
    Then LMSAdminUser should land on manage assignment Page and validate new assignment is not created in the data table
  
  		#EditAssignmentValidation
  		@Assignment_TC_047
  Scenario: Verify Edit assignment popup window
  	Given LMSAdminUser is on manage assignment page
  	When LMSAdminUser clicks Edit button in data table 
  	Then LMSAdminUser should see Edit popup window with Assignment Details header
  	
  		#EditAssignmentValidation
  		@Assignment_TC_048
  Scenario: Verify values in popup window
  	Given LMSAdminUser is on manage assignment page
  	When LMSAdminUser clicks Edit button from one of the row in data table 
  	Then LMSAdminUser should see Edit popup window with same row values in the all fields
  	
  		#EditAssignmentValidation
  		@Assignment_TC_049
  Scenario Outline: Validate LMSAdminUser able to update assignment with valid data in mandatory fields
  	Given Given LMSAdminUser is on Manage Assignment Page and clicks on Edit button to open Edit assignment details popup window
  	When LMSAdminUser enters all mandatory field values with valid data from from  "<Sheet Name>" and "<Row Number>" and clicks save button
  	Then LMSAdminUser should see updated assignment details is added in the data table
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          11 |  
      
  		#EditAssignmentValidation
  		@Assignment_TC_050
  Scenario Outline: Validate LMSAdminUser able to update assignment with invalid data in mandatory fields
  	Given Given LMSAdminUser is on Manage Assignment Page and clicks on Edit button to open Edit assignment details popup window
  	When LMSAdminUser enters all mandatory field values with invalid data from from  "<Sheet Name>" and "<Row Number>" and clicks save button
  	Then LMSAdminUser should see Error message in alert
  	
  	Examples: 
      | Sheet Name             | Row Number |
      | Assignment Data        |          12 | 
      
  		#EditAssignmentValidation
  		@Assignment_TC_051
  Scenario: Validate LMSAdminUser able to update assignment missing program name
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Edit New Assignment to open Edit assignment details popup window
  	When LMSAdminUser enters missing value in program name and clicks on save button
  	Then LMSAdminUser should see "Program Name is Missing" alert
      
  		#EditAssignmentValidation
  		@Assignment_TC_052
  Scenario: Validate LMSAdminUser able to update assignment missing Batch number
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Edit New Assignment to open Edit assignment details popup window
  	When LMSAdminUser enters missing value in Batch number and clicks on save button
  	Then LMSAdminUser should see "Batch number is Missing" alert      
      
  		#EditAssignmentValidation
  		@Assignment_TC_053
  Scenario: Validate LMSAdminUser able to update assignment missing Assignment name
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Edit New Assignment to open Edit assignment details popup window
  	When LMSAdminUser enters missing value in Assignment name and clicks on save button
  	Then LMSAdminUser should see "Assignment name is Missing" alert    
      
  		#EditAssignmentValidation
  		@Assignment_TC_054
  Scenario: Validate LMSAdminUser able to update assignment missing Assignment due date
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Edit New Assignment to open Edit assignment details popup window
  	When LMSAdminUser enters missing value in Assignment due date and clicks on save button
  	Then LMSAdminUser should see "Assignment due date is Missing" alert
  	
  		#EditAssignmentValidation
  		@Assignment_TC_055
  Scenario: Validate LMSAdminUser able to update assignment missing Grade by
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Edit New Assignment to open Edit assignment details popup window
  	When LMSAdminUser enters missing value in Grade by and clicks on save button
  	Then LMSAdminUser should see "Grade by is Missing" alert
  	
  		#EditAssignmentValidation
  		@Assignment_TC_056
  Scenario: Validate  LMSAdminUser able to update assignment passing past date
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Edit New Assignment to open Edit assignment details popup window
  	When LMSAdminUser enters passed date in the due date field and clicks save button
  	Then LMSAdminUser should see "Assignment cannot be updated for the passed date" alert
  	
  		#EditAssignmentValidation
  		@Assignment_TC_057
  Scenario: Validate cancel button function in assignment details popup window
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Edit New Assignment to open Edit assignment details popup window
  	When LMSAdminUser clicks Cancel button without entering values in the fields
  	Then LMSAdminUser should land on manage assignment page
  	
  		#EditAssignmentValidation
  		@Assignment_TC_058
  Scenario: Validate cancel button function in assignment details popup window with values in field
  	Given LMSAdminUser is on Manage Assignment Page and clicks on Edit New Assignment to open Edit assignment details popup window
  	When LMSAdminUser clicks Cancel button entering values in the fields
  	Then LMSAdminUser should land on manage assignment Page and validate new assignment is not created in the data table
  	
  		#DeleteAssignmentValidation
  		@Assignment_TC_059
  Scenario: Verify Delete Assignment alert
  	Given 	LMSAdminUser is on Manage Assignment Page
  	When LMSAdminUser clicks delete button in data table row level
  	Then LMSAdminUser should see dialog box
  	
  		#DeleteAssignmentValidation
  		@Assignment_TC_060
  Scenario: Verify  accept enabled in alert
  	Given LMSAdminUser is on Manage Assignment Page
  	When LMSAdminUser clicks delete button in data table row level
  	Then Alert should have "yes" button to accept
  	
  		#DeleteAssignmentValidation
  		@Assignment_TC_061
  Scenario: Verify reject enabled in alert
  	Given 	LMSAdminUser is on Manage Assignment Page
  	When LMSAdminUser clicks delete button in data table row level
  	Then Alert should have "No" button to reject
  	
  		#DeleteAssignmentValidation
  		@Assignment_TC_062
  Scenario: Validate accept in alert
  	Given 	LMSAdminUser clicks row level delete button after landing to manage assignment page
  	When LMSAdminUser clicks yes button
  	Then LMSAdminUser should be redirected to assignment page and selected assignment details are deleted from the data table
  	
  		#DeleteAssignmentValidation
  		@Assignment_TC_063
  Scenario: Validate reject in alert
  	Given 	LMSAdminUser clicks row level delete button after landing to manage assignment page
  	When LMSAdminUser clicks No button
  	Then LMSAdminUser should be redirected to assignment page and selected assignment details are not deleted from the data table
  	
  		#DeleteMultipleClassValidation
  		@Assignment_TC_064
  Scenario: Verify delete multiple class  button is enabled
  	Given 	LMSAdminUser is on Manage Assignment Page
  	When LMSAdminUser clicks single  row level check box in the data table
  	Then LMSAdminUser should see delete icon below the header is enabled
  	
  		#DeleteMultipleClassValidation
  		@Assignment_TC_065
  Scenario: Verify accept alert in delete multiple class function by selecting single checkbox
  	Given LMSAdminUser is on Manage Assignment Page and clicks delete button under header after selecting the check box in the data table
  	When LMSAdminUser clicks yes button
  	Then LMSAdminUser should be redirected to assignment page and selected assignment details are deleted from the data table
  	
  		#DeleteMultipleClassValidation
  		@Assignment_TC_066
  Scenario: Verify reject alert in delete multiple class function by selecting single checkbox
  	Given LMSAdminUser is on Manage Assignment Page and clicks delete button under header after selecting the check box in the data table
  	When LMSAdminUser clicks no button
  	Then LMSAdminUser should be redirected to assignment page and selected assignment details are not deleted from the data table
  	
  		#DeleteMultipleClassValidation
  		@Assignment_TC_067
  Scenario: Verify accept alert in delete multiple class function by selecting multiple checkbox
  	Given LMSAdminUser is on Manage Assignment Page and clicks delete button under header after selecting the multiple check box in the data table
  	When LMSAdminUser clicks yes button
  	Then LMSAdminUser should be redirected to assignment page and selected assignment details are deleted from the data table
  	
  		#DeleteMultipleClassValidation
  		@Assignment_TC_068
  Scenario: Verify reject alert in delete multiple class function by selecting multiple checkbox
  	Given LMSAdminUser is on Manage Assignment Page and clicks delete button under header after selecting the multiple check box in the data table
  	When LMSAdminUser clicks No button
  	Then LMSAdminUser should be redirected to assignment page and selected assignment details are not deleted from the data table
  	
  		#SortFunctionValidation
  		@Assignment_TC_069
  Scenario: Verify sort function in data table for descending order
  	Given LMSAdminUser is in manage assignment page
  	When LMSAdminUser click on assignment name column header to sort
  	Then LMSAdminUser should see data table sorted in descending order
  	
  		#SortFunctionValidation
  		@Assignment_TC_070
  Scenario: Verify sort function in data table for ascending order
  	Given LMSAdminUser is in manage assignment page
  	When LMSAdminUser double click on assignment name column header to sort
  	Then LMSAdminUser should see data table sorted in ascending order
  	
  		#Pagination
  		@Assignment_TC_071
  Scenario: Verify sheet one is displayed on default in data table
    Given LMSAdminUser is in manage assignment page 
    When LMSAdminUser is in manage assignment page
    Then LMSAdminUser should see that Data table displays 1 page  when entries available
    
  		#Pagination
  		@Assignment_TC_072
  Scenario: Verify  right arrow is enable when sheet one is displayed in data table
    Given LMSAdminUser is in manage assignment page 
    When LMSAdminUser is in manage assignment page
    Then LMSAdminUser should see that Right arrow should be enabled in page one  when entries are more than 5 available
    
    	#Pagination
  		@Assignment_TC_073
  Scenario: Verify  left arrow is enable when sheet one is displayed in data table
    Given LMSAdminUser is in manage assignment page 
    When LMSAdminUser is in manage assignment page
    Then LMSAdminUser should see that left arrow should be enabled in page one  when entries are more than 5 available
  
			#Pagination
  		@Assignment_TC_074
  Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
    Given LMSAdminUser is in manage assignment page 
    When LMSAdminUser is in manage assignment page
    Then LMSAdminUser should see that Right arrow should be enabled in page two when entries are more than 10 available
    
			#Pagination
  		@Assignment_TC_075
  Scenario: Verify  left arrow is enable when sheet two is displayed in data table
    Given LMSAdminUser is in manage assignment page 
    When LMSAdminUser is in manage assignment page
    Then LMSAdminUser should see that Left arrow should be enabled in page two 
    
			#Pagination
  		@Assignment_TC_076
  Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
    Given LMSAdminUser is in manage assignment page 
    When LMSAdminUser is in manage assignment page
    Then LMSAdminUser should see that Data table displays  page 1  when entries available 
    
			#Pagination
  		@Assignment_TC_077
  Scenario: Verify pagination controls enabled
    Given LMSAdminUser is in manage assignment page 
    When LMSAdminUser is in manage assignment page
    Then LMSAdminUser should see that entries are more than 5 in data table pagination controls enabled
    
			#Pagination
  		@Assignment_TC_078
  Scenario: Verify pagination controls disabled
    Given LMSAdminUser is in manage assignment page 
    When LMSAdminUser is in manage assignment page
    Then LMSAdminUser should see that entries are less than 5 in data table pagination controls disabled
    
			#Pagination
  		@Assignment_TC_079
  Scenario: Verify next page is enabled
    Given LMSAdminUser click +Add New assignment button after reaching to manage assignment page 
    When LMSAdminUser creates 6 new assignment
    Then LMSAdminUser should see that if total class entries above 5 next page is enabled ( On multiples of 5 new page will be enabled)
    
			#Pagination
  		@Assignment_TC_080
  Scenario: Verify next page is disabled
    Given LMSAdminUser click +Add New assignment button after reaching to manage assignment page 
    When LMSAdminUser creates less than or equal to 5 new  assignment 
    Then LMSAdminUser should see that if total class entries are below 5 then next page is disabled
    
  
   

 



    

