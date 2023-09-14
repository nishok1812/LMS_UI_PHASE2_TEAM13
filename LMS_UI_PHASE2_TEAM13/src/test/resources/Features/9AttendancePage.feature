@Attendance_Module
Feature: The users ualidates the attendance page

	#Manage Attendance Page verification	
	@Attendance_TC_001
  Scenario: Admin able to validate the header of the Attendance page 
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should see the Manage attendance in header Attendance page
    
  @Attendance_TC_002
  Scenario: Admin able to Validate response time from dashboard page to attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin validates the Maximum navigation time in milliseconds defaults to 30 seconds Attendance page
    
  @Attendance_TC_003
  Scenario: Admin able to validate the broken link Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should get HTTP response >= 400. Then the link is broken Attendance page
    
  @Attendance_TC_004
  Scenario: Admin able to validate the LMS title Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should see LMS -Learning management system  as title Attendance page 

  @Attendance_TC_005
  Scenario: Admin able to validate the alignment of the Manage Attendance header
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should get Manage attendance header in left side of the page Attendance page 
    
   @Attendance_TC_006
   Scenario: Admin able to validate the text in manage attendancepage
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" button on the navigation bar and get all text from the portal page Attendance page
    Then  Admin should see correct spelling for the all the fields Attendance page

   @Attendance_TC_007
   Scenario: Admin able to validate the delete icon below the header Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should see disabled delete icon below the "Manage Attendance" Attendance page
    
   @Attendance_TC_008
   Scenario: Admin able to validate the search bar on the class page Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should see search bar on the attendance page Attendance page
    
   @Attendance_TC_009
   Scenario: Admin able to validate the  add new Attendance button on Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should see +Add New Attendance button on the attendance page
    
   @Attendance_TC_010
   Scenario: Admin able to validate the data table on the attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should see data table on the Manage Attendance Page With following column headers Check box symbol,Class ID, Student Id,Preasent, Edit Delete  Attendance page
    
   @Attendance_TC_011
   Scenario: Admin able to validate the Edit icon in the data table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should able to Edit Icon in each row of data table only  when entries are available Attendance page
    
   @Attendance_TC_012
   Scenario: Admin able to validate the Edit icon when no data in the table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin validates Edit Icon will not be present in data table Attendance page

   @Attendance_TC_013
   Scenario: Admin able to validate the delete icon in the data table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin validates Delete Icon in each row of data table only  when entries are available Attendance page
    
   @Attendance_TC_014
   Scenario: Admin able to validate the delete icon in the data table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin validates Delete Icon in each row of data table only  when entries are available Attendance page

   @Attendance_TC_015
   Scenario: Admin able to validate the delete icon when no data in the table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin cant see delete Icon in data table Attendance page
    
   @Attendance_TC_016
   Scenario: Admin able to validate the sort icon in the data table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should see sort icon near the column headers except for Edit and Delete Attendance page

   @Attendance_TC_017
   Scenario: Admin able to validate the check box in the data table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should see check box in the all rows  of data table Attendance page  

   @Attendance_TC_018
   Scenario: Admin able to validate the number entries displaying Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Above the footer Admin should see the text as "Showing x to y of z entries" below the table  Attendance page
    
   @Attendance_TC_019
   Scenario: Admin able to validate the Pagination control below the data table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should see the pagination controls under the data table Attendance page
    
   @Attendance_TC_020
   Scenario: Admin able to validate the footer  text  Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "Attendance" on the navigation bar Attendance page
    Then  Admin should see the text with total number classes in the data table  Attendance page
    
    
    #Attendance details popup window verification
    #Background:Admin is Manage attendance page after login
    
   @Attendance_TC_021
   Scenario: Admin able to validate all label text Attendance page  
    Given Admin is in manage attendance page
    When  Admin clicks + a new attendance button
    Then  Admin should see correct spellings in the label Attendance page
    
   @Attendance_TC_022
   Scenario: Admin able to validate dropdown box is present Attendance page 
    Given Admin is in manage attendance page
    When  Admin clicks + a new attendance button
    Then  Admin should see 4 dropdown is present Attendance page
    
   @Attendance_TC_023
   Scenario: Admin able to validate close button in attendance details popup window Attendance page 
    Given Admin is in manage attendance page
    When  Admin clicks + a new attendance button
    Then  Admin should see  close button on the attendance details popup window Attendance page
    
   @Attendance_TC_024
   Scenario: Admin able to validate the alignment of the close button Attendance page
    Given Admin is in manage attendance page
    When  Admin clicks + a new attendance button
    Then  Admin should see Close button should on the top right corner Attendance page
    
   @Attendance_TC_025
   Scenario: Admin able to validate the text on first dropdown select a program name Attendance page 
    Given Admin is in manage attendance page
    When  Admin clicks + a new attendance button
    Then  Admin should see First dropdown box "Select a Program Name" text is present  Attendance page 
    
   @Attendance_TC_026
   Scenario: Admin able to validate the text on second dropdown select class  name Attendance page  
    Given Admin is in manage attendance page
    When  Admin clicks + a new attendance button
    Then  Admin should see Second dropdown box "Select Class Name" text is present Attendance page
    
   @Attendance_TC_027
   Scenario: Admin able to validate the text on third dropdown select students Attendance page 
    Given Admin is in manage attendance page
    When  Admin clicks + a new attendance button
    Then  Admin should see Third dropdown box "Select Students" text is present Attendance page
    
   @Attendance_TC_028
   Scenario: Admin able to validate the text on fourth dropdown select students Attendance page 
    Given Admin is in manage attendance page
    When  Admin clicks + a new attendance button
    Then  Admin should see fourth dropdown box "Select Attendance" text is present Attendance page  
    
   @Attendance_TC_029
   Scenario: Admin able to validate all the text inside the dropdown box is gray color Attendance page 
    Given Admin is in manage attendance page
    When  Admin clicks + a new attendance button
    Then  Admin  should text in gray color Attendance page
    
   @Attendance_TC_030
   Scenario: Admin able to validate save button is present Attendance page
    Given Admin is in manage attendance page
    When  Admin clicks + a new attendance button
    Then  Admin should see  save button in the attendance detail popup window Attendance page

   @Attendance_TC_031
   Scenario: Admin able to validate cancel button is present Attendance page
    Given Admin is in manage attendance page
    When  Admin clicks + a new attendance button
    Then  Admin should see  cancel button in the attendance detail popup window Attendance page
    
     
    #Attendance details popup window verification
    #Background:Admin click +Add New Attendance button after reaching to Manage attendance page

   @Attendance_TC_032
   Scenario: Admin able to Validate all program name is reflecting in the dropdown Attendance page
    Given Admin is in  attendance details popup window Attendance page
    When  Admin clicks program name dropdown Attendance page
    Then  Program Name in the drop down should match with  program name in  manage program page table Attendance page
    
   @Attendance_TC_033
   Scenario: Admin able to Validate all class name  is reflecting in the dropdown Attendance page
    Given Admin is in  attendance details popup window Attendance page
    When  Admin clicks class name dropdown Attendance page
    Then  Class Name in the drop down should match with  class name in  manage class page table Attendance page
    
    @Attendance_TC_034
   Scenario: Admin able to Validate attendance field dropdown all mandatory keywords Attendance page
    Given Admin is in  attendance details popup window Attendance page
    When  Admin clicks Attendance dropdown Attendance page
    Then  Attendance field should have keywords such as - present, absent, late, excused Attendance page
    
    @Attendance_TC_035
   Scenario: Admin able to Validate spellings in the attendance field drop down Attendance page 
    Given Admin is in  attendance details popup window Attendance page
    When  Admin clicks Attendance dropdown Attendance page
    Then  Admin should see correct spellings in dropdown text Attendance page
    
     
    #Add new Attendance 
    #Background:Admin click +Add New Attendance button after reaching to Manage attendance page
 
   @Attendance_TC_036
   Scenario Outline: Admin able to Validate admin able to create new attendance data Attendance page
    Given Admin is in  attendance details popup window Attendance page
    When  Admin fills all the values from sheet "<Sheetname>" and <RowNumber> and click save Attendance page
    Then  Admin should see success message in popup window and sees new attendance details in manage attendance details DB Attendance page
    
       Examples: 
         |Sheetname   |RowNumber  | 
         |Attendance  |         1 | 
         
   @Attendance_TC_037
   Scenario Outline: Admin able to Validate admin able to create new attendance data without program name,class name,student name,attandance,attendance date
    Given Admin is in  attendance details popup window Attendance page
    When  Admin fills invalid values from sheet "<Sheetname>" and <RowNumber>  and click save Attendance page
    Then  Admin should see the "<Error>" Attendance page
    
        Examples: 
         |Sheetname   |RowNumber  | Error  											|
         |Attendance  |         2 | Program name is missing 		|
         |Attendance  |         3 | Class name is missing 		  |
         |Attendance  |         4 | Student name is missing 		|
         |Attendance  |         5 | Attendance is missing 		  |
         |Attendance  |         6 | Attendance date is missing 	|
         |Attendance  |         7 | invalid assignment date 		|
    

    #Edit Attendance 

   @Attendance_TC_038
   Scenario Outline: Admin able to Validate admin able to update  attendance data Attendance page
    Given Admin is in  attendance details popup window Attendance page
    When  Admin fills all the values from sheet "<Sheetname>" and <RowNumber> and click save Attendance page
    Then  Admin should see success message in popup window and sees new attendance details in manage attendance details DB
    
       Examples: 
         |Sheetname   |RowNumber  | 
         |Attendance  |         8 |     
 
    @Attendance_TC_039
   Scenario Outline: Admin able to Validate admin able to update attendance data without program name,class name,student name,attandance,attendance date
    Given Admin is in attendance details popup window Attendance page
    When  Admin fills invalid values from sheet "<Sheetname>" and <RowNumber>  and click save Attendance page
    Then  Admin should see the "<Error>" Attendance page
    
        Examples: 
         |Sheetname   |RowNumber    | Error  											|
         |Attendance  |          9  | Program name is missing  		|
         |Attendance  |         10  | Class name is missing 		  |
         |Attendance  |         11  | Student name is missing  		|
         |Attendance  |         12  | Attendance is missing 		  |
         |Attendance  |         13  | Attendance date is missing 	|
         |Attendance  |         14  | invalid assignment date 	  |
    
 	    #Delete attendance validation

   @Attendance_TC_040
   Scenario: Admin able to Validate Delete attendance alert Attendance page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks delete button in data table row level Attendance page
    Then  Admin should see alert Attendance page
    
   @Attendance_TC_041
   Scenario: Admin able to Validate accept enabled in alert Attendance page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks delete button in data table row level Attendance page
    Then  Alert should have "yes" button to accept Attendance page
    
   @Attendance_TC_042
   Scenario: Admin able to Validate reject enabled in alert Attendance page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks delete button in data table row level Attendance page
    Then  Alert should have "No" button to reject Attendance page
    
   @Attendance_TC_043
   Scenario: Admin able to Validate accept in alert Attendance page
    Given Admin is in delete alert Attendance page
    When  Admin clicks yes button Attendance page
    Then  Validate Success message and selected attendance details are deleted from the data table Attendance page 
  
   @Attendance_TC_044
   Scenario: Admin able to Validate reject in alert Attendance page
    Given Admin is in delete alert Attendance page
    When  Admin clicks no button Attendance page
    Then  User should get Redirected attendance page and selected attendance details are not deleted from the data table Attendance page
    
 	#Delete multiple attendance validation
 	
 	 @Attendance_TC_045
   Scenario: Admin able to Validate delete multiple class  button is enabled Attendance page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks single  row level check box in the data table Attendance page
    Then  Admin should see delete icon below the header is enabled Attendance page
    
 	 @Attendance_TC_046
   Scenario: Admin able to Validate tick mark is visible after clicking on check box for single data Attendance page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks single  row level check box in the data table Attendance page
    Then  Admin should see tick mark in check box Attendance page

 	 @Attendance_TC_047
   Scenario: Admin able to Validate admin able to click multiple check box Attendance page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks multiple row level check box in the data table Attendance page
    Then  Admin should see tick mark in check box  of the selected rows Attendance page
    
 	 @Attendance_TC_055
   Scenario: Admin able to Validate accept alert in delete multiple attendance by selecting single checkbox Attendance page
    Given Admin is in delete alert for multidelete Attendance page
    When  Admin clicks yes button Attendance page
    Then  Admin should get Success message and selected attendance detail are deleted from the data table Attendance page
    
 	 @Attendance_TC_048
   Scenario: Admin able to Validate reject alert in delete multiple attendance by selecting single checkbox Attendance page
    Given Admin is in delete alert for multidelete Attendance page
    When  Admin clicks no button Attendance page
    Then  Admin should get Redirected to attendance page and selected attendance details are not deleted from the data table Attendance page
    
 	 @Attendance_TC_049
   Scenario: Admin able to Validate accept alert in delete multiple attendance by selecting multiple checkbox Attendance page
    Given Admin is in delete alert for multidelete for multicheckbox Attendance page
    When  Admin clicks yes button Attendance page
    Then  Admin should get Success message and validate particular attendance details are deleted from the data table Attendance page
        
 	 @Attendance_TC_050
   Scenario: Admin able to Validate reject alert in delete multiple attendance by selecting multiple checkbox Attendance page
    Given Admin is in delete alert for multidelete for multicheckbox Attendance page
    When  Admin clicks no button Attendance page
    Then  Admin should get Redirected to attendance page and selected attendance details are not deleted from the data table Attendance page
          
    #Pagination in manage attendance
    
   @Attendance_TC_051
   Scenario: Admin able to Validate sheet one is displayed on default in data table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "attendance" button on the navigation bar Attendance page
    Then  Data table should display 1 page  when entries available Attendance page
    
   @Attendance_TC_052
   Scenario: Admin able to Validate right arrow is enable when sheet one is displayed in data table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "attendance" button on the navigation bar Attendance page
    Then  Right arrow should be enabled in page one  when entries are more than 5 available Attendance page
    
   @Attendance_TC_053
   Scenario: Admin able to Validate  left arrow is disable when sheet one is displayed in data table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "attendance" button on the navigation bar Attendance page
    Then  Left arrow should be disabled in page one  when entries are more than 5 available Attendance page
    
    
    @Attendance_TC_054
   Scenario: Admin able to Validate right arrow is enable when sheet two is displayed in data table when entries are more than 10 Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "attendance" button on the navigation bar Attendance page
    Then  Right arrow should be enabled in page two when entries are more than 10 available Attendance page
    
    
    @Attendance_TC_055
   Scenario: Admin able to Validate left arrow is enable when sheet two is displayed in data table Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "attendance" button on the navigation bar Attendance page
    Then  Left arrow should be enabled in page two  Attendance page
    
    @Attendance_TC_056
   Scenario: Admin able to Validate right arrow is disable when sheet two is displayed in data table when entries are less than 10 Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "attendance" button on the navigation bar Attendance page
    Then  Data table should display  page 2  when entries available Attendance page
    
    @Attendance_TC_057
   Scenario: Admin able to Validate pagination controls enabled Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "attendance" button on the navigation bar Attendance page
    Then  When entries are more than 5 in data table pagination controls enabled Attendance page
    
   @Attendance_TC_058
   Scenario: Admin able to Validate pagination controls disabled Attendance page
    Given Admin is on dashboard page after Login Attendance page
    When  Admin clicks "attendance" button on the navigation bar Attendance page
    Then  When entries are less than 5 in data table pagination controls disabled Attendance page
    
   @Attendance_TC_059
   Scenario Outline: Admin able to Validate next page is enabled Attendance page
    Given Admin is in add attendance details popup window Attendance page
    When  Admin creates 6 new attendance sheet "<Sheetname>" and <RowNumber> and click save Attendance page 
    Then  When total attendance entries above 5 next page is enabled  On multiples of 5 new page will be enabled  Attendance page
    
           Examples: 
         |Sheetname   |RowNumber   | 
         |Attendance  |         15 | 
         |Attendance  |         16 | 
         |Attendance  |         17 | 
         |Attendance  |         18 | 
         |Attendance  |         19 | 
         |Attendance  |         20 | 
         
         
         
   @Attendance_TC_060
   Scenario Outline: Admin able to Validate next page is disabled Attendance page
    Given Admin is in add attendance details popup window Attendance page
    When Admin creates 4 new attendance sheet "<Sheetname>" and <RowNumber> and click save Attendance page
    Then  Validates total attendance entries  5 or below next page is disabled Attendance page
    
               Examples: 
         |Sheetname   |RowNumber   | 
         |Attendance  |         21 | 
         |Attendance  |         22 | 
         |Attendance  |         23 | 
         |Attendance  |         24 | 

         
    #Navigation function validation from manage attendance page to other pages 
    
   @Attendance_TC_061
   Scenario: Verify admin is able to navigate from manage attendance to student page Attendance page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks "Student" button in the navigation bar Attendance page
    Then  Admin should able to land on student page Attendance page

   @Attendance_TC_062
   Scenario: Verify admin is able to navigate from manage attendance to program page Attendance page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks "Program" button in the navigation bar Attendance page
    Then  Admin should able to land on program page Attendance page
    
   @Attendance_TC_063
   Scenario: Verify admin is able to navigate from manage attendance to batch page Attendance page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks "Batch" button in the navigation bar Attendance page
    Then  Admin should able to land on batch page Attendance page
    
   @Attendance_TC_064
   Scenario: Verify admin is able to navigate from manage attendance to user page Attendance page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks "User" button in the navigation bar Attendance page
    Then  Admin should able to land on user page Attendance page
    
   @Attendance_TC_065
   Scenario: Verify admin is able to navigate from manage attendance to assignment page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks "Assignment" button in the navigation bar Attendance page
    Then  AAdmin should able to land on Assignment page Attendance page
    
   @Attendance_TC_066
   Scenario: Verify admin is able to navigate from manage attendance to class page
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks "class" button in the navigation bar Attendance page
    Then  Admin should able to land on class page Attendance page
    
   @Attendance_TC_067
   Scenario: Verify admin should able to do logout function from manage attendance
    Given Admin is in manage attendance page Attendance page
    When  Admin clicks "Logout" button in the navigation bar Attendance page
    Then Admin should able to land on login page Attendance page
    
