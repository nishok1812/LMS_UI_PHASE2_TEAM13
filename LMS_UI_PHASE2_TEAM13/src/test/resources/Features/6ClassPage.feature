@Class_Module

	
Feature: Manage class page verification
	#Manage Class Page Verification
	@Class_TC_001
Scenario: Verify landing in class page
	Given Admin is in dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Admin should see URL with "Manage Class" for class
				
@Class_TC_002
Scenario: Capture the response time to navigate to manage class page
	Given Admin is on dashboard page after Login in Class
	When Admin click "Class" button on the navigation bar for class
	Then Get the response time for navigation from dashboard page to manage class page for class

@Class_TC_003
Scenario: Verify Manage Class Page Header
	Given Admin is on dash board page after Login in Class
	When admin clicks "Class" button on the navigation bar for class
	Then Admin should see header with "Manage Class" for class
	
@Class_TC_004
Scenario: Validate text in manage class page
	Given admin is on dashboard page after Login in Class
	When  Admin clicks "Class" button on the navigation bar and get all text from the portal page for class
	Then  Admin should see correct spelling for the all the fields for class
		
@Class_TC_005
Scenario: Verify delete icon below the header
	Given Admin is on dashboard page after Logging in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Admin should see disabled delete icon below the "Manage Class" for class
		
@Class_TC_006
Scenario: Verify search bar on the class page
 Given Admin is on dashboard page after successful Login
 When Admin clicks "Class" button at the navigation bar for class
 Then Admin should see search bar on the class page for class
 
 @Class_TC_007
Scenario: Verify add new class button  on class page
	Given Admin is on dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Admin should see +Add New Class button on the class page for class
			
@Class_TC_008
Scenario: Verify data table on the class page
	Given Admin is on dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Admin should see data table on the Manage Class Page With following column headers (Check box symbol,Batch Id, Class No,Class Date, Class Topic, Staff Id, Description, Comments, Notes, Recording, Edit Delete) for class
			 
@Class_TC_009
 Scenario: Verify Edit icon in the data table
	Given Admin is on dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Edit Icon in each row of data table only  when entries are available for class
			
@Class_TC_010
	Scenario: Verify Edit icon when no data in the table
	Given Admin is on dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Edit Icon will not be present in data table for class
		
@Class_TC_011
Scenario: Verify delete icon in the data table
	Given Admin is on dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Delete Icon in each row of data table only  when entries are available for class
		
@Class_TC_012
Scenario: Verify delete icon when no data in the table
	Given Admin is on dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Admin cant see delete  Icon in data table for class
		
@Class_TC_013
Scenario: Verify sort icon in the data table
	Given Admin is on dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Admin should see sort icon near the column headers except for Edit and Delete for class
		
@Class_TC_014
Scenario: Verify check box in the data table
	Given Admin is on dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Admin should see check box in the all rows  of data table for class
		
@Class_TC_015
Scenario: Validate the number entries displaying
	Given Admin is on dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table x- starting record number on that pagey-ending record number on that page z-Total number of records  Note: with or without entries for class
			
@Class_TC_016
	Scenario: Verify Pagination control below the data table
	Given Admin is on dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Admin should see the pagination controls under the data table for class
	
	@Class_TC_017
Scenario: Validate footer  text
	Given Admin is on dashboard page after Login in Class
	When Admin clicks "Class" button on the navigation bar for class
	Then Admin should see the text with total number classes in the data table ("In total there are number of classes") for class
		
@Class_TC_018
Scenario Outline: Validate search box function for various valid searches using batch id, class no, class topic, staff id, class date
	Given Admin is on the manage class page in Class
	When Admin enters valid "<SearchField>" in the search box for class
  Then Displays entries with that "<ReturnField>" for class
    Examples:
		       | SearchField| ReturnField |
		       | 7576       |   7576      |
		       |  1         |    1        |
		       | Python     |  Python     |
		       | U01        |  U01        |
		       | 12/22/22   | 12/22/22    |
		
@Class_TC_019
Scenario Outline: Validate search box function for various invalid searches using batch id, class no, class topic, staff id, class date
	Given Admin is on the manage class page in Class
	When Admin enters invalid "<SearchField>" in the search box for class
  Then Displays empty details in the data table for class
    Examples:
		       | SearchField| 
		       | 7578       |  
		       |  8         |
		       | slack      | 
		       | U09        |
		       | 12/22/20   |
		
# Class Details Pop-up window
@Class_TC_020
Scenario: Verify class details popup window
	Given Admin is on the manage class page in Class
	When Admin click +Add New Class button for class
	Then Admin should see a popup  with  heading "class details" for class
		
@Class_TC_021
Scenario: Verify input fields in class details popup window
	Given Admin is on the manage class page in Class
	When Admin click Add New Class button for class
	Then Admin should see input fields Text (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings) for class
		
@Class_TC_022
Scenario: Verify text box present in class details popup window
	Given Admin is on the manage class page in Class
	When Admin click Add New Class button for class
	Then six textbox should be  present in Class details popup window for class
			
@Class_TC_023
Scenario: Verify drop down in Batch Id  in class details popup window
	Given Admin is on the manage class page in Class
	When Admin click Add New Class button for class
	Then Admin should see  dropdown option for Batch ID for class
	
	@Class_TC_024
Scenario: Verify drop down in Staff Id  in class details popup window
	Given Admin is on the manage class page in Class
	When Admin click Add New Class button for class
	Then Admin should see  dropdown option for Staff Id for class
			
@Class_TC_025
Scenario: Verify calendar icon in class date  in class details popup window
	Given Admin is on the manage class page in Class
	When Admin click Add New Class button for class
	Then Admin should see  calendar icon for class date for class
	
	@Class_TC_026
Scenario: Verify save button is present
	Given Admin is on the manage class page in Class
	When Admin click Add New Class button for class
	Then Admin should see  save button in the class detail popup window for class
		
@Class_TC_027
Scenario: Verify cancel button is present
 Given Admin is on the manage class page in Class
 When Admin click Add New Class button for class
 Then Admin should see  cancel button in the class detail popup window for class
		
@Class_TC_028
Scenario: Verify close button in class details popup window
Given Admin is on the manage class page in Class
When Admin click Add New Class button for class
Then Admin should see  close button on the class details popup window for class

#Add new class 
@Class_TC_029
Scenario: Validate all batch id is reflecting in the dropdown
Given Admin is in the class detail pop up window in Class
When Admin clicks  Batch ID dropdown for class
Then Batch id in the drop down should match with Batch id manage batch page table for class
		
@Class_TC_030
Scenario Outline: Validate admin is able to add new class with valid data in mandatory fields
 Given Admin is in the class detail pop up window in Class
 When Admin enters all mandatory field values with valid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id) from "<SheetName>" and "<RowNumber>" for class
 Then Admin should see new class details is added in the data table for class
 	Examples: 
	         |SheetName   |RowNumber  | 
	         |Class       |         0 | 
		
@Class_TC_031
Scenario Outline: Validate admin is able to add new class with invalid data in mandatory fields
Given Admin is in the class detail pop up window in Class
When Admin enters all mandatory field values with invalid data and clicks save button( Batch ID , No of Classes, Class Date, Staff Id )from "<SheetName>" and "<RowNumber>" for class
Then Error message "<Error>" should appear in  alert for class
	Examples: 
	         |SheetName   |RowNumber  | Error|
	         |Class       |    0      | Batch Id is missing |
	         |Class       |    1      | No of classes is missing|
	         |Class       |    2      | Class Date is missing |
	         |Class       |    3      | Staff Id is missing |
		
@Class_TC_032
Scenario Outline: Validate admin is able to add new class with valid data  in all fields
	Given Admin is in the class detail pop up window in Class
	When Admin enters values in all fields with valid data and clicks save button (Batch ID , No of Classes, Class Date, Class Topic,Staff Id, Class description, Comments, Notes, Recordings) from "<SheetName>" and "<RowNumber>" for class
	 	Then Admin should see new class details is added in the data table for class
		Examples: 
	         |SheetName   |RowNumber |
	         | Class      | 0        |
		
@Class_TC_033
Scenario Outline: Validate admin is able to add new class with invalid data  in optional fields
Given Admin is in the class detail pop up window in Class
When Admin enters invalid data in optional fields and clicks save button (Class description, Comments, Notes, Recordings) from "<SheetName>" and "<RowNumber>" for class
Then Error message "<Error>" should appear in alert for class
    Examples: 
	         |SheetName   |RowNumber  | Error  											|
	         |Class       |         1 | Batch Id is missing 		|
	         |Class   		|         2 | No of Classes is missing 		  |
	         |Class   		|         3 | Class Date is missing 		|
	         |Class   		|         4 | Staff Id is missing 		  |
	          
		
@Class_TC_034
Scenario: Validate admin is able to add new class missing Batch Id
Given Admin is in the class detail pop up window in Class
When Admin enters  data missing value in Batch ID and clicks save button (No of Classes, Class Date, Staff Id) for class
Then Batch Id is missing for class
		
@Class_TC_035
Scenario: Validate admin is able to add new class missing No of Class
Given Admin is in the class detail pop up window in Class
When Admin enters data missing value in No of class and clicks save button (Batch ID ,  Class Date, Staff Id ) for class
Then No of classes is missing for class

@Class_TC_036
Scenario: Validate admin is able to add new class missing Class Date
Given Admin is in the class detail pop up window in Class
When Admin enters data missing value in  class date and clicks save button (Batch ID , No of Classes, Staff Id ) for class
Then class date is missing for class
		
@Class_TC_037
Scenario: Validate admin is able to add new class missing staff id
Given Admin is in the class detail pop up  window in Class
When Admin enters data missing value in staff id and clicks save button (Batch ID , No of Classes, Class Date ) for class
Then staff id is missing for class
		
@Class_TC_038
Scenario: Validate  admin able to add new class passing past date 
Given Admin is in the class detail pop up window in Class
When Admin enters passed date in the class date field and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id) for class
Then class cannot be  created for the passed date for class
		
@Class_TC_039
Scenario: Validate date picker
Given Admin is in the class detail pop up window in Class
When Admin clicks date from date picker for class
Then selected date should be their in class date text box for class
		
@Class_TC_040
Scenario: validate date picker should be correct format
Given Admin is in the class detail pop up window in Class
When Admin clicks date from date picker for class
Then selected date should be in  mm/dd/yyyy format for class

@Class_TC_041
Scenario: Validate right arrow in date picker to navigate to next month
Given Admin is in the class detail pop up window in Class
When Admin clicks right arrow in the date picker near month for class
Then Next month calender should visible for class
		
@Class_TC_042
Scenario: Validate left arrow in data picker to navigate to previous month
Given Admin is in the class detail pop up  window in Class
When Admin clicks left arrow in the date picker near month for class
Then previous month calender should visible for class
		
		@Class_TC_043
		Scenario: Validate current date is highlighted in the date picker
		Given Admin is in the class detail pop up window in Class
		When Admin clicks date picker button for class
		Then Admin should see current date is highled in the date picker for class
		
		@Class_TC_044
		Scenario: Validate selected date is highlighted in the date picker
		Given Admin is in the class detail pop up window in Class
		When Admin clicks date picker button and selects future date for class
		Then Admin should see selected date is highled in the date picker for class
		
		@Class_TC_045
		Scenario: Validate cancel button function in class details popup window
		Given Admin is in the class detail pop up window in Class
		When Admin clicks Cancel button without entering values in the fields for class
		Then Admin should land on Manage Class page for class
		 
		@Class_TC_046
		Scenario: Validate cancel button function in class details popup window with values in field
		Given Admin is in the class detail pop up window in Class
		When Admin clicks Cancel button entering values in the fields for class
		Then Admin should land on Manage Class Page and validate new class is not created in the data table for class
		
		#Edit class validation
		@Class_TC_047
		Scenario: Verify Edit class popup window
		Given Admin is in the class detail pop up window in Class
		When Admin clicks Edit button in data table for class
		Then Edit popup window appears with heading Class Details for class
		
		@Class_TC_048
		Scenario: Verify values in popup window
	  Given Admin is in the class detail pop up window in Class
		When Admin clicks Edit button from one of the row in data table for class
		Then Edit popup window appears with same row values in the all fields for class
		
		@Class_TC_049
		Scenario: Validate admin able to update class with valid data in mandatory fields
		Given Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class
		When Admin enters all mandatory field values with valid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id) for class
		Then Admin should see particular class details is updated in the data table for class
		
		@Class_TC_050
		Scenario: Validate admin able to  update class with invalid data in mandatory fields
		Given  Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class
		When Admin enters all mandatory field values with invalid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id, ) for class
		Then Error message should appear in alert for class
				
		@Class_TC_051
		Scenario: Validate admin able to  update class with valid data  in all fields
		Given Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class
		When Admin enters values in all fields with valid data and clicks save button (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description,Comments, Notes, Recordings) for class
		Then Admin should see particular class details is updated in the data table for class
		
		@Class_TC_052
		Scenario: Validate admin able to  update  class with invalid data  in all fields
		Given Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class
		When Admin enters with invalid data in optional fields and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id) for class
		Then Error message should appear in alert for class
		
		@Class_TC_053
		Scenario: Validate admin able to update class missing Batch Id
		Given  Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class
		When Admin enters  data missing value in Batch ID and clicks save button (No of Classes, Class Date, Staff Id) for class
		Then Batch Id is missing for class
		
		@Class_TC_054
		Scenario: Validate admin able to update  class missing No of Class
		Given  Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class
		When Admin enters data missing value in No of class and clicks save button (Batch ID ,  Class Date, Staff Id ) for class
		Then No of classes is missing for class
		
		@Class_TC_055
		Scenario: Validate admin able to update class missing Class Date
		Given Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class
		When Admin enters data missing value in  class date and clicks save button (Batch ID , No of Classes, Staff Id ) for class
		Then class date is missing for class
		
		@Class_TC_056
		Scenario: Validate admin able to update class missing staff id
		Given Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class
		When Admin enters data missing value in staff id and clicks save button (Batch ID , No of Classes, Class Date ) for class
		Then staff id is missing for class
		
		@Class_TC_057
		Scenario: Validate  admin able to update class passing past date 
		Given Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class
		When Admin enters passed date in the class date field and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id) for class
		Then class cannot be updated for the passed date for class
		
		@Class_TC_058
		Scenario: Validate cancel button function in Edit class details popup window
		Given Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class
		When Admin clicks Cancel button without entering values in the fields for class
		Then Admin should land on Manage Class page for class
		
		@Class_TC_059
		Scenario: Validate cancel button function in Edit class details popup window with values in field
		Given Admin clicks edit button in manage class page and admin is in the edit class detail pop up window in Class
		When Admin clicks Cancel button entering values in the fields for class
		Then Admin should land on Manage Class Page and validate particular class details are not changed  in the data table for class
		
		# Delete class validation
		@Class_TC_060
		Scenario: Verify Delete class alert
		Given Admin is on the manage class page in Class
		When Admin clicks delete button in data table row level for class
		Then Admin should see alert for class
		
		@Class_TC_061
		Scenario: Verify  accept enabled in alert
		Given  Admin is on the manage class page in Class
		When Admin clicks delete button in data table row level for class
		Then Alert should have "yes" button to accept for class
		
		@Class_TC_062
		Scenario: Verify reject enabled in alert
		Given  Admin is on the manage class page in Class
		When Admin clicks delete button in data table row level for class
		Then Alert should have "No" button to reject for class
		
		@Class_TC_063
		Scenario: Validate accept in alert
		Given  Admin is on the manage class page in Class
		When Admin clicks yes button for class
		Then Success message and validate particular class details are deleted from the data table for class
		
		@Class_TC_064
		Scenario: Validate reject in alert
		Given   Admin is on the manage class page in Class
		When Admin clicks no button for class
		Then Admin should land on manage class page and validate particular class details are not deleted from the data table for class
		
		# Delete multiple Class validation
		@Class_TC_065
		Scenario: Verify delete multiple class  button is enabled
		Given  Admin is on the manage class page in Class
		When Admin clicks single  row level check box in the data table for class
		Then Admin should see delete icon below the header is enabled for class
		
		@Class_TC_066
		Scenario: verify tick mark is visible after clicking on check box
		Given  Admin is on the manage class page in Class
		When Admin clicks single  row level check box in the data table for class
		Then Admin should see tick mark in check box for class
		
		@Class_TC_067
		Scenario: verify admin able to click multiple check box
		Given  Admin is on the manage class page in Class 
		When Admin clicks multiple row level check box in the data table for class
		Then Admin should see tick mark in check box  of the selected rows for class
		
		@Class_TC_068
		Scenario: Verify accept alert in delete multiple class function by selecting single checkbox
		Given Admin clicks delete button under header after selecting the check box in the data table and admin is in the delete alert in class
		When Admin clicks yes button for class
		Then Success message and validate particular class details are deleted from the data table for class
		
		@Class_TC_069
		Scenario: Verify reject alert in delete multiple class function by selecting single checkbox
		Given Admin clicks delete button under header after selecting the check box in the data table and admin is in the delete alert in class
		When Admin clicks no button for class
		Then Admin should land on manage class page and validate particular class details are not deleted from the data table for class
		
		@Class_TC_070
		Scenario: Verify accept alert in delete multiple class function by selecting multiple checkbox
		Given Admin clicks delete button under header after selecting the check box in the data table and admin is in the delete alert in class
		When Admin clicks yes button for class
		Then Admin should land on manage class page and validate particular class details are deleted from the data table for class
		
		@Class_TC_071
		Scenario: Verify reject alert in delete multiple class function by selecting multiple checkbox
		Given Admin clicks delete button under header after selecting the check box in the data table and admin is in the delete alert in class
		When Admin clicks no button for class
		Then Admin should land on manage class page and validate particular class details are not deleted from the data table for class
		
		# Verify sort function in manage class page
		@Class_TC_072
		Scenario: Verify sort function in data table for descending order
		Given Admin is on the manage class page in Class
		When Admin click on Batch id column header to sort for class
		Then Admin should see data table sorted in descending order
		
		
		@Class_TC_073
		Scenario: Verify sort function in data table for ascending order
		Given Admin is on the manage class page in Class
		When Admin double click on Batch id column header to sort for class
		Then Admin should see data table sorted in ascending  order for class
		
		
		# Pagination in manage class
		@Class_TC_074
		Scenario: Verify sheet one is displayed on default in data table
		Given Logged on the LMS portal as Admin and Admin is on dashboard page after Login in class
		When Admin clicks "Class" button on the navigation bar for class
		Then Data table should display 1 page  when entries available for class 
		
		@Class_TC_075
		Scenario: Verify  right arrow is enabled when sheet one is displayed in data table
		Given Logged on the LMS portal as Admin and Admin is on dashboard page after Login in class
		When Admin clicks "Class" button on the navigation bar for class
		Then Right arrow should be enabled in page one  when entries are more than 5 available for class
		
		@Class_TC_076
		Scenario: Verify  left arrow is disabled when sheet one is displayed in data table
		Given Logged on the LMS portal as Admin and Admin is on dashboard page after Login in class
		When Admin clicks "Class" button on the navigation bar for class
		Then Left arrow should be disabled in page one  when entries are more than 5 available for class
		
		@Class_TC_077
		Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
		Given Logged on the LMS portal as Admin and Admin is on dashboard page after Login in class
		When Admin clicks "Class" button on the navigation bar for class
		Then Right arrow should be enabled in page two when entries are more than 10 available for class
		
		@Class_TC_078
		Scenario: Verify  left arrow is enable when sheet two is displayed in data table
		Given Logged on the LMS portal as Admin and Admin is on dashboard page after Login in class
		When Admin clicks "Class" button on the navigation bar for class
		Then Left arrow should be enabled in page two for class
		
		@Class_TC_079
		Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
		Given Logged on the LMS portal as Admin and Admin is on dashboard page after Login in class
		When Admin clicks "Class" button on the navigation bar for class
		Then Data table should display  page 1  when entries available for class
		
		@Class_TC_080
		Scenario: Verify pagination controls enabled
		Given Logged on the LMS portal as Admin and Admin is on dashboard page after Login in class
		When Admin clicks "Class" button on the navigation bar for class
		Then If entries are more than 5 in data table pagination controls enabled for class
		
		@Class_TC_081
		Scenario: Verify pagination controls disabled
		Given Logged on the LMS portal as Admin and Admin is on dashboard page after Login in class
		When Admin clicks "Class" button on the navigation bar for class
		Then If entries are less than 5 in data table pagination controls disabled for class
		
		@Class_TC_082
		Scenario: Verify next page is enabled
		Given Logged on the LMS portal as Admin and Admin is on dashboard page after Login in class
		When Admin clicks "Class" button on the navigation bar for class
		Then If total class entries above 5 next page is enabled ( On multiples of 5 new page will be enabled) for class
		
		@Class_TC_083
		Scenario: verify next page is disabled
		Given Logged on the LMS portal as Admin and Admin is on dashboard page after Login in class
		When Admin clicks "Class" button on the navigation bar for class
		Then If total class entries  5 or below next page is disabled for class
		
		# Navigation function validation from manage class page to other pages  
		@Class_TC_084
		Scenario Outline: Navigate to Different Pages from the Navigation Bar
		    Given Admin is on Manage Class page in class
		    When Admin clicks on "<LinkName>" link on Manage Class page for class
		    Then Admin is re-directed to "<DestinationPage>" page for class
		
			    Examples: 
		      | LinkName   | DestinationPage |
		      | Student    | Student         |
		      | Program    | Program         |
		      | Batch      | Batch           |
		      | User       | User            |
		      | Assignment | Assignment      |
		      | Attendance | Attendance      |
		      | Logout     | Login           |