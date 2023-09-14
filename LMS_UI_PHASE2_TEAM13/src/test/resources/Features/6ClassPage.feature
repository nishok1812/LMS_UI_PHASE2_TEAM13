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